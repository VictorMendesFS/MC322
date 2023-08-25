package main;
import java.time.LocalDate;

import itensMultimidia.*;
import pessoas.*;
import procedimentos.*;

public class Main {

	public static void main(String[] args) {
//		Esta implementação de teste consiste em:
//		Instanciar um item multimidia de cada tipo
//		Instanciar uma pessoa e atribuir a ela os materiais multimidia
//		imprimir as informações dos obj e pessoas instanciadas
		
		
		//instanciação de itens multimídia
		LivroFisico livroFisico1 = new LivroFisico("Aprendendo JAVA", "CAFEO, B.", 1, "PT-BR", 230, "ago/2023", "abc123", false, "Ed. UNICAMP", "aass336541");
		LivroDigital livroDigital1 = new LivroDigital("Aprendendo JAVA - Edição Digital", "CAFEO, B.", 1, "PT-BR", 250, "ago/2023", "abc123", false, "Ed. UNICAMP", "aass336541");
		CD cd1 = new CD("Audiobook JAVA", "CAFEO, B.", 2, "PT-BR", 2370, "jul/2022", "zzxx6654", false, 0, "CD-R");
		DVD dvd1 = new DVD("Videobook JAVA", "CAFEO, B.", 2, "PT-BR", 16578, "jul/2022", "zzxx6654", false, "HD");
		//informações dos itens
//		System.out.println("Impressão dos itens instanciados:\n");
//		livroFisico1.printInfos();
//		livroDigital1.printInfos();
//		cd1.printInfos();
//		dvd1.printInfos();
//		
		//instanciar um aluno de grad. e um prof.
		EstudanteGrad estudanteGrad1 = new EstudanteGrad("Victor M.F. Silva","206574","v206574@dac.unicamp.br","aa12345", "Eng. Controle e Automação");
		Professor professor1 = new Professor("Bruno Cafeo", "123456", "cafeo@ic.unicamp.br", "cafeo321", "Instituto de Computação UNICAMP");
		//imprimindo as infos das pessoas
		estudanteGrad1.printInfos();
		professor1.printInfos();
		
//		criar novos emprestimos e atribui para o estudante e o prof
		Emprestimo emprestimo1 = new Emprestimo("001", "vigente", livroFisico1, estudanteGrad1, LocalDate.now());
		Emprestimo emprestimo2 = new Emprestimo("002", "vigente", dvd1, estudanteGrad1, LocalDate.now());
		Emprestimo emprestimo3 = new Emprestimo("003", "vigente", livroDigital1, professor1, LocalDate.now());
		
		System.out.println("Após realizar os emprestimos:\n");
		estudanteGrad1.printInfos();
		professor1.printInfos();
		
//		manipulação de emprestimos
		estudanteGrad1.removerEmprestimo(emprestimo1);
		estudanteGrad1.renovarEmprestimo(emprestimo2);
		professor1.removerEmprestimo(emprestimo3);
		
		System.out.println("Após finalizar os emprestimos:\n");
		estudanteGrad1.printInfos();
		professor1.printInfos();
	}
}
