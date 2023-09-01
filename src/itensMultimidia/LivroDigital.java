package itensMultimidia;

import java.time.LocalDate;

import procedimentos.Relatorios;

public class LivroDigital extends ItemMultimidia implements Relatorios {
	//atributos
	private String formato;
	private int numDisponivel;
	private String url;
	private String requisitos;
	private LocalDate dataDisponibilidade;
	private static int CONTADOR_EMPRESTIMOS=0;

	//metodos
	@Override
	public void addCountEmprestimo() {
		this.CONTADOR_EMPRESTIMOS++;
	}
	//construtor
	public LivroDigital(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, boolean disponibilidade, boolean reservado, String formato,
			int numDisponivel, String url, String requisitos, LocalDate dataDisponibilidade) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa, disponibilidade, reservado);
		this.formato = formato;
		this.numDisponivel = numDisponivel;
		this.url = url;
		this.requisitos = requisitos;
		this.dataDisponibilidade = dataDisponibilidade;
	}



	@Override
	//implementando o metodo de impressao das informações 
	public void printInfos() {
		System.out.println("Informações do livro digital:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nEditora: " + this.editora +
				"\nIdioma: " + this.idioma +
				"\nData de Publicação: " + this.dataPublicacao);
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

}
