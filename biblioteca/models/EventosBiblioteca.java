package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventosBiblioteca {
	//atributos
	private TipoDeExposicao tipo;
	//construtor
	public EventosBiblioteca(TipoDeExposicao tipo) {
		this.tipo = tipo;
	}
	//enum
	public enum TipoDeExposicao{
		PALESTRA,WORKSHOP,EXPOSICAO;
	}
	//static nested classes
	public static class Palestra{
		//atributos
		private String palestrante;
		private String topico;
		private LocalDate data;
		private LocalTime horario;
		private String local;
		//construtor
		public Palestra(String palestrante, String topico, LocalDate data, LocalTime horario, String local) {
			super();
			this.palestrante = palestrante;
			this.topico = topico;
			this.data = data;
			this.horario = horario;
			this.local = local;
		}
		//get e set
		public String getPalestrante() {
			return palestrante;
		}
		public String getTopico() {
			return topico;
		}
		public LocalDate getData() {
			return data;
		}
		public LocalTime getHorario() {
			return horario;
		}
		public String getLocal() {
			return local;
		}
		public void setPalestrante(String palestrante) {
			this.palestrante = palestrante;
		}
		public void setTopico(String topico) {
			this.topico = topico;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
		public void setHorario(LocalTime horario) {
			this.horario = horario;
		}
		public void setLocal(String local) {
			this.local = local;
		}
	}

	public static class Workshop{
		//atributos
		private String instrutor;
		private String topico;
		private LocalDate data;
		private LocalTime horario;
		private String local;
		private String materiaisNecessarios;
		//construtor
		public Workshop(String instrutor, String topico, LocalDate data, LocalTime horario, String local,
				String materiaisNecessarios) {
			super();
			this.instrutor = instrutor;
			this.topico = topico;
			this.data = data;
			this.horario = horario;
			this.local = local;
			this.materiaisNecessarios = materiaisNecessarios;
		}
		//get e set
		public String getInstrutor() {
			return instrutor;
		}
		public String getTopico() {
			return topico;
		}
		public LocalDate getData() {
			return data;
		}
		public LocalTime getHorario() {
			return horario;
		}
		public String getLocal() {
			return local;
		}
		public String getMateriaisNecessarios() {
			return materiaisNecessarios;
		}
		public void setInstrutor(String instrutor) {
			this.instrutor = instrutor;
		}
		public void setTopico(String topico) {
			this.topico = topico;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
		public void setHorario(LocalTime horario) {
			this.horario = horario;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public void setMateriaisNecessarios(String materiaisNecessarios) {
			this.materiaisNecessarios = materiaisNecessarios;
		}
	}

	public static class Exposicao{
		//atributos
		private String tema;
		private String expositores;
		private LocalTime duracao;
		private String local;
		//construtor
		public Exposicao(String tema, String expositores, LocalTime duracao, String local) {
			this.tema = tema;
			this.expositores = expositores;
			this.duracao = duracao;
			this.local = local;
		}
		//get e set
		public String getTema() {
			return tema;
		}
		public String getExpositores() {
			return expositores;
		}
		public LocalTime getDuracao() {
			return duracao;
		}
		public String getLocal() {
			return local;
		}
		public void setTema(String tema) {
			this.tema = tema;
		}
		public void setExpositores(String expositores) {
			this.expositores = expositores;
		}
		public void setDuracao(LocalTime duracao) {
			this.duracao = duracao;
		}
		public void setLocal(String local) {
			this.local = local;
		}

	}
}
