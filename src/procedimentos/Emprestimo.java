package procedimentos;

import java.time.LocalDate;

import itensMultimidia.*;
import pessoas.EstudanteGrad;
import pessoas.EstudantePos;
import pessoas.Funcionario;
import pessoas.Pessoa;
import pessoas.Professor;


public class Emprestimo implements Prints{
	// atributos
	private String codigoEmprestimo;
	private String status; //3 possíveis status: "vigente", "atraso" ou "finalizado"
	private ItemMultimidia itemMultimidia;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private Pessoa emprestante;
	
	//metodos
	
	//construtor
	public Emprestimo(String codigoEmprestimo, String status,
			ItemMultimidia materialEmprestado, Pessoa emprestante,
			LocalDate dataEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
		this.status=status;
		this.itemMultimidia = materialEmprestado;
		this.emprestante = emprestante;
		this.dataEmprestimo=dataEmprestimo;
		
		//o prazo para devolução vai dependeder de quem pegou emprestado
		this.setDataDevolucao(emprestante);
		 //seta o livro como emprestado
		materialEmprestado.setStatusEmprestado();
		//add um livro a contagem de emprestimos do membro
		emprestante.addEmprestimo(this);
	}
	
	//getters e setters
	//principais gets
	public String getCodigoEmprestimo() {
		return codigoEmprestimo;
	}
	public String getStatus() {
		return status;
	}
	public ItemMultimidia getMaterialEmprestado() {
		return this.itemMultimidia;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	public Pessoa getEmprestante() {
		return emprestante;
	}
	
	//principais sets
	public void setStatusEmprestimo(String status) {
		this.status=status;
		//mudança em Membro e Livro quando o emprestimo é finalizado
		if(status == "finalizado") {
			this.itemMultimidia.setStatusDisponivel();
		}
	}
	//data de devolução em função do emprestante
	public void setDataDevolucao(Pessoa emprestante) {
		if(emprestante instanceof EstudanteGrad) {
			this.dataDevolucao=dataEmprestimo.plusDays(7);
		}else if(emprestante instanceof Professor) {
			this.dataDevolucao=dataEmprestimo.plusDays(14);
		}else if(emprestante instanceof EstudantePos) {
			this.dataDevolucao=dataEmprestimo.plusDays(10);
		}else if(emprestante instanceof Funcionario) {
			this.dataDevolucao=dataEmprestimo.plusDays(7);
		}
	}
	
	
	//encapsulamento do print das infos 
	public void printInfos() {
		System.out.println("informações do empréstimo: \n"+
				"Codigo do emprestimo: "+ this.getCodigoEmprestimo() + 
				"\nStatus: " + this.getStatus() +
				"\nTitulo do Material emprestado: " + this.getMaterialEmprestado().getTitulo() +
				"\nEmprestante: " + this.getEmprestante().getNome()+ 
				" / Id:  " + this.getEmprestante().getId() +
				"\nData de empréstimo: " + this.getDataEmprestimo() +
				"\nData de devolução: " + this.getDataDevolucao()+ "\n");
	}
}
