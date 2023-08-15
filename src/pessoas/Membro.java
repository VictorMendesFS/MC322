package pessoas;
import procedimentos.*;


public class Membro {
	//atributos
	private Identificacao cadastro;
	private int numEmprestimos;
	private Emprestimo emprestimos[]; //armazena os empréstimos, será implementado futuramente
	
	//metodos
	
//	construtor
	public Membro(String nome,String id,String email,String senha) {
		cadastro = new Identificacao(nome, id, email, senha);
		this.numEmprestimos=0;
	}
	
	//getters e setters
	//principais gets
	public String getNome() {
		return cadastro.getNome();
	}
	public String getId() {
		return cadastro.getId();
	}
	public String getEmail() {
		return cadastro.getEmail();
	}
	public int getnumEmprestimos() {
		return numEmprestimos;
	}
	//principais sets
	public void setNumEmprestimos(int numEmprestimos){
		this.numEmprestimos = numEmprestimos;		
	}
	public void setEmail(String email) {
		this.cadastro.setEmail(email);
	}
	public void setSenha(String senha) {
		this.cadastro.setSenha(senha);
	}
	
	//encapsulamento do print das infos
	public void printInfosMembro() {
		System.out.println("informações do membro: \n"+
				"Nome: "+ this.getNome() +
				"\nId: " + this.getId() +
				"\nEmail: "+ this.getEmail() + 
				"\nNumero de emprestimos: "+ this.getnumEmprestimos()+ "\n");
	}
}
