
public class Main {

	public static void main(String[] args) {
		//instanciar um novo objeto livro1 atraves da classe Livro
		Livro livro1 = new Livro("Aprendendo Orientação a Objetos","Autor1",5, "português", 
				"01/01/2000", 200, "0201704331", "disponível", "123465");
		//instanciar um novo Membro 
		Membro membro1 = new Membro("Victor","206574","v206574@dac.unicamp.br","aa12345",0);
		//instanciar um novo emprestimo
		Emprestimo emprestimo1 = new Emprestimo("abc123", "vigente", "123456", 
				"206574","08/08/2023", "15/08/2023");
		//instanciar novo funcionario
		Funcionario funcionario1 = new Funcionario("Roberto", "316547", "Biblioteconomia");
		
		//Acessando atributos dos objetos (gets)
		printInfosLivro(livro1);
		printInfosMembro(membro1);
		printInfosEmprestimo(emprestimo1);
		printInfosFuncionario(funcionario1);
		
		//Modificando atributos (sets)
		livro1.setStatusEmprestado();
		livro1.setStatusDisponivel();
		
		//QUAIS MÉTODOS IMPLEMENTAR? ALGO POR ENQUANTO 'SIMBÓLICO' - UM PRINT, COMO NO 
		//EXEMPLO DO CARRO - OU ALGUMA MODIFICAÇÃO DE STATUS (LIVRO EMPRESTADO, numEMPRESTIMOS)
		//ENTRE AS CLASSES.

		//COMO FAZER UPLOAD PARA O GITHUB?
		
	}
	public static void printInfosLivro(Livro livro) {
		System.out.println("Informações do livro:\n" +
				"Título: " + livro.getTitulo() + 
				"\nCódigo:" + livro.getCodigo() + 
				"\nStatus:" + livro.getStatus() + "\n");
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
				"\nCodigo do Livro emprestado: " + emprestimo.getCodigoLivro() +
				"\nId Emprestante: " + emprestimo.getIdEmprestante() +
				"\nData de emprestimo: " + emprestimo.getDataEmprestimo() +
				"\nData de devolução: " + emprestimo.getDataDevolucao()+ "\n");
	}
	public static void printInfosFuncionario(Funcionario funcionario) {
		System.out.println("informações do(a) funcionário(a): \n"+
				"Nome: " + funcionario.getNome() +
				"\nId: " + funcionario.getId() +
				"\nSetor: " + funcionario.getSetor()+ "\n");
	}
}
