package itensMultimidia;

import java.time.LocalDate;

import procedimentos.Relatorios;

public class LivroFisico extends ItemMultimidia implements Relatorios{
	//atributos
	private String isbn;	
	private int edicao;
	private int numCopias;
	private int numDisponivel;
	private String localizacao;
	private String estadoConserv;
	private static int CONTADOR_EMPRESTIMOS=0;


	public LivroFisico(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, boolean disponibilidade, boolean reservado, String isbn,
			int edicao, int numCopias, int numDisponivel, String localizacao, String estadoConserv) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa, disponibilidade, reservado);
		this.isbn = isbn;
		this.edicao = edicao;
		this.numCopias = numCopias;
		this.numDisponivel = numDisponivel;
		this.localizacao = localizacao;
		this.estadoConserv = estadoConserv;
	}

	@Override

	public void addCountEmprestimo() {
		CONTADOR_EMPRESTIMOS++;
	}
	//implementando o metodo de impressao das informações 
	public void printInfos() {
		System.out.println("Informações do livro físico:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nedicao: " + this.edicao +
				"\nEdicao: " + this.edicao +
				"\nIdioma: " + this.idioma +
				"\nN° Cópias Disponíveis: " + this.numDisponivel +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nISBN: " + this.isbn);
	}

	
	//	geters e seters

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
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

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getEstadoConserv() {
		return estadoConserv;
	}

	public void setEstadoConserv(String estadoConserv) {
		this.estadoConserv = estadoConserv;
	}
	public static int getCONTADOR_EMPRESTIMOS() {
		return CONTADOR_EMPRESTIMOS;
	}

	public static void setCONTADOR_EMPRESTIMOS(int cONTADOR_EMPRESTIMOS) {
		CONTADOR_EMPRESTIMOS = cONTADOR_EMPRESTIMOS;
	}




}
