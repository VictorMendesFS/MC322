package itensMultimidia;

import java.time.LocalDate;

import procedimentos.Prints;

public class CD extends ItemMultimidia implements Prints{
	//atributos
	private String listaFaixas;
	private float duracao;
	private int numCopias;
	private int numDisponivel;
	private String estadoConvserv;
	
	
	//construtor
	public CD(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao, String genero,
			String sinopse, String capa, String listaFaixas, float duracao, int numCopias, int numDisponivel,
			String estadoConvserv) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa);
		this.listaFaixas = listaFaixas;
		this.duracao = duracao;
		this.numCopias = numCopias;
		this.numDisponivel = numDisponivel;
		this.estadoConvserv = estadoConvserv;
	}



	@Override
	//implementando o metodo de impressao das informações 
	public void printInfos() {
		System.out.println("Informações do CD:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nN° Cópias Disponíveis: " + this.numDisponivel);

	}


//	geters e seters
	public String getListaFaixas() {
		return listaFaixas;
	}



	public float getDuracao() {
		return duracao;
	}



	public int getNumCopias() {
		return numCopias;
	}



	public int getNumDisponivel() {
		return numDisponivel;
	}



	public String getEstadoConvserv() {
		return estadoConvserv;
	}



	public void setListaFaixas(String listaFaixas) {
		this.listaFaixas = listaFaixas;
	}



	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}



	public void setNumCopias(int numCopias) {
		this.numCopias = numCopias;
	}



	public void setNumDisponivel(int numDisponivel) {
		this.numDisponivel = numDisponivel;
	}



	public void setEstadoConvserv(String estadoConvserv) {
		this.estadoConvserv = estadoConvserv;
	}

}
