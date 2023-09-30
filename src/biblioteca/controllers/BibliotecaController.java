package  controllers;

import java.util.List;

import models.ExcecaoItemNaoDisponivel;
import models.ExcecaoItemNaoEmprestado;
import models.ExcecaoLimiteEmprestimoExcedido;
import models.ExcecaoMultasPendentes;
import  models.ItemMultimidia;
import  models.Membro;
import  views.BibliotecaView;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item) throws ExcecaoLimiteEmprestimoExcedido, ExcecaoItemNaoDisponivel, ExcecaoMultasPendentes;
    boolean devolverItem(Membro membro, ItemMultimidia item) throws ExcecaoItemNaoEmprestado;
}