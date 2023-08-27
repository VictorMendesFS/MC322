package itensMultimidia;

import procedimentos.Prints;

public class DVD extends ItemMultimidia implements Prints {
	//atributos
	String resolucao;
	
	public DVD(String titulo, String autores, int edicao, String idioma, int tamanho, String dataPublicacao, String codigo,
			boolean status, String resolucao) {
		super(titulo, autores, edicao, idioma, tamanho, dataPublicacao, codigo, status);
		this.resolucao=resolucao;
	}

	@Override
	public void printInfos() {
		System.out.println("Informações do DVD:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autores +
				"\nEdicao: " + this.edicao +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nTamanho do Arquivo (Mb): " + this.tamanho +
				"\nResolução: " + this.resolucao +
				"\nCódigo: " + this.getCodigo() + 
				"\nStatus: " + this.getStatusString() + "\n");

	}


}
