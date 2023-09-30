package  controllers;

import java.util.List;

import models.*;
import  views.BibliotecaView;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item) throws ExcecaoLimiteEmprestimoExcedido, ExcecaoItemNaoDisponivel, ExcecaoMultasPendentes;
    boolean devolverItem(Membro membro, ItemMultimidia item) throws ExcecaoItemNaoEmprestado, ExcecaoItemDanificado;
}