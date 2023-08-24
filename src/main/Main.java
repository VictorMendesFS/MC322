package main;
import itensMultimidia.*;
import pessoas.*;
import procedimentos.*;

public class Main {

	public static void main(String[] args) {
//		Esta implementação de teste consiste em:
//		Instanciar um item multimidia de cada tipo
//		Instanciar uma pessoa de cada tipo
		
		
		//instanciar um novo objeto livro1 atraves da classe Livro
		LivroFisico livroFisico1 = new LivroFisico("Aprendendo JAVA", "CAFEO, B.", 1, "PT-BR", 230, "ago/2023", "abc123", false, "Ed. UNICAMP", "aass336541");
		LivroDigital livroDigital1 = new LivroDigital("Aprendendo JAVA - Edição Digital", "CAFEO, B.", 1, "PT-BR", 250, "ago/2023", "abc123", false, "Ed. UNICAMP", "aass336541");
		//informações do livro antes do empréstimo
		livroFisico1.printInfos();
		livroDigital1.printInfos();
		
		//instanciar um novo Membro 
//		Membro membro1 = new Membro("Victor M.F. Silva","206574","v206574@dac.unicamp.br","aa12345");
		
//		//instanciar novo funcionario
//		Funcionario funcionario1 = new Funcionario("Roberto", "316547","r316547@dac.unicamp.br",
//				"senha321","Biblioteconomia");
//		
//		
	}
}
