package procedimentos;

import itensMultimidia.*;
import pessoas.Pessoa;


public class Emprestimo implements Prints{
	// atributos
	private String codigoEmprestimo;
	private String status; //3 possíveis status: "vigente", "atraso" ou "finalizado"
	private ItemMultimidia itemMultimidia;
	private String dataEmprestimo;
	private String dataDevolucao;
	private Pessoa emprestante;
	
	//metodos
	
	//construtor
	public Emprestimo(String codigoEmprestimo, String status,
			ItemMultimidia materialEmprestado, Pessoa emprestante,
			String dataEmprestimo, String dataDevolucao) {
		this.codigoEmprestimo = codigoEmprestimo;
		this.status=status;
		this.itemMultimidia = materialEmprestado;
		this.emprestante = emprestante;
		this.dataEmprestimo=dataEmprestimo;
		this.dataDevolucao=dataDevolucao;
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
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public String getDataEmprestimo() {
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
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao=dataDevolucao;
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
