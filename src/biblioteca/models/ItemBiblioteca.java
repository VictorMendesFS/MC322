package models;

public class ItemBiblioteca<T> {
	private T item;
	private Integer id;
	private  StatusItem status; //enum com os tipos (disponível, emprestado, reservado
	private String titulo;
	
	public ItemBiblioteca(T item, String titulo, Integer id, StatusItem status) {
		this.item = item;
		this.id = id;
		this.status = status;
		this.titulo = titulo;
		
	}
	
	//metodos
	public void emprestar() {}
}
