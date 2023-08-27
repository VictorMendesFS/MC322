package itensMultimidia;

import procedimentos.Prints;

public class CD extends ItemMultimidia implements Prints{
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
		System.out.println("Informações do CD:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autores +
				"\nEdicao: " + this.edicao +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nTamanho do Arquivo (Kb): " + this.tamanho +
				"\nTipo de CD: " + this.tipo +
				"\nCódigo: " + this.getCodigo() + 
				"\nStatus: " + this.getStatusString() + "\n");

	}

}
