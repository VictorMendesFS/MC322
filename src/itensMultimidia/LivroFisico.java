package itensMultimidia;

public class LivroFisico extends ItemMultimidia{
	//atributos
	private String editora;
	private String isbn;	
	
	//construtor
	public LivroFisico(String titulo, String autores, int edicao, String idioma, int tamanho,
			String dataPublicacao,String codigo, boolean status,
			String editora, String isbn) {
		super(titulo, autores, edicao, idioma, tamanho, dataPublicacao, codigo,status);		
		this.isbn = isbn;
		this.editora=editora;
		}	
	//metodos
	
	@Override
	//implementando o metodo de impressao das informações 
	public void printInfos() {
		System.out.println("Informações do livro físico:\n" +
				"Título: " + this.getTitulo() + 
				"\n Autores: " + this.autores +
				"\n Editora: " + this.editora +
				"\n Edicao: " + this.edicao +
				"\n Idioma: " + this.idioma +
				"\n Data de Publicação: " + this.dataPublicacao +
				"\n N° de Páginas: " + this.tamanho +
				"\n ISBN: " + this.isbn +
				"\nCódigo: " + this.getCodigo() + 
				"\nStatus: " + this.getStatus() + "\n");
	}
	
	
}
