package pessoas;

//esta é uma classe que encapsula as informaçoes de todas as pessoas do package
public class Identificacao { 
//	atributos
	private String nome;
	private String id;
	private String email;
	private String senha;
	
//	métodos
	
	
//	construtor
	public Identificacao(String nome, String id, String email, String senha) {
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	
	//getters e setters
	//principais gets
	public String getNome() {
		return nome;
	}
	public String getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
//	principais sets
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
