package main;
import java.time.LocalDate;
import itensMultimidia.*;
import pessoas.*;
import procedimentos.*;

public class Main {

	public static void main(String[] args) {
		//		Esta implementação de teste consiste em:
		//		Instanciar um item multimidia de cada tipo em listas
		//		Instanciar uma pessoa e atribuir a ela os materiais multimidia via emprestimos
		//		Realizar operações de devolução, renovação e reserva de itens
		//		imprimir as informações dos obj e pessoas instanciadas

		//OS PRINTS ESTÃO COMENTADOS, CASO QUEIRAM OBSERVAR AS SAÍDAS

		//livros fisicos
		LivroFisico lf1 = new LivroFisico("Livro Físico Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP","PT-BR", LocalDate.of(2023, 8, 1), 
				"Material Didático","Livro sobre os conteitos básicos de OO em JAVA","CAPA",false, false, 
				8, 8, "aass336541", 1, "Estante A, Fileira 1", "NOVO");
		//armazenamento do material
		ArmazenamentoBiblioteca.getLivrosFisicos().add(lf1);

		//livros digitais
		LivroDigital ld1 = new LivroDigital("Livro digital Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP","PT-BR", LocalDate.of(2023, 8, 1), 
				"Material Didático","Livro sobre os conteitos básicos de OO em JAVA","CAPA",false, false,
				20,20,"PDF","unicamp.br", "PC",  LocalDate.of(2023, 8, 1));
		ArmazenamentoBiblioteca.getLivrosDigitais().add(ld1);

		//DVDs
		DVD dvd1 = new DVD("DVD: Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP","PT-BR", LocalDate.of(2023, 8, 1), 
				"Material Didático","Livro sobre os conteitos básicos de OO em JAVA","CAPA",false, false,
				6, 6,"CAFEO, B.", 3600, "NOVO");
		ArmazenamentoBiblioteca.getDvds().add(dvd1);

		//CDs
		CD cd1 = new CD("CD: Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP","PT-BR", LocalDate.of(2023, 8, 1), 
				"Material Didático","Livro sobre os conteitos básicos de OO em JAVA","CAPA",false, false,
				4, 4,"1. Introdução \n 2. Tipos de objetos\n", 68,  "NOVO");
		ArmazenamentoBiblioteca.getCds().add(cd1);

		//Outros recursos
		OutroRecursoMultimidia or1 = new OutroRecursoMultimidia("Banner: Aprendendo JAVA", "CAFEO, B.", "Ed. UNICAMP","PT-BR", LocalDate.of(2023, 8, 1), 
				"Material Didático","Livro sobre os conteitos básicos de OO em JAVA","CAPA",false, false,
				1, 1,"Banner", "Banner",  "Galpao principal", "Semi Novo");
		ArmazenamentoBiblioteca.getOutrosRecursos().add(or1);

		//imprimir todos os itens de cada lista usando loop foreach
		System.out.println("Itens multimidia cadastrados:\n");
		for(LivroFisico item:ArmazenamentoBiblioteca.getLivrosFisicos()) {
			item.printInfos();
		}
		for(LivroDigital item:ArmazenamentoBiblioteca.getLivrosDigitais()) {
			item.printInfos();
		}
		for(DVD item:ArmazenamentoBiblioteca.getDvds()) {
			item.printInfos();
		}
		for(CD item:ArmazenamentoBiblioteca.getCds()) {
			item.printInfos();
		}
		for(OutroRecursoMultimidia item:ArmazenamentoBiblioteca.getOutrosRecursos()) {
			item.printInfos();
		}

		//instanciação de pessoas em listas

		EstudanteGrad eg1 = new EstudanteGrad("Victor Silva", "206574", "Rua a n° 1", "v206574@dac.unicamp.br", LocalDate.of(2017, 03, 01));
		ArmazenamentoBiblioteca.getEstudantesGrad().add(eg1);
		EstudantePos ep1 = new EstudantePos("jose gomes", "111111", "Rua b n° 2", "joseg@gmail.com", LocalDate.of(2020, 05, 12));
		ArmazenamentoBiblioteca.getEstudantesPos().add(ep1);
		Professor p1 = new Professor("Bruno Cafeo", "222222", "Rua C n° 3", "cafeo@unicamp.br", LocalDate.of(2015, 02, 10));
		ArmazenamentoBiblioteca.getProfessores().add(p1);
		Funcionario f1 = new Funcionario("Ana Luiza", "333333", "Rua D n° 4", "Analuiza@unicamp.br", LocalDate.now(), PerfilFuncionario.ADMINISTRADOR);
		ArmazenamentoBiblioteca.getFuncionarios().add(f1);
		Funcionario f2 = new Funcionario("Joao Souza", "444444", "Rua E n° 5", "jsouza@unicamp.br", LocalDate.now(), PerfilFuncionario.ATENDENTE);
		ArmazenamentoBiblioteca.getFuncionarios().add(f2);


		//criar lista de emprestimos e atribuir às pessoas e atribuir ao relatório da biblioteca

		//emprestando livro fisico 1 para aluno de grad 1
		Emprestimo e1 = new Emprestimo("001", StatusEmprestimo.VIGENTE, ArmazenamentoBiblioteca.procurarItemMultimidia("Livro Físico Aprendendo JAVA"), 
				ArmazenamentoBiblioteca.procurarPessoa("206574"), LocalDate.now());
		RelatorioAvancadoAndEstatisticas.getHistoricoEmprestimos().add(e1);
		//livro digital 1 e dvd 1 para estudante pós
		Emprestimo e2 = new Emprestimo("002", StatusEmprestimo.VIGENTE, ArmazenamentoBiblioteca.procurarItemMultimidia("Livro digital Aprendendo JAVA"), 
				ArmazenamentoBiblioteca.procurarPessoa("111111"), LocalDate.now());
		Emprestimo e3 = new Emprestimo("003", StatusEmprestimo.VIGENTE, ArmazenamentoBiblioteca.procurarItemMultimidia("DVD: Aprendendo JAVA"), 
				ArmazenamentoBiblioteca.procurarPessoa("111111"), LocalDate.now());
		RelatorioAvancadoAndEstatisticas.getHistoricoEmprestimos().add(e2);
		RelatorioAvancadoAndEstatisticas.getHistoricoEmprestimos().add(e3);
		//cd1 para professor
		Emprestimo e4 = new Emprestimo("004", StatusEmprestimo.VIGENTE,  ArmazenamentoBiblioteca.procurarItemMultimidia("CD: Aprendendo JAVA"), 
				ArmazenamentoBiblioteca.procurarPessoa("222222"), LocalDate.now());
		RelatorioAvancadoAndEstatisticas.getHistoricoEmprestimos().add(e4);	

		//imprimir infos das pessoas
		System.out.println("Pessoas cadastradas e seus respectivos emprestimos:\n");
		for(EstudanteGrad item: ArmazenamentoBiblioteca.getEstudantesGrad()) {
			item.printInfos();
		}
		for(EstudantePos item: ArmazenamentoBiblioteca.getEstudantesPos()) {
			item.printInfos();
		}
		for(Professor item: ArmazenamentoBiblioteca.getProfessores()) {
			item.printInfos();
		}
		for(Funcionario item: ArmazenamentoBiblioteca.getFuncionarios()) {
			item.printInfos();
		}

		//operações de devolução, renovação e reserva de materiais pelas pessoas

		//estudante de pós faz uma devolução
		ArmazenamentoBiblioteca.procurarPessoa("111111").removerEmprestimo(
				RelatorioAvancadoAndEstatisticas.procurarEmprestimo("002"));
		//estudante grad faz uma renovação
		ArmazenamentoBiblioteca.procurarPessoa("206574").renovarEmprestimo(
				RelatorioAvancadoAndEstatisticas.procurarEmprestimo("001"));
		//funcionário faz uma reserva do item renovado pelo estudante de grad
		RelatorioAvancadoAndEstatisticas.procurarEmprestimo("001").getMaterialEmprestado().
		criarReserva(ArmazenamentoBiblioteca.procurarPessoa("333333"));

		System.out.println("Pessoas cadastradas e seus respectivos emprestimos:\n");
		for(EstudanteGrad item: ArmazenamentoBiblioteca.getEstudantesGrad()) {
			item.printInfos();
		}
		for(EstudantePos item: ArmazenamentoBiblioteca.getEstudantesPos()) {
			item.printInfos();
		}
		for(Professor item: ArmazenamentoBiblioteca.getProfessores()) {
			item.printInfos();
		}
		for(Funcionario item: ArmazenamentoBiblioteca.getFuncionarios()) {
			item.printInfos();
		}


		//relatorios avançados e estatísticas da biblioteca
		//print de todos os emprestimos realizados
		RelatorioAvancadoAndEstatisticas.printHistoricoTotalDeEmprestimos();
	}
}
