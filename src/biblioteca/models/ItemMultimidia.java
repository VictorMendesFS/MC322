package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.*;



public abstract class ItemMultimidia implements PrintInformacoes,InterfaceItemMultimidia{
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
	protected List<Emprestimo> historicoEmprestimos = new ArrayList<>();
	protected int numCopias;
	protected int numDisponivel;
	protected int numReservas=0;
	protected int numEmprestimos=0;
	protected Integer id;
	protected List<Comentario> comentarios = new ArrayList<>();
	protected List<Reserva> reservas = new ArrayList<>();
	protected String estadoConserv;
	
	//implementar a lista de reservas do item futuramente

	//	construtor
	public ItemMultimidia(String titulo, String autor, String editora, String idioma, LocalDate dataPublicacao,
			String genero, String sinopse, String capa, boolean emprestado, boolean reservado, int numCopias,
			int numDisponivel, Integer id) throws ExcecaoItemJaCadastrado {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.idioma = idioma;
		this.dataPublicacao = dataPublicacao;
		this.genero = genero;
		this.sinopse = sinopse;
		this.capa = capa;
		this.emprestado = emprestado;
		this.reservado = reservado;
		this.numCopias = numCopias;
		this.numDisponivel = numDisponivel;
		this.id = id;
		try {
			ArmazenamentoBiblioteca.addItemMultimidia(this);
		}catch(ExcecaoItemJaCadastrado e) {
			System.err.println("Erro de inserção de dados: " + e.getMessage());
		}catch(ExcecaoDadosInvalidos e) {
			System.err.println("Erro de inserção de dados: "+ e.getMessage());
		}
	}

	//	metodos
	public void addEmprestimo(Emprestimo emprestimo) {
		//add ao histórico
		this.historicoEmprestimos.add(emprestimo);
		//aumenta a contagem de emprestimos do tipo de item
		emprestimo.getMaterialEmprestado().addCountEmprestimo();
		//aumenta a contagem de emprestimos do item especifido
		this.numEmprestimos++;
		//o coloca como emprestado
		emprestimo.getMaterialEmprestado().setEmprestado(true);

	}
	
	//metodos abstratos
	//aumenta o contador de emprestimos de um item
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

	public List<Emprestimo> getHistoricoEmprestimos() {
		return historicoEmprestimos;
	}

	public void sethistoricoEmprestimos(List<Emprestimo> historicoEmprestimos) {
		this.historicoEmprestimos = historicoEmprestimos;
	}

	public int getNumCopias() {
		return numCopias;
	}

	public int getNumDisponivel() {
		return numDisponivel;
	}

	public void setHistoricoEmprestimos(List<Emprestimo> historicoEmprestimos) {
		this.historicoEmprestimos = historicoEmprestimos;
	}

	public void setNumCopias(int numCopias) {
		this.numCopias = numCopias;
	}

	public void setNumDisponivel(int numDisponivel) {
		this.numDisponivel = numDisponivel;
	}

	public int getNumReservas() {
		return numReservas;
	}

	public void setNumReservas(int numReservas) {
		this.numReservas = numReservas;
	}
	public Integer getId() {
		return this.id;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public int getNumEmprestimos() {
		return numEmprestimos;
	}

	public void setNumEmprestimos(int numEmprestimos) {
		this.numEmprestimos = numEmprestimos;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public String getEstadoConserv() {
		return estadoConserv;
	}

	public void setEstadoConserv(String estadoConserv) {
		this.estadoConserv = estadoConserv;
	}
}