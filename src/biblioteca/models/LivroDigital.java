package models;

import java.time.LocalDate;

public class LivroDigital extends ItemMultimidia implements PrintInformacoes {
	//atributos
	private String formato;
	private String url;
	private String requisitos;
	private LocalDate dataDisponibilidade;
	private static int CONTADOR_EMPRESTIMOS=0;
	private static int CONTADOR_RESERVAS=0;

	//metodos
	@Override
	public void addCountEmprestimo() {
		this.CONTADOR_EMPRESTIMOS++;
	}
	//construtor
	public LivroDigital(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, boolean emprestado, boolean reservado, int numCopias,
			int numDisponivel, String formato, String url, String requisitos, LocalDate dataDisponibilidade,Integer id) throws ExcecaoItemJaCadastrado, ExcecaoDadosInvalidos {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa, emprestado, reservado, numCopias,
				numDisponivel,id);
		this.formato = formato;
		this.url = url;
		this.requisitos = requisitos;
		this.dataDisponibilidade = dataDisponibilidade;
		//add ao armazenamento da biblioteca
		try {
			ArmazenamentoBiblioteca.addItemMultimidia(this);
		}catch(ExcecaoItemJaCadastrado e) {
			System.err.println("Erro de inserção de dados: " + e.getMessage());
		}
	}
	
	//construtor vazio
	public LivroDigital() {};

	@Override
	//implementando o metodo de impressao das informações 
	public void printInfos() {
		System.out.println("Informações do livro digital:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nEditora: " + this.editora +
				"\nN° Cópias Disponíveis: " + this.numDisponivel +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao + "\n");
	}
	
	//	geters e seters
	public String getFormato() {
		return formato;
	}



	public void setFormato(String formato) {
		this.formato = formato;
	}



	public int getNumDisponivel() {
		return numDisponivel;
	}



	public void setNumDisponivel(int numDisponivel) {
		this.numDisponivel = numDisponivel;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getRequisitos() {
		return requisitos;
	}



	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}



	public LocalDate getDataDisponibilidade() {
		return dataDisponibilidade;
	}



	public void setDataDisponibilidade(LocalDate dataDisponibilidade) {
		this.dataDisponibilidade = dataDisponibilidade;
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
		String detalhes = "Informações do livro digital:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nEditora: " + this.editora +
				"\nN° Cópias Disponíveis: " + this.numDisponivel +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao + "\n";
		return detalhes;
	}
	

}
