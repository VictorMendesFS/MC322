package models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public abstract class Membro implements InterfaceMembro {
	//atributos
	protected String nome;
	protected String id;
	protected String endereco;
	protected String contato;
	protected LocalDate dataRegistro;
	protected PriorityQueue<Emprestimo> ordemDevolucaoDeEmprestimos = new PriorityQueue<>(); //implementação futura
	protected List<Emprestimo> emprestimosVigentes = new ArrayList<>();
	protected List<Emprestimo> historicoEmprestimos = new ArrayList<>();
	protected int numEmprestimosVigentes=0;
	protected double multaDevida=0;

	//construtor
	public Membro(String nome, String id, String endereco, String contato, LocalDate dataRegistro) {
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
		this.contato = contato;
		this.dataRegistro = dataRegistro;
		ArmazenamentoBiblioteca.addMembro(id,this);
	}

	//metodos

	//adiciona um emprestimo vigente e a historico a lista da pessoa
	public void addEmprestimo(Emprestimo emprestimo) {
		//add a fila de ordem de vencimento e lista emprestimos vigentes
		ordemDevolucaoDeEmprestimos.offer(emprestimo);
		emprestimosVigentes.add(emprestimo);
		//aumenta o numero de emprestimos vigentes
		numEmprestimosVigentes++;
		//add ao historico de emprestimos
		historicoEmprestimos.add(emprestimo);
		//implementar print com o titulo do emprestimo
		System.out.println("Emprestimo do material '" +
				historicoEmprestimos.get(historicoEmprestimos.size()-1).getMaterialEmprestado().getTitulo()
				+ "' para '" +this.nome +"' realizado com sucesso!\n");
	}

	//remove um emprestimo da fila
	public void removerEmprestimo(Emprestimo emprestimo) {
		for(int i=0; i<ordemDevolucaoDeEmprestimos.size();i++) {
			if(emprestimosVigentes.get(i)==emprestimo) {
				emprestimosVigentes.remove(i);
				numEmprestimosVigentes--;
				
				//set o material como disponivel
				emprestimo.getMaterialEmprestado().setEmprestado(false);
				
				//aumenta o numero de copias disponiveis 
				emprestimo.getMaterialEmprestado().setNumDisponivel(emprestimo.getMaterialEmprestado().getNumDisponivel()+1);
				
				//set emprestimo como finalizado
				emprestimo.setStatus(StatusEmprestimo.ENCERRADO);
				
				//se o livro for devolvido com atraso, avisar e acrescer multa
				if(emprestimo.getDataDevolucao().isBefore(LocalDate.now())){
					double diferencaEmDias = (double)ChronoUnit.DAYS.between(emprestimo.getDataDevolucao(), LocalDate.now());
					//aplica a multa conforme a pessoa
					if(emprestimo.getEmprestante() instanceof EstudanteGrad) {
						this.multaDevida += diferencaEmDias*EstudanteGrad.MULTA_ATRASO;
					}else if(emprestimo.getEmprestante() instanceof Professor) {
						this.multaDevida += diferencaEmDias*Professor.MULTA_ATRASO;
					}else if(emprestimo.getEmprestante() instanceof EstudantePos) {
						this.multaDevida += diferencaEmDias*EstudantePos.MULTA_ATRASO;
					}else if(emprestimo.getEmprestante() instanceof Funcionario) {
						this.multaDevida += diferencaEmDias*Funcionario.MULTA_ATRASO;
					}
					//imprimir o aviso de multa
					System.out.println("Emprestimo atradado em "+ diferencaEmDias + " dias\n"
							+ "Multa aplicada de R$" + diferencaEmDias*EstudanteGrad.MULTA_ATRASO
							+ "\nMulta total devida pelo usuário é R$" + this.multaDevida );
					
				}
			
				System.out.println("Emprestimo Código '"+emprestimo.getCodigoEmprestimo()
				+"' removido\n");
				
				//atualiza a data de devolução
				emprestimo.setDataDevolucaoEncerramento(LocalDate.now());
			}
		}
	}
	//chama a implementaçao de renovação de um determinado emprestimo
	public void renovarEmprestimo(Emprestimo emprestimo) {
		for(int i=0; i<emprestimosVigentes.size();i++) {
			//se ainda houver o emprestimo no nome da pessoa, este material nao estiver reservado e
			//estiver dentro do prazo de devolução (data devolução não é antes de hoje)
			if(emprestimosVigentes.get(i)==emprestimo && !emprestimo.getMaterialEmprestado().isReservado() 
					&& !emprestimo.getDataDevolucao().isBefore(LocalDate.now())) {
				emprestimosVigentes.get(i).renovarEmprestimo();
				System.out.println("Emprestimo Código '"+emprestimo.getCodigoEmprestimo()
				+"' renovado até "+emprestimosVigentes.get(i).getDataDevolucao()+"\n");
			}
		}
	}
	
	//realiza pagamento de multa
	public double pagarMulta(double pagamento) {
		//desconta o pagamento da multa
		this.multaDevida -= pagamento;
		System.out.println("Pagamento realizado!\n"
				+ "Valor atual da multa devida: R$" 
				+ this.multaDevida);
		return this.multaDevida;
	}
	//geters e seters
	public String getNome() {
		return nome;
	}
	public String getId() {
		return id;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getContato() {
		return contato;
	}
	public LocalDate getDataRegistro() {
		return dataRegistro;
	}
	public List<Emprestimo> getEmprestimosVigentes() {
		return emprestimosVigentes;
	}
	public PriorityQueue<Emprestimo> getOrdemDeDevolucao(){
		return ordemDevolucaoDeEmprestimos;
	}
	public int getNumEmprestimosVigentes() {
		return numEmprestimosVigentes;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public void setNumEmprestimosVigentes(int numEmprestimos) {
		this.numEmprestimosVigentes = numEmprestimos;
	}


}
