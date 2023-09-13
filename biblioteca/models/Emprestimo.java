package models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class Emprestimo implements PrintInformacoes,Comparable<Emprestimo>{
	// atributos
	private static int CONTAGEM_EMPRESTIMOS = 0;
	private int codigo;
	private StatusEmprestimo status; //3 possíveis status: ATRASADO,ENCERRADO,VIGENTE;
	private ItemMultimidia itemMultimidia;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private Membro emprestante;

	//construtor
	public Emprestimo(ItemMultimidia materialEmprestado, Membro emprestante) {
		//se o material nao estiver emprestado e nem reservado (ou reservado para o proprio membro)
		//alem disso a pessoa nao pode exceder seu limite de emprestimos
		//E deve haver uma cópia disponível do material
		if((!materialEmprestado.isReservado() || 
				(materialEmprestado.isReservado() && materialEmprestado.getReservante() == emprestante))
				&& !materialEmprestado.isEmprestado() && checarLimiteEmprestimos(emprestante)
				&& materialEmprestado.getNumDisponivel() > 0) {
			this.status = StatusEmprestimo.VIGENTE;
			this.codigo = CONTAGEM_EMPRESTIMOS++;
			this.itemMultimidia = materialEmprestado;
			this.emprestante = emprestante;
			this.dataEmprestimo=LocalDate.now();

			//retira a reserva do item
			materialEmprestado.setReservado(false);
			//retira reservante
			materialEmprestado.setReservante(null);
			//det. prazo para devolução a dependeder de quem pegou emprestado, contando do dia da criação do emprestimo
			this.setDataDevolucao(emprestante);
			//seta o material como emprestado e o add ao historico dele
			materialEmprestado.addEmprestimo(this);
			//add um material a contagem de emprestimos do membro
			emprestante.addEmprestimo(this);
			//dimiui o numero de copias disponiveis
			materialEmprestado.setNumDisponivel(materialEmprestado.getNumDisponivel()-1);
			//adiciona este emprestimo ao historico da biblioteca
			ArmazenamentoBiblioteca.getHistoricoEmprestimos().add(this);
			//add o emprestimo a lista de emprestimos vigentes da biblioteca
			ArmazenamentoBiblioteca.addEmprestimoVigente(this);
			
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
	public void setDataDevolucao(Membro emprestante) {
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
		//aumenta o prazo de entrega e o recoloca na fila de ordem de devolução
		if(emprestante instanceof EstudanteGrad) {
			dataDevolucao=dataDevolucao.plusDays(EstudanteGrad.PRAZO_EMPRESTIMO);
			this.getEmprestante().getOrdemDeDevolucao().offer(this);
		}else if(emprestante instanceof Professor) {
			dataDevolucao=dataDevolucao.plusDays(Professor.PRAZO_EMPRESTIMO);
			this.getEmprestante().getOrdemDeDevolucao().offer(this);
		}else if(emprestante instanceof EstudantePos) {
			dataDevolucao=dataDevolucao.plusDays(EstudantePos.PRAZO_EMPRESTIMO);
			this.getEmprestante().getOrdemDeDevolucao().offer(this);
		}else if(emprestante instanceof Funcionario) {
			dataDevolucao=dataDevolucao.plusDays(Funcionario.PRAZO_EMPRESTIMO);
			this.getEmprestante().getOrdemDeDevolucao().offer(this);
		}
		//poderá haver uma contagem de renovações permitidas, também a depender do tipo de pessoa
	}

	private static boolean checarLimiteEmprestimos(Membro emprestante) {
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
	public int getCodigoEmprestimo() {
		return codigo;
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
	public Membro getEmprestante() {
		return emprestante;
	}
	public void setDataDevolucaoEncerramento(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	//torna os emprestimos comparados em funcao da data de devolução (o menor a frente)
	@Override
	public int compareTo(Emprestimo outro) {
		//retorna a diferença, em dias, das datas de devolução
		return (int) ChronoUnit.DAYS.between(outro.getDataDevolucao(), this.getDataDevolucao());
	}

}
