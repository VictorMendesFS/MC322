
public class Membro {
	//atributos
	private String nome;
	private String id;
	private String email;
	private String senha;
	private int numEmprestimos;
	private String emprestimos[];
	
	//metodos
	
	
//	construtor
	public Membro(String nome,String id,String email,String senha,int numEmprestimos) {
		this.nome=nome;
		this.id=id;
		this.email=email;
		this.senha=senha;
		this.numEmprestimos=numEmprestimos;
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
	public int getnumEmprestimos() {
		return numEmprestimos;
	}
	//principais sets
	public void setNumEmprestimos(int numEmprestimos){
		this.numEmprestimos = numEmprestimos;		
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
