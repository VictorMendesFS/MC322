package models;

import java.util.ArrayList;
import java.util.List;

public class ItemBiblioteca<T extends ItemMultimidia> {
	private List<T> itensReservados = new ArrayList<>();
	private List<T> itensEmprestados = new ArrayList<>();
	private Integer numeroDeItensEmprestados = 0;
	private Integer numeroDeItensReservados = 0;
	
	
	
	//metodos
	public void reservarItem(T item, Membro membro) {
		new Reserva(membro, item);
		itensReservados.add(item);
		numeroDeItensEmprestados++;
		
	}
	
	public void emprestarItem(T item, Membro membro) {
		new Emprestimo(item,membro);
		itensEmprestados.add(item);
		numeroDeItensReservados++;
	}
	
	public void devolverItem(T item, Membro membro) {
		// procurar o emprestimo o item em questao e o remove
		for(Emprestimo emprestimo:membro.getEmprestimosVigentes()) {
			if(emprestimo.getMaterialEmprestado() == item)
				membro.removerEmprestimo(emprestimo);
		}
	}
	//get and set
	public List<T> getItensReservados() {
		return itensReservados;
	}

	public List<T> getItensEmprestados() {
		return itensEmprestados;
	}

	public Integer getNumeroDeItensEmprestados() {
		return numeroDeItensEmprestados;
	}

	public Integer getNumeroDeItensReservados() {
		return numeroDeItensReservados;
	}

	public void setItensReservados(List<T> itensReservados) {
		this.itensReservados = itensReservados;
	}

	public void setItensEmprestados(List<T> itensEmprestados) {
		this.itensEmprestados = itensEmprestados;
	}

	public void setNumeroDeItensEmprestados(Integer numeroDeItensEmprestados) {
		this.numeroDeItensEmprestados = numeroDeItensEmprestados;
	}

	public void setNumeroDeItensReservados(Integer numeroDeItensReservados) {
		this.numeroDeItensReservados = numeroDeItensReservados;
	}
}
