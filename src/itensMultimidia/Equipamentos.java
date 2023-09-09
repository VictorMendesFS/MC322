package itensMultimidia;

public class Equipamentos {
	//atributos
	private CategoriaEquipamento tipo;
	//construtor
	public Equipamentos(CategoriaEquipamento tipo) {
		this.tipo = tipo;
	}
	//enum
	public enum CategoriaEquipamento{
		INFORMATICA,AUDIOVISUAL,IMPRESSAO;	
	}
	//static nested classes
	public static class Informatica{
		//atributos
		private String detalhes;
		//construtor

		public Informatica(String detalhes) {
			super();
			this.detalhes = detalhes;
		}
		//get e set

		public String getDetalhes() {
			return detalhes;
		}

		public void setDetalhes(String detalhes) {
			this.detalhes = detalhes;
		}
	}
	public static class Exposicao{
		//atributos
		private String detalhes;
		//construtor

		public Exposicao(String detalhes) {
			super();
			this.detalhes = detalhes;
		}
		//get e set

		public String getDetalhes() {
			return detalhes;
		}

		public void setDetalhes(String detalhes) {
			this.detalhes = detalhes;
		}
	}
	public static class AudioVisual{
		//atributos
		private String equipamentos;
		//construtor

		public AudioVisual(String equipamentos) {
			this.equipamentos = equipamentos;
		}
		//get e set

		public String getDetalhes() {
			return equipamentos;
		}

		public void setDetalhes(String equipamentos) {
			this.equipamentos = equipamentos;
		}
	}
}
