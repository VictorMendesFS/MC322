package models;

public class Multimidia {
	//atributos
	private FormatoMultimidia formato;
	//construtor
	public Multimidia(FormatoMultimidia formato) {
		this.formato=formato;
	}
	//enumeration
	public enum FormatoMultimidia{
		AUDIO,VIDEO,SOFTWARE;
	}
	//get e set
	public FormatoMultimidia getFormato() {
		return formato;
	}
	public void setFormato(FormatoMultimidia formato) {
		this.formato = formato;
	}
	//nested static classes
	public static class Audio{
		//atributo
		private String titulo;
		private float duracao;
		//construtor
		public Audio(String titulo, float duracao) {
			super();
			this.titulo = titulo;
			this.duracao = duracao;
		}
		//get e set
		public String getTitulo() {
			return titulo;
		}
		public float getDuracao() {
			return duracao;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public void setDuracao(float duracao) {
			this.duracao = duracao;
		}
	}

	public static class Video{
		//atributo
		private String titulo;
		private float duracao;
		//construtor
		public Video(String titulo, float duracao) {
			this.titulo = titulo;
			this.duracao = duracao;
		}
		//get e set
		public String getTitulo() {
			return titulo;
		}
		public float getDuracao() {
			return duracao;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public void setDuracao(float duracao) {
			this.duracao = duracao;
		}
	}

	public static class Software{
		//atributos
		private String titulo;
		private String tipo;
		//construtor
		public Software(String titulo, String tipo) {
			super();
			this.titulo = titulo;
			this.tipo = tipo;
		}
		//get e set
		public String getTitulo() {
			return titulo;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	}

}
