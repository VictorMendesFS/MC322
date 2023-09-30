package controllers;

import java.util.ArrayList;
import java.util.List;

import models.*;

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
    ExcecaoLimiteEmprestimoExcedido, ExcecaoItemNaoDisponivel,ExcecaoMultasPendentes{
    	//tratamento de exceção de limite de emprestimos
        if(membro.getNumEmprestimosVigentes()==membro.getLimiteEmprestimo()) {
        	throw new ExcecaoLimiteEmprestimoExcedido("Limite de Emprestimos atingido");
        }
        else if(item.isEmprestado()) {//exceçao de item ja emprestado
        	throw new ExcecaoItemNaoDisponivel("Item não disponível");
        }
        else if(membro.getMultaAtraso()>=0) {
        	throw new ExcecaoMultasPendentes("Membro possui multas pendentes");
        }
    	new Emprestimo(item, membro);
        return true;
    }

    @Override
    public boolean devolverItem(Membro membro, ItemMultimidia item) 
    		throws ExcecaoItemNaoEmprestado, ExcecaoItemDanificado{
    	//se o material nao foi emprestado por ultimo ao membro
        if(item.getHistoricoEmprestimos().get(item.getHistoricoEmprestimos().size()-1)
        		.getEmprestante() != membro) {
        	throw new ExcecaoItemNaoEmprestado("Material nao foi emprestado ao membro");
        }
        else if(item.getEstadoConserv() == "danificado") {
        	throw new ExcecaoItemDanificado("Item danificado");
        }
        //lógica de devolução
        return true;
    }
}