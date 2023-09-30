package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Emprestimo;
import models.ExcecaoLimiteEmprestimoExcedido;
import models.ItemMultimidia;
import models.Membro;

public class BibliotecaControllerImpl implements BibliotecaController {
    private List<ItemMultimidia> itens;

    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
    }

    @Override
    public List<ItemMultimidia> consultarItensDisponiveis() {
        return itens;
    }

    @Override
    public boolean emprestarItem(Membro membro, ItemMultimidia item) throws 
    ExcecaoLimiteEmprestimoExcedido{
    	//tratamento de exceção de limite de emprestimos
        if(membro.getNumEmprestimosVigentes()==membro.getLimiteEmprestimo()) {
        	throw new ExcecaoLimiteEmprestimoExcedido("Limite de Emprestimos atingido");
        }
    	new Emprestimo(item, membro);
        return true;
    }

    @Override
    public boolean devolverItem(Membro membro, ItemMultimidia item) {
        // Lógica de devolução
        return true;
    }
}