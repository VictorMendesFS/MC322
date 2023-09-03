package main;

import java.time.LocalDate;
import itensMultimidia.*;
import pessoas.*;
import procedimentos.*;

public class Main {

	public static void main(String[] args) {
		// Esta implementação de teste consiste em:
		// Instanciar um item multimidia de cada tipo em listas
		// Instanciar uma pessoa e atribuir a ela os materiais multimidia via
		// emprestimos
		// Realizar operações de devolução, renovação e reserva de itens
		// imprimir as informações dos obj e pessoas instanciadas

		// ****OS PRINTS ESTÃO COMENTADOS, CASO QUEIRAM OBSERVAR AS SAÍDAS***********

		// instanciação dos itens da biblioteca
		
		// os construtores das classes já adicionam as informações ao Armazenamento da
		// biblioteca, portanto, não é necessário guardar sua instancia em um atributo
		// específico

		new LivroFisico("Livro Físico Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP", "PT-BR", LocalDate.of(2023, 8, 1),
				"Material Didático", "Livro sobre os conteitos básicos de OO em JAVA", "CAPA", false, false, 8, 8,
				"aass336541", 1, "Estante A, Fileira 1", "NOVO");

		new LivroDigital("Livro digital Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP", "PT-BR", LocalDate.of(2023, 8, 1),
				"Material Didático", "Livro sobre os conteitos básicos de OO em JAVA", "CAPA", false, false, 20, 20,
				"PDF", "unicamp.br", "PC", LocalDate.of(2023, 8, 1));

		new DVD("DVD: Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP", "PT-BR", LocalDate.of(2023, 8, 1),
				"Material Didático", "Livro sobre os conteitos básicos de OO em JAVA", "CAPA", false, false, 6, 6,
				"CAFEO, B.", 3600, "NOVO");

		new CD("CD: Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP", "PT-BR", LocalDate.of(2023, 8, 1),
				"Material Didático", "Livro sobre os conteitos básicos de OO em JAVA", "CAPA", false, false, 4, 4,
				"1. Introdução \n 2. Tipos de objetos\n", 68, "NOVO");

		new OutroRecursoMultimidia("Banner: Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP", "PT-BR",
				LocalDate.of(2023, 8, 1), "Material Didático", "Livro sobre os conteitos básicos de OO em JAVA", "CAPA",
				false, false, 1, 1, "Banner", "Banner", "Galpão principal", "Semi Novo");

		// imprimir todos os itens de cada tipo

		// System.out.println("Itens multimidia cadastrados:\n");
		// for (LivroFisico item : ArmazenamentoBiblioteca.getLivrosFisicos()) {
		// item.printInfos();
		// }
		// for (LivroDigital item : ArmazenamentoBiblioteca.getLivrosDigitais()) {
		// item.printInfos();
		// }
		// for (DVD item : ArmazenamentoBiblioteca.getDvds()) {
		// item.printInfos();
		// }
		// for (CD item : ArmazenamentoBiblioteca.getCds()) {
		// item.printInfos();
		// }
		// for (OutroRecursoMultimidia item :
		// ArmazenamentoBiblioteca.getOutrosRecursos()) {
		// item.printInfos();
		// }

		// instanciação de pessoas

		new EstudanteGrad("Victor Silva", "206574", "Rua a n° 1", "v206574@dac.unicamp.br", LocalDate.of(2017, 03, 01));
		new EstudantePos("jose gomes", "111111", "Rua b n° 2", "joseg@gmail.com", LocalDate.of(2020, 05, 12));
		new Professor("Bruno Cafeo", "222222", "Rua C n° 3", "cafeo@unicamp.br", LocalDate.of(2015, 02, 10));
		new Funcionario("Ana Luiza", "333333", "Rua D n° 4", "Analuiza@unicamp.br", LocalDate.now(),
				PerfilFuncionario.ADMINISTRADOR);
		new Funcionario("Joao Souza", "444444", "Rua E n° 5", "jsouza@unicamp.br", LocalDate.now(),
				PerfilFuncionario.ATENDENTE);

		// criar lista de emprestimos e atribuir às pessoas e atribuir ao relatório da
		// biblioteca

		// emprestando livro fisico para aluno de grad
		new Emprestimo("001", StatusEmprestimo.VIGENTE,
				ArmazenamentoBiblioteca.procurarItemMultimidia("Livro Físico Aprendendo JAVA"),
				ArmazenamentoBiblioteca.procurarPessoa("206574"), LocalDate.now());
		// livro digital e dvd para estudante pós
		new Emprestimo("002", StatusEmprestimo.VIGENTE,
				ArmazenamentoBiblioteca.procurarItemMultimidia("Livro digital Aprendendo JAVA"),
				ArmazenamentoBiblioteca.procurarPessoa("111111"), LocalDate.now());
		new Emprestimo("003", StatusEmprestimo.VIGENTE,
				ArmazenamentoBiblioteca.procurarItemMultimidia("DVD: Aprendendo JAVA"),
				ArmazenamentoBiblioteca.procurarPessoa("111111"), LocalDate.now());
		//CD para professor
		new Emprestimo("004", StatusEmprestimo.VIGENTE,
				ArmazenamentoBiblioteca.procurarItemMultimidia("CD: Aprendendo JAVA"),
				ArmazenamentoBiblioteca.procurarPessoa("222222"), LocalDate.now());

		// imprimir infos das pessoas
		// System.out.println("Pessoas cadastradas e seus respectivos emprestimos:\n");
		// for (EstudanteGrad item : ArmazenamentoBiblioteca.getEstudantesGrad()) {
		// item.printInfos();
		// }
		// for (EstudantePos item : ArmazenamentoBiblioteca.getEstudantesPos()) {
		// item.printInfos();
		// }
		// for (Professor item : ArmazenamentoBiblioteca.getProfessores()) {
		// item.printInfos();
		// }
		// for (Funcionario item : ArmazenamentoBiblioteca.getFuncionarios()) {
		// item.printInfos();
		// }

		// operações de devolução, renovação e reserva de materiais pelas pessoas

		// estudante de pós faz uma devolução
		ArmazenamentoBiblioteca.procurarPessoa("111111")
				.removerEmprestimo(ArmazenamentoBiblioteca.procurarEmprestimo("002"));
		// estudante grad faz uma renovação
		ArmazenamentoBiblioteca.procurarPessoa("206574")
				.renovarEmprestimo(ArmazenamentoBiblioteca.procurarEmprestimo("001"));
		// funcionário faz uma reserva do item renovado pelo estudante de grad
		ArmazenamentoBiblioteca.procurarEmprestimo("001").getMaterialEmprestado()
				.criarReserva(ArmazenamentoBiblioteca.procurarPessoa("333333"));

		// System.out.println("Pessoas cadastradas e seus respectivos emprestimos:\n");
		// for (EstudanteGrad item : ArmazenamentoBiblioteca.getEstudantesGrad()) {
		// item.printInfos();
		// }
		// for (EstudantePos item : ArmazenamentoBiblioteca.getEstudantesPos()) {
		// item.printInfos();
		// }
		// for (Professor item : ArmazenamentoBiblioteca.getProfessores()) {
		// item.printInfos();
		// }
		// for (Funcionario item : ArmazenamentoBiblioteca.getFuncionarios()) {
		// item.printInfos();
		// }

		// Relatorios avançados e estatísticas da biblioteca (os outros serão implementados em breve)
		
		// print de todos os emprestimos realizados
		// RelatorioAvancadoAndEstatisticas.printHistoricoTotalDeEmprestimos();
		
		//print relatório de itens disponíveis
		// RelatorioAvancadoAndEstatisticas.relatorioDeDisponibilidadeDeItens();

	}
}
