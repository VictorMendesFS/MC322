package procedimentos;

import java.time.LocalDate;
import java.util.List;

import itensMultimidia.*;
import pessoas.*;


public class Emprestimo implements Relatorios{
	// atributos
	private String codigoEmprestimo;
	private String status; //3 possíveis status: "vigente", "atraso" ou "finalizado", SERÁ UM ENUM EM BREVE
	private ItemMultimidia itemMultimidia;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private Pessoa emprestante;

	//construtor
	public Emprestimo(String codigoEmprestimo, String status,
			ItemMultimidia materialEmprestado, Pessoa emprestante,
			LocalDate dataEmprestimo) {
		//se o material nao estiver emprestado e nem reservado
		if(!materialEmprestado.isReservado() && !materialEmprestado.isEmprestado()) { 
			this.codigoEmprestimo = codigoEmprestimo;
			this.status=status;
			this.itemMultimidia = materialEmprestado;
			this.emprestante = emprestante;
			this.dataEmprestimo=dataEmprestimo;

			//o prazo para devolução vai dependeder de quem pegou emprestado
			this.setDataDevolucao(emprestante);
			//seta o material como emprestado e o add ao historico
			materialEmprestado.addEmprestimo(this);
			//add um material a contagem de emprestimos do membro
			emprestante.addEmprestimo(this);
		}else
			System.out.println("Material indisponível!");
	}

	//metodos
	//impressão da lista de emprestimos que uma pessoa possui
	public void printListaEmprestimosVigentes(List<Emprestimo> emprestimos) {
		System.out.println("Lista de Emprestimos da pessoa:\n");   
		for (Emprestimo emprestimoAux : emprestimos) {
			emprestimoAux.printInfos();
		}

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
	
	//data de devolução em função do emprestante
	public void setDataDevolucao(Pessoa emprestante) {
		if(emprestante instanceof EstudanteGrad) {
			dataDevolucao=dataEmprestimo.plusDays(EstudanteGrad.PRAZO_EMPRESTIMO); //adiciona o prazo dependendo do emprestante
		}else if(emprestante instanceof Professor) {
			dataDevolucao=dataEmprestimo.plusDays(Professor.PRAZO_EMPRESTIMO);
		}else if(emprestante instanceof EstudantePos) {
			dataDevolucao=dataEmprestimo.plusDays(EstudantePos.PRAZO_EMPRESTIMO);
		}else if(emprestante instanceof Funcionario) {
			dataDevolucao=dataEmprestimo.plusDays(Funcionario.PRAZO_EMPRESTIMO);
		}
	}
	//renovação de emprestimo
	public void renovarEmprestimo() {
		//aumenta +1 o numero de renovações
		this.emprestante.setNumEmprestimos(this.emprestante.getNumEmprestimos()+1);
		//aumenta o prazo de entrega
		if(emprestante instanceof EstudanteGrad) {
			dataDevolucao=dataDevolucao.plusDays(EstudanteGrad.PRAZO_EMPRESTIMO);
		}else if(emprestante instanceof Professor) {
			dataDevolucao=dataDevolucao.plusDays(Professor.PRAZO_EMPRESTIMO);
		}else if(emprestante instanceof EstudantePos) {
			dataDevolucao=dataDevolucao.plusDays(EstudantePos.PRAZO_EMPRESTIMO);
		}else if(emprestante instanceof Funcionario) {
			dataDevolucao=dataDevolucao.plusDays(Funcionario.PRAZO_EMPRESTIMO);
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
