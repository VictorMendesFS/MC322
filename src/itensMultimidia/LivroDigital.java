package itensMultimidia;

public class LivroDigital extends ItemMultimidia {
	//atributos
	private String editora;
	private String isbn;	
	
	//metodos
	
	//construtor
	public LivroDigital(String titulo, String autores, int edicao, String idioma, int tamanho, String dataPublicacao, String codigo,
			boolean status, String editora, String isbn) {
		super(titulo, autores, edicao, idioma, tamanho, dataPublicacao, codigo, status);
		this.editora=editora;
		this.isbn=isbn;
	}

	@Override
	//implementando o metodo de impressao das informações 
	public void printInfos() {
		System.out.println("Informações do livro digital:\n" +
				"Título: " + this.getTitulo() + 
				"\n Autores: " + this.autores +
				"\n Edicao: " + this.edicao +
				"\n Editora: " + this.editora +
				"\n Idioma: " + this.idioma +
				"\n Data de Publicação: " + this.dataPublicacao +
				"\n Tamanho do Arquivo (Kb): " + this.tamanho +
				"\n ISBN: " + this.isbn +
				"\nCódigo: " + this.getCodigo() + 
				"\nStatus: " + this.getStatus() + "\n");
	}

}
