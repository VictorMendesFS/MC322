package procedimentos;

import objetos.Livro;
import pessoas.Membro;


public class Emprestimo {
	// atributos
	private String codigoEmprestimo;
	private String status; //3 possíveis status: "vigente", "atraso" ou "finalizado"
	private Livro livroEmprestado;
	private String dataEmprestimo;
	private String dataDevolucao;
	private Membro emprestante;
	
	//metodos
	
	
	//construtor
	public Emprestimo(String codigoEmprestimo, String status,
			Livro livroEmprestado, Membro emprestante,
			String dataEmprestimo, String dataDevolucao) {
		this.codigoEmprestimo = codigoEmprestimo;
		this.status=status;
		this.livroEmprestado = livroEmprestado;
		this.emprestante = emprestante;
		this.dataEmprestimo=dataEmprestimo;
		this.dataDevolucao=dataDevolucao;
		 //seta o livro como emprestado
		livroEmprestado.setStatusEmprestado();
		//add um livro a contagem de emprestimos do membro
		emprestante.setNumEmprestimos(emprestante.getnumEmprestimos()+1); 
	}
	
	//getters e setters
	//principais gets
	public String getCodigoEmprestimo() {
		return codigoEmprestimo;
	}
	public String getStatus() {
		return status;
	}
	public Livro getLivroEmprestado() {
		return livroEmprestado;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public Membro getEmprestante() {
		return emprestante;
	}
	
	//principais sets
	public void setStatusEmprestimo(String status) {
		this.status=status;
		//mudança em Membro e Livro quando o emprestimo é finalizado
		if(status == "finalizado") {
			this.livroEmprestado.setStatusDisponivel();
			//diminui em 1 o numero de livros emprestados do membro
			this.emprestante.setNumEmprestimos(this.emprestante.getnumEmprestimos()-1);
		}
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao=dataDevolucao;
	}
	
	
	//encapsulamento do print das infos 
	public void printInfosEmprestimo() {
		System.out.println("informações do empréstimo: \n"+
				"Codigo do emprestimo: "+ this.getCodigoEmprestimo() + 
				"\nStatus: " + this.getStatus() +
				"\nTitulo do Livro emprestado: " + this.getLivroEmprestado().getTitulo() +
				"\nEmprestante / ID: " + this.getEmprestante().getNome() + 
				" / " + this.getEmprestante().getId() +
				"\nData de empréstimo: " + this.getDataEmprestimo() +
				"\nData de devolução: " + this.getDataDevolucao()+ "\n");
	}
}
