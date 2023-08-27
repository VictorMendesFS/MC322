package itensMultimidia;

import procedimentos.Prints;

public class LivroFisico extends ItemMultimidia implements Prints{
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
				"\nAutores: " + this.autores +
				"\nEditora: " + this.editora +
				"\nEdicao: " + this.edicao +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nN° de Páginas: " + this.tamanho +
				"\nISBN: " + this.isbn +
				"\nCódigo: " + this.getCodigo() + 
				"\nStatus: " + this.getStatusString() + "\n");
	}
	
	
}
