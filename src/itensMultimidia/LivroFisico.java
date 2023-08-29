package itensMultimidia;

import java.time.LocalDate;

import procedimentos.Prints;

public class LivroFisico extends ItemMultimidia implements Prints{
	//atributos
	private String isbn;	
	private int edicao;
	private int numCopias;
	private int numDisponivel;
	private String localizacao;
	private String estadoConserv;
	
	public LivroFisico(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, String isbn, int edicao, int numCopias, int numDisponivel,
			String localizacao, String estadoConserv) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa);
		this.isbn = isbn;
		this.edicao = edicao;
		this.numCopias = numCopias;
		this.numDisponivel = numDisponivel;
		this.localizacao = localizacao;
		this.estadoConserv = estadoConserv;
	}

	//metodos
	
	@Override
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

	public int getEdicao() {
		return edicao;
	}

	public int getNumCopias() {
		return numCopias;
	}

	public int getNumDisponivel() {
		return numDisponivel;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public String getEstadoConserv() {
		return estadoConserv;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public void setNumCopias(int numCopias) {
		this.numCopias = numCopias;
	}

	public void setNumDisponivel(int numDisponivel) {
		this.numDisponivel = numDisponivel;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void setEstadoConserv(String estadoConserv) {
		this.estadoConserv = estadoConserv;
	}
	
	
}
