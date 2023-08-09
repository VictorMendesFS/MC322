
public class Funcionario {
	//atributos
	private String nome;
	private String id;
	private String setor;
	
	//métodos
	
	
	//construtor
	public Funcionario(String nome, String id, String setor) {
		this.nome = nome;
		this.id = id;
		this.setor = setor;
	}
	
	//getters e setters
	//principais gets
	public String getNome() {
		return nome;
	}
	public String getId() {
		return id;
	}
	public String getSetor() {
		return setor;
	}
	//principais sets
	public void setSetor(String setor) {
		this.setor = setor;
	}
}
