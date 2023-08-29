package itensMultimidia;

import java.time.LocalDate;

import procedimentos.Prints;

public class LivroDigital extends ItemMultimidia implements Prints {
	//atributos
	private String formato;
	private int numDisponivel;
	private String url;
	private String requisitos;
	private LocalDate dataDisponibilidade;
	
	//construtor
	
	public LivroDigital(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, String formato, int numDisponivel, String url,
			String requisitos, LocalDate dataDisponibilidade) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa);
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


	public int getNumDisponivel() {
		return numDisponivel;
	}


	public String getUrl() {
		return url;
	}


	public String getRequisitos() {
		return requisitos;
	}


	public LocalDate getDataDisponibilidade() {
		return dataDisponibilidade;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}


	public void setNumDisponivel(int numDisponivel) {
		this.numDisponivel = numDisponivel;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}


	public void setDataDisponibilidade(LocalDate dataDisponibilidade) {
		this.dataDisponibilidade = dataDisponibilidade;
	}

	
}
