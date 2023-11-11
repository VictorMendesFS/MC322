package models;

import java.util.ArrayList;
import java.util.List;

public class ListaEmprestimos<T> {
	//exemplo de Liskov Substitution Principle
	private List<T> emprestimos = new ArrayList<>();
	private Integer numEmprestimos = 0;

	//metodos
	public void addEmprestimo(T emprestimo) {
		emprestimos.add(emprestimo);
		this.numEmprestimos++;
	}
	public void removerEmprestimo(T emprestimo) {
		for(int i = 0; i < emprestimos.size(); i++) {
			if(emprestimos.get(i) == emprestimo)
				emprestimos.remove(i);
		}
	}
	public List<T> getEmprestimos() {
		return emprestimos;
	}
	public Integer getNumEmprestimos() {
		return numEmprestimos;
	}
	public void setEmprestimos(List<T> emprestimos) {
		this.emprestimos = emprestimos;
	}
	public void setNumEmprestimos(Integer numEmprestimos) {
		this.numEmprestimos = numEmprestimos;
	}
}
