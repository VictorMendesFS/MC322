package itensMultimidia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import procedimentos.Emprestimo;

public abstract class ItemMultimidia {
	//	atributos
	protected String titulo;
	protected String autor;
	protected String editora;
	protected String idioma;
	protected LocalDate dataPublicacao;
	protected String genero;
	protected String sinopse;
	protected String capa; //a imagem será implementada futuramente
	protected boolean emprestado; //TRUE = EMPRESTADO, INDISPONIVEL
	protected boolean reservado; //TRUE = RESERVADO, INDISPONIVEL
	protected List<Emprestimo> hitoricoEmprestimos = new ArrayList<>();
	
	//	construtor
	public ItemMultimidia(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, boolean disponibilidade, boolean reservado) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.idioma = idioma;
		this.dataPublicacao = dataPublicacao;
		this.genero = genero;
		this.sinopse = sinopse;
		this.capa = capa;
		this.emprestado = disponibilidade;
		this.reservado = reservado;
	}
	
	//	metodos
	public void addEmprestimo(Emprestimo emprestimo) {
		//add ao histórico
		this.hitoricoEmprestimos.add(emprestimo);
		//aumenta a contagem de emprestimos
		emprestimo.getMaterialEmprestado().addCountEmprestimo();
		//o coloca como emprestado
		emprestimo.getMaterialEmprestado().setEmprestado(true);
	}
	
//	public void addDevolucao(Emprestimo emprestimo);
	
	public abstract void addCountEmprestimo();
	
	//	getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean disponibilidade) {
		this.emprestado = disponibilidade;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public List<Emprestimo> getHitoricoEmprestimos() {
		return hitoricoEmprestimos;
	}

	public void setHitoricoEmprestimos(List<Emprestimo> hitoricoEmprestimos) {
		this.hitoricoEmprestimos = hitoricoEmprestimos;
	}
}
