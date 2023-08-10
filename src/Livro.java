
public class Livro {
	//atributos
	private String titulo;
	private String autores;
	private int edicao;
	private String idioma;
	private String dataPublicacao; //Como armazenar data?
	private int paginas;
	private String isbn;
	private boolean status;
	private String codigo;
	
	//metodos
	
	
	//construtor
	public Livro(String titulo, String autores, int edicao, String idioma, 
			String dataPublicacao, int paginas, String isbn, boolean status, String codigo) {
		this.titulo = titulo;
		this.autores = autores;
		this.edicao = edicao;
		this.idioma = idioma;
		this.dataPublicacao = dataPublicacao;
		this.paginas = paginas;
		this.isbn = isbn;
		this.status = status;
		this.codigo = codigo;
	}
	
	//getters e setters
	//principais gets
	public String getTitulo() {
		return titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getStatus() {
		if(this.status)
			return "Emprestado";
		else
			return "Disponível";
	}
	
	//principais sets
	public void setStatusEmprestado() { //true = livro emprestado
		this.status = true;		
	}
	public void setStatusDisponivel() {	//false = livro disponível
		this.status = false;
	}
}
