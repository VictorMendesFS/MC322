package pessoas;

public class Funcionario {
	//atributos
	private Identificacao cadastro;
	private String setor;
	
	//métodos
	
	
	//construtor
	public Funcionario(String nome,String id,String email,String senha, String setor) {
		cadastro = new Identificacao(nome, id, email, senha);
		this.setor = setor;
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
	public String getSetor() {
		return setor;
	}
	//principais sets
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void setEmail(String email) {
		this.cadastro.setEmail(email);
	}
	public void setSenha(String senha) {
		this.cadastro.setSenha(senha);
	}
	
	//encapsulamento do print das infos dessa classe
	public void printInfosFuncionario() {
		System.out.println("informações do(a) funcionário(a): \n"+
				"Nome: " + this.getNome() +
				"\nId: " + this.getId() +
				"\nEmail: "+ this.getEmail() + 
				"\nSetor: " + this.getSetor()+ "\n");
	}
	
}
