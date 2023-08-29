package itensMultimidia;

import java.time.LocalDate;

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
	
//	metodos

//	construtor
	public ItemMultimidia(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.idioma = idioma;
		this.dataPublicacao = dataPublicacao;
		this.genero = genero;
		this.sinopse = sinopse;
		this.capa = capa;
	}


//	getters e setters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public String getIdioma() {
		return idioma;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public String getGenero() {
		return genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public String getCapa() {
		return capa;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	
}
	