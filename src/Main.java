import pessoas.*;
import procedimentos.*;
import objetos.*;

public class Main {

	public static void main(String[] args) {
//		Esta implementação de teste consiste em:
//		Instanciar um novo Membro;
//		Instanciar um novo Livro;
//		Instanciar um novo Funcionário (que por enquanto não possui relevancia);
//		Emprestar o livro ao membro através de um novo Emprestimo;
//		Imprimir as informações sobre os objetos;
		
		
		//instanciar um novo objeto livro1 atraves da classe Livro
		Livro livro1 = new Livro("Aprendendo Orientação a Objetos","Autor1",5, "português", 
				"01/01/2000", 200, "0201704331", false, "123465");
		//informações do livro antes do empréstimo
		printInfosLivro(livro1);
				
		//instanciar um novo Membro 
		Membro membro1 = new Membro("Victor M.F. Silva","206574","v206574@dac.unicamp.br","aa12345");
		
		//instanciar novo funcionario
		Funcionario funcionario1 = new Funcionario("Roberto", "316547", "Biblioteconomia");
		
		
		//instanciar um novo emprestimo e atribuir o livro1 ao membro1 na própria construção do objeto
		Emprestimo emprestimo1 = new Emprestimo("abc123", "vigente", livro1, 
				membro1,"12/08/2023", "19/08/2023");
		
		//Acessando e imprimindo os atributos dos objetos (gets)
		System.out.println("APÓS EMPRESTAR O LIVRO\n");
		printInfosLivro(livro1);
		printInfosMembro(membro1);
		printInfosEmprestimo(emprestimo1);
		printInfosFuncionario(funcionario1);
		
//		Simulando a devolução do livro:
		emprestimo1.setStatusEmprestimo("finalizado");
		
		//impressão dos atributos após a devolução
		System.out.println("APÓS A DEVOLUÇÃO DO LIVRO\n");
		printInfosLivro(livro1);
		printInfosMembro(membro1);
		printInfosEmprestimo(emprestimo1);
	}
	//subrotinas para impressão dos atributos dos objetos.
	public static void printInfosLivro(Livro livro) {
		System.out.println("Informações do livro:\n" +
				"Título: " + livro.getTitulo() + 
				"\nCódigo: " + livro.getCodigo() + 
				"\nStatus: " + livro.getStatus() + "\n");
	}
	public static void printInfosMembro(Membro membro) {
		System.out.println("informações do membro: \n"+
				"Nome: "+ membro.getNome() +
				"\nId: " + membro.getId() +
				"\nEmail: "+ membro.getEmail() + 
				"\nNumero de emprestimos: "+ membro.getnumEmprestimos()+ "\n");
	}
	public static void printInfosEmprestimo(Emprestimo emprestimo) {
		System.out.println("informações do empréstimo: \n"+
				"Codigo do emprestimo: "+ emprestimo.getCodigoEmprestimo() + 
				"\nStatus: " + emprestimo.getStatus() +
				"\nTitulo do Livro emprestado: " + emprestimo.getLivroEmprestado().getTitulo() +
				"\nEmprestante / ID: " + emprestimo.getEmprestante().getNome() + 
				" / " + emprestimo.getEmprestante().getId() +
				"\nData de empréstimo: " + emprestimo.getDataEmprestimo() +
				"\nData de devolução: " + emprestimo.getDataDevolucao()+ "\n");
	}
	public static void printInfosFuncionario(Funcionario funcionario) {
		System.out.println("informações do(a) funcionário(a): \n"+
				"Nome: " + funcionario.getNome() +
				"\nId: " + funcionario.getId() +
				"\nSetor: " + funcionario.getSetor()+ "\n");
	}
}
