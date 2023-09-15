package  controllers;

import java.util.List;

import  models.ItemMultimidia;
import  models.Membro;
import  views.BibliotecaView;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item);
    boolean devolverItem(Membro membro, ItemMultimidia item);
}