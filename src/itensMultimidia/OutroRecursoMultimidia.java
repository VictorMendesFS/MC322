package itensMultimidia;

import java.time.LocalDate;

public class OutroRecursoMultimidia extends ItemMultimidia {
	//atributos
	private String tipo;
	private String formato;
	private int numCopias;
	private int numDisponivel;
	private String localizacao;
	private String estadoConvserv;
	private static int CONTADOR_EMPRESTIMOS=0;

	//metodos
	@Override
	public void addCountEmprestimo() {
		this.CONTADOR_EMPRESTIMOS++;
	}
	
	public OutroRecursoMultimidia(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, boolean disponibilidade, boolean reservado, String tipo,
			String formato, int numCopias, int numDisponivel, String localizacao, String estadoConvserv) {
		super(titulo, autor, editora, idioma, dataPublicacao, genero, sinopse, capa, disponibilidade, reservado);
		this.tipo = tipo;
		this.formato = formato;
		this.numCopias = numCopias;
		this.numDisponivel = numDisponivel;
		this.localizacao = localizacao;
		this.estadoConvserv = estadoConvserv;
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
