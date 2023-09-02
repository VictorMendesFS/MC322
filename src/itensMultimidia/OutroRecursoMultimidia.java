package itensMultimidia;

import java.time.LocalDate;

public class OutroRecursoMultimidia extends ItemMultimidia {
	//atributos
	private String tipo;
	private String formato;
	private String localizacao;
	private String estadoConvserv;
	private static int CONTADOR_EMPRESTIMOS=0;

	
	//construtor
	public OutroRecursoMultimidia(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, boolean emprestado, boolean reservado, int numCopias,
			int numDisponivel, String tipo, String formato, String localizacao, String estadoConvserv) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa, emprestado, reservado, numCopias,
				numDisponivel);
		this.tipo = tipo;
		this.formato = formato;
		this.localizacao = localizacao;
		this.estadoConvserv = estadoConvserv;
	}

	//metodos
	@Override
	public void addCountEmprestimo() {
		this.CONTADOR_EMPRESTIMOS++;
	}

	public void printInfos() {
		System.out.println("Informações do Recurso multimídia:\n" +
				"Título: " + this.getTitulo() + 
				"\nAutores: " + this.autor +
				"\nEditora: " +this.editora +
				"\nTipo: " + this.tipo +
				"\nIdioma: " + this.idioma +
				"\nN° Cópias Disponíveis: " + this.numDisponivel +
				"\nData de Publicação: " + this.dataPublicacao +
				"\nLocalização: " + this.localizacao + "\n");
	}

	//geters e seters
	public String getTipo() {
		return tipo;
	}

	public String getFormato() {
		return formato;
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

	public String getEstadoConvserv() {
		return estadoConvserv;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setFormato(String formato) {
		this.formato = formato;
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

	public void setEstadoConvserv(String estadoConvserv) {
		this.estadoConvserv = estadoConvserv;
	}


}
