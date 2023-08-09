
public class Livro {
	//atributos
	private String titulo;
	private String autores;
	private int edicao;
	private String idioma;
	private String dataPublicacao; //Como armazenar data?
	private int paginas;
	private String isbn;
	private String status;
	private String codigo;
	
	//metodos
	
	
	//construtor
	public Livro(String titulo, String autores, int edicao, String idioma, 
			String dataPublicacao, int paginas, String isbn, String status, String codigo) {
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
		return status;
	}
	
	//principais sets
		public void setStatusEmprestado() {
			this.status = "emprestado";
		}
		public void setStatusDisponivel() {
			this.status = "disponível";
		}
}
