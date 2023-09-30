package models;

import java.time.LocalDate;

public class LivroFisico extends ItemMultimidia implements PrintInformacoes{
	//atributos
	private String isbn;	
	private int edicao;
	private String localizacao;
	private static int CONTADOR_EMPRESTIMOS=0;
	private static int CONTADOR_RESERVAS=0;


	public LivroFisico(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, boolean emprestado, boolean reservado, 
			int numCopias, int numDisponivel, String isbn, int edicao, String localizacao, String estadoConserv,Integer id) throws ExcecaoItemJaCadastrado, ExcecaoDadosInvalidos {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa, emprestado, reservado, numCopias,
				numDisponivel,id);
		this.isbn = isbn;
		this.edicao = edicao;
		this.localizacao = localizacao;
		
		try {
			ArmazenamentoBiblioteca.addItemMultimidia(this);
		}catch(ExcecaoItemJaCadastrado e) {
			System.err.println("Erro de inserção de dados: " + e.getMessage());
		}
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
				"\nEditora: " +this.editora +
				"\nEdicao: " + this.edicao +
				"\nIdioma: " + this.idioma +
				"\nN° Cópias Disponíveis: " + this.numDisponivel +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nISBN: " + this.isbn +
				"\nLocalização: " + this.localizacao + "\n");
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
	@Override
	public String getDetalhes() {
		return "Informações do livro físico:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nEditora: " +this.editora +
				"\nEdicao: " + this.edicao +
				"\nIdioma: " + this.idioma +
				"\nN° Cópias Disponíveis: " + this.numDisponivel +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nISBN: " + this.isbn +
				"\nLocalização: " + this.localizacao + "\n";
	}




}
