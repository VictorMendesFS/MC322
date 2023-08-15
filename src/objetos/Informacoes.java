package objetos;

public class Informacoes {
//	atributos
	private String titulo;
	private String autores;
	private int edicao;
	private String idioma;
	private String dataPublicacao; //Como armazenar data?
	private int paginas;
	
//	metodos
	
//	construtor
	public Informacoes(String titulo, String autores,int edicao,
			String idioma,String dataPublicacao,int paginas) {
		this.titulo = titulo;
		this.autores=autores;
		this.edicao=edicao;
		this.idioma=idioma;
		this.dataPublicacao=dataPublicacao;
		this.paginas=paginas;
	}
	
//	getters e setters
	//gets
	public String getTitulo() {
		return titulo;
	}
	//sets
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
}
