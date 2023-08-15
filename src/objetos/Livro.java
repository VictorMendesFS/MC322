package objetos;

public class Livro {
	//atributos
	private Informacoes infos;
	private String isbn;
	private boolean status;
	private String codigo;
	
	//metodos
	
	
	//construtor
	public Livro(String titulo, String autores, int edicao, String idioma, 
			String dataPublicacao, int paginas, String isbn, boolean status, String codigo) {
		infos = new Informacoes(titulo, autores, edicao, idioma, dataPublicacao, paginas);
		this.isbn = isbn;
		this.status = status;
		this.codigo = codigo;
	}
	
	//getters e setters
	//principais gets
	public String getCodigo() {
		return codigo;
	}
	public String getStatus() {
		if(this.status)
			return "Emprestado";
		else
			return "Disponível";
	}
	public String getTitulo() {
		return this.infos.getTitulo();
	}
	
	//principais sets
	public void setStatusEmprestado() { //true = livro emprestado
		this.status = true;		
	}
	public void setStatusDisponivel() {	//false = livro disponível
		this.status = false;
	}
	
	//encapsulamento do print: printInfosLivro
	public void printInfosLivro() {
		System.out.println("Informações do livro:\n" +
				"Título: " + this.infos.getTitulo() + 
				"\nCódigo: " + this.getCodigo() + 
				"\nStatus: " + this.getStatus() + "\n");
	}
}
