package models;

import java.util.ArrayList;
import java.util.List;

public class ListaReservas<T> {
	private List<T> reservas = new ArrayList<>(); //pode armazenar salas, equipamentos multimidia etc
	private Integer numReservas = 0;
	
	//metodos 
	public void addReserva(T reserva) {
		reservas.add(reserva);
		this.numReservas++;
	}
}
