package itensMultimidia;

import java.time.LocalDate;

import procedimentos.Relatorios;

public class DVD extends ItemMultimidia implements Relatorios {
	//atributos
	private String elenco;
	private float duracao;
	private int numCopias;
	private int numDisponivel;
	private String estadoConvserv;
	private static int CONTADOR_EMPRESTIMOS=0;

	//metodos
	@Override
	public void addCountEmprestimo() {
		this.CONTADOR_EMPRESTIMOS++;
	}
	//construtor
	public DVD(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao, String genero,
			String sinopse, String capa, boolean disponibilidade, boolean reservado, String elenco, float duracao,
			int numCopias, int numDisponivel, String estadoConvserv) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa, disponibilidade, reservado);
		this.elenco = elenco;
		this.duracao = duracao;
		this.numCopias = numCopias;
		this.numDisponivel = numDisponivel;
		this.estadoConvserv = estadoConvserv;
	}



	@Override
	public void printInfos() {
		System.out.println("Informações do CD:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nN° Cópias Disponíveis: " + this.numDisponivel);

	}
	//	geters e seters
	public String getelenco() {
		return elenco;
	}



	public void setelenco(String elenco) {
		this.elenco = elenco;
	}



	public float getDuracao() {
		return duracao;
	}



	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}



	public int getNumCopias() {
		return numCopias;
	}



	public void setNumCopias(int numCopias) {
		this.numCopias = numCopias;
	}



	public int getNumDisponivel() {
		return numDisponivel;
	}



	public void setNumDisponivel(int numDisponivel) {
		this.numDisponivel = numDisponivel;
	}



	public String getEstadoConvserv() {
		return estadoConvserv;
	}



	public void setEstadoConvserv(String estadoConvserv) {
		this.estadoConvserv = estadoConvserv;
	}




}
