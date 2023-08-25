package main;
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
		
		//instanciar uma nova pessoa 
		EstudanteGrad estudanteGrad1 = new EstudanteGrad("Victor M.F. Silva","206574","v206574@dac.unicamp.br","aa12345", "Eng. Controle e Automação");
		estudanteGrad1.printInfos();
//		//instanciar novo funcionario
//		Funcionario funcionario1 = new Funcionario("Roberto", "316547","r316547@dac.unicamp.br",
//				"senha321","Biblioteconomia");
		

//		criar novos emprestimos e atribui para o estudante
		Emprestimo emprestimo1 = new Emprestimo("001", "vigente", livroFisico1, estudanteGrad1, "25/08/2023", "02/09/2023");
		Emprestimo emprestimo2 = new Emprestimo("002", "vigente", dvd1, estudanteGrad1, "25/08/2023", "02/09/2023");
		Emprestimo emprestimo3 = new Emprestimo("003", "vigente", livroDigital1, estudanteGrad1, "25/08/2023", "02/09/2023");
		System.out.println("Após realizar os emprestimos:\n");
		estudanteGrad1.printInfos();
		
		//finaliza o emprestimo do livro Físico do estudante
		estudanteGrad1.removerEmprestimo(emprestimo1.getCodigoEmprestimo());
		System.out.println("Após finalizar o emprestimo:\n");
		estudanteGrad1.printInfos();
		//remove o restante dos emprestimos
		estudanteGrad1.removerEmprestimo("003");
		estudanteGrad1.removerEmprestimo("002");
		estudanteGrad1.printInfos();		
	}
}
