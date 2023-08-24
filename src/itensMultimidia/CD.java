package itensMultimidia;

public class CD extends ItemMultimidia {
	//atributos
	String tipo;
	public CD(String titulo, String autores, int edicao, String idioma, int tamanho, String dataPublicacao, String codigo,
			boolean status, float tamanhoArquivo,String tipo) {
		super(titulo, autores, edicao, idioma, tamanho, dataPublicacao, codigo, status);
		this.tipo=tipo;
	}

	@Override
	//implementando o metodo de impressao das informações 
	public void printInfos() {
		System.out.println("Informações do livro físico:\n" +
				"Título: " + this.getTitulo() + 
				"\n Autores: " + this.autores +
				"\n Edicao: " + this.edicao +
				"\n Idioma" + this.idioma +
				"\n Data de Publicação: " + this.dataPublicacao +
				"\n Tamanho do Arquivo (Kb): " + this.tamanho +
				"\n Tipo de CD: " + this.tipo +
				"\nCódigo: " + this.getCodigo() + 
				"\nStatus: " + this.getStatus() + "\n");

	}

}
