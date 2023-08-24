package itensMultimidia;

public class DVD extends ItemMultimidia {
	//atributos
	String resolucao;
	
	public DVD(String titulo, String autores, int edicao, String idioma, int tamanho, String dataPublicacao, String codigo,
			boolean status, String resolucao) {
		super(titulo, autores, edicao, idioma, tamanho, dataPublicacao, codigo, status);
		this.resolucao=resolucao;
	}

	@Override
	public void printInfos() {
		// TODO Auto-generated method stub

	}

}
