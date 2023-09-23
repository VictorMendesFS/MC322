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
	public void removerReserva(T reserva) {
		for(int i = 0; i < reservas.size(); i++) {
			if(reservas.get(i) == reserva)
				reservas.remove(i);
		}
	}
	public List<T> getReservas() {
		return reservas;
	}
	public Integer getNumReservas() {
		return numReservas;
	}
	public void setReservas(List<T> reservas) {
		this.reservas = reservas;
	}
	public void setNumReservas(Integer numReservas) {
		this.numReservas = numReservas;
	}
}
