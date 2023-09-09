package views;

import java.util.List;

import models.ItemMultimidia;

public interface BibliotecaView {
    void mostrarItensDisponiveis(List<ItemMultimidia> itens);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}