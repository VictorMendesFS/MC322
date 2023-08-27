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
	
	//construtor
	public Emprestimo(String codigoEmprestimo, String status,
			ItemMultimidia materialEmprestado, Pessoa emprestante,
			LocalDate dataEmprestimo) {
		if(!materialEmprestado.getStatusBool()) {
			this.codigoEmprestimo = codigoEmprestimo;
			this.status=status;
			this.itemMultimidia = materialEmprestado;
			this.emprestante = emprestante;
			this.dataEmprestimo=dataEmprestimo;
		
			//o prazo para devolução vai dependeder de quem pegou emprestado
			this.setDataDevolucao(emprestante);
			 //seta o livro como emprestado
			materialEmprestado.setStatusIndispoivel();
			//add um livro a contagem de emprestimos do membro
			emprestante.addEmprestimo(this);
		}else
			System.out.println("Livro indisponível!");
	}
	
	//metodos
	
	
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
			dataDevolucao=dataEmprestimo.plusDays(7);
		}else if(emprestante instanceof Professor) {
			dataDevolucao=dataEmprestimo.plusDays(14);
		}else if(emprestante instanceof EstudantePos) {
			dataDevolucao=dataEmprestimo.plusDays(10);
		}else if(emprestante instanceof Funcionario) {
			dataDevolucao=dataEmprestimo.plusDays(7);
		}
	}
	//renovação de emprestimo
	public void renovarEmprestimo() {
		if(emprestante instanceof EstudanteGrad) {
			dataDevolucao=dataDevolucao.plusDays(7);
		}else if(emprestante instanceof Professor) {
			dataDevolucao=dataDevolucao.plusDays(14);
		}else if(emprestante instanceof EstudantePos) {
			dataDevolucao=dataDevolucao.plusDays(10);
		}else if(emprestante instanceof Funcionario) {
			dataDevolucao=dataDevolucao.plusDays(7);
		}
		//poderá haver uma contagem de renocações permitidas, também a depender do tipo de pessoa
	}
	@Override
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
