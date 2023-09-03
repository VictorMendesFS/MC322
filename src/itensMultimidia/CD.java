package itensMultimidia;

import java.time.LocalDate;

import procedimentos.ArmazenamentoBiblioteca;
import procedimentos.PrintInformacoes;

public class CD extends ItemMultimidia implements PrintInformacoes{
	//atributos
	private String listaFaixas;
	private float duracao;
	private String estadoConvserv;
	private static int CONTADOR_EMPRESTIMOS=0;
	private static int CONTADOR_RESERVAS=0;

	//construtor
	public CD(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao, String genero,
			String sinopse, String capa, boolean emprestado, boolean reservado, int numCopias, int numDisponivel,
			String listaFaixas, float duracao, String estadoConvserv) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa, emprestado, reservado, numCopias,
				numDisponivel);
		this.listaFaixas = listaFaixas;
		this.duracao = duracao;
		this.estadoConvserv = estadoConvserv;
		
		ArmazenamentoBiblioteca.getCds().add(this);
	}



	//metodos
	@Override
	public void addCountEmprestimo() {
		this.CONTADOR_EMPRESTIMOS++;
	}
	@Override
	//implementando o metodo de impressao das informações 
	public void printInfos() {
		System.out.println("Informações do CD:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nN° Cópias Disponíveis: " + this.numDisponivel + "\n");

	}
	//	geters e seters
	public String getListaFaixas() {
		return listaFaixas;
	}

	public void setListaFaixas(String listaFaixas) {
		this.listaFaixas = listaFaixas;
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



	public static int getCONTADOR_EMPRESTIMOS() {
		return CONTADOR_EMPRESTIMOS;
	}



	public static void setCONTADOR_EMPRESTIMOS(int cONTADOR_EMPRESTIMOS) {
		CONTADOR_EMPRESTIMOS = cONTADOR_EMPRESTIMOS;
	}



	public static int getCONTADOR_RESERVAS() {
		return CONTADOR_RESERVAS;
	}



	public static void setCONTADOR_RESERVAS(int cONTADOR_RESERVAS) {
		CONTADOR_RESERVAS = cONTADOR_RESERVAS;
	}	
}
