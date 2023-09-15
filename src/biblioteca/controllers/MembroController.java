package controllers;

import java.util.List;

import models.Membro;
import views.MembroView;

public interface MembroController {
    List<Membro> listarMembros();
    Membro buscarMembroPorIdentificacao(String identificacao);
}