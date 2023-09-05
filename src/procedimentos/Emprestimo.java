package procedimentos;

import java.time.LocalDate;
import java.util.List;

import itensMultimidia.*;
import pessoas.*;


public class Emprestimo implements PrintInformacoes{
	// atributos
	private String codigoEmprestimo;
	private StatusEmprestimo status; //3 possíveis status: ATRASADO,ENCERRADO,VIGENTE;
	private ItemMultimidia itemMultimidia;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private Pessoa emprestante;

	//construtor
	public Emprestimo(String codigoEmprestimo, StatusEmprestimo status,
			ItemMultimidia materialEmprestado, Pessoa emprestante,
			LocalDate dataEmprestimo) {
		//se o material nao estiver emprestado e nem reservado (ou reservado para o proprio membro)
		//alem disso a pessoa nao pode exceder seu limite de emprestimos
		//E deve haver uma cópia disponível do material
		if((!materialEmprestado.isReservado() || 
				(materialEmprestado.isReservado() && materialEmprestado.getReservante() == emprestante))
				&& !materialEmprestado.isEmprestado() && checarLimiteEmprestimos(emprestante)
				&& materialEmprestado.getNumDisponivel() > 0) {
			this.codigoEmprestimo = codigoEmprestimo;
			this.status=status;
			this.itemMultimidia = materialEmprestado;
			this.emprestante = emprestante;
			this.dataEmprestimo=dataEmprestimo;

			//retira a reserva do item
			materialEmprestado.setReservado(false);
			//retira reservante
			materialEmprestado.setReservante(null);
			//det. prazo para devolução a dependeder de quem pegou emprestado, contando do dia da criação do emprestimo
			this.setDataDevolucao(emprestante);
			//seta o material como emprestado e o add ao historico
			materialEmprestado.addEmprestimo(this);
			//add um material a contagem de emprestimos do membro
			emprestante.addEmprestimo(this);
			//dimiui o numero de copias disponiveis
			materialEmprestado.setNumDisponivel(materialEmprestado.getNumDisponivel()-1);
			
			//adiciona este emprestimo ao historico da biblioteca
			ArmazenamentoBiblioteca.getHistoricoEmprestimos().add(this);
		}else
			//se o material estiver indisponível (talvez seja substituido por algum return em outra função
			System.out.println("Material indisponível!\n");
	}

	//metodos
	
	//impressão da lista de emprestimos que uma pessoa possui
	public void printListaEmprestimosVigentes(List<Emprestimo> emprestimos) {
		System.out.println("Lista de Emprestimos da pessoa:\n");   
		for (Emprestimo emprestimoAux : emprestimos) {
			emprestimoAux.printInfos();
		}
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
		//poderá haver uma contagem de renovações permitidas, também a depender do tipo de pessoa
	}

	private static boolean checarLimiteEmprestimos(Pessoa emprestante) {
		if(emprestante instanceof EstudanteGrad && emprestante.getNumEmprestimosVigentes()<=EstudanteGrad.LIMITE_EMPRESTIMO) {
			return true;
		}else if(emprestante instanceof EstudantePos && emprestante.getNumEmprestimosVigentes()<=EstudantePos.LIMITE_EMPRESTIMO) {
			return true;
		}else if(emprestante instanceof Professor && emprestante.getNumEmprestimosVigentes()<=Professor.LIMITE_EMPRESTIMO) {
			return true;
		}else if(emprestante instanceof Funcionario && emprestante.getNumEmprestimosVigentes()<=Funcionario.LIMITE_EMPRESTIMO) {
			return true;
		}else
			return false;
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

	//getters e setters
	//principais gets
	public String getCodigoEmprestimo() {
		return codigoEmprestimo;
	}
	public StatusEmprestimo getStatus() {
		return status;
	}
	public void setStatus(StatusEmprestimo status) {
		this.status = status;
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
	public void setDataDevolucaoEncerramento(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

}
