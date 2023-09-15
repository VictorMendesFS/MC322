package models;

public class Comentario {
	//atributo
	private String texto;
	private Integer membroId;
	private Integer itemId;
	//construtor
	public Comentario(String texto, Integer membroId, Integer itemId) {
		super();
		this.texto = texto;
		this.membroId = membroId;
		this.itemId = itemId;
	}
	
	//get e set
	public String getTexto() {
		return texto;
	}
	public Integer getMembroId() {
		return membroId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void setMembroId(Integer membroId) {
		this.membroId = membroId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	

	
}
