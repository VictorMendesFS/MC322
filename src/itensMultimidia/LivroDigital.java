package itensMultimidia;

import procedimentos.Prints;

public class LivroDigital extends ItemMultimidia implements Prints {
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
				"\nAutores: " + this.autores +
				"\nEdicao: " + this.edicao +
				"\nEditora: " + this.editora +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nTamanho do Arquivo (Kb): " + this.tamanho +
				"\nISBN: " + this.isbn +
				"\nCódigo: " + this.getCodigo() + 
				"\nStatus: " + this.getStatusString() + "\n");
	}

}
