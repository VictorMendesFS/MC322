package pessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import procedimentos.Emprestimo;

public abstract class Pessoa {
	//atributos
	protected String nome;
	protected String id;
	protected String endereco;
	protected String contato;
	protected LocalDate dataRegistro;
	protected List<Emprestimo> emprestimos = new ArrayList<>();
	protected int numEmprestimos;

	//construtor
	public Pessoa(String nome, String id, String endereco, String contato, LocalDate dataRegistro,
			List<Emprestimo> emprestimos, int numEmprestimos) {
		super();
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
		this.contato = contato;
		this.dataRegistro = dataRegistro;
		this.emprestimos = emprestimos;
		this.numEmprestimos = numEmprestimos;
	}
	//metodos
		
	
	//adiciona um emprestimo a lista da pessoa, supondo que todas realizam o mesmo tipo de emprestimo
	public void addEmprestimo(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);
		numEmprestimos++;
		//		implementar print com o titulo do emprestimo
		System.out.println("Emprestimo do material '" +
				emprestimos.get(numEmprestimos-1).getMaterialEmprestado().getTitulo()
				+ "' para '" +this.nome +"' realizado com sucesso!\n");
	}
	//remove um emprestimo a lista da pessoa
	public void removerEmprestimo(Emprestimo emprestimo) {
		for(int i=0; i<numEmprestimos;i++) {
			if(emprestimos.get(i)==emprestimo) {
				emprestimos.remove(i);
				numEmprestimos--;
				System.out.println("Emprestimo Código '"+emprestimo.getCodigoEmprestimo()
				+"' removido\n");
			}
		}
	}
	//chama a implementaçao de renovação de um determinado emprestimo
	public void renovarEmprestimo(Emprestimo emprestimo) {
		for(int i=0; i<numEmprestimos;i++) {
			if(emprestimos.get(i)==emprestimo) {
				emprestimos.get(i).renovarEmprestimo();
				System.out.println("Emprestimo Código '"+emprestimo.getCodigoEmprestimo()
				+"' renovado até "+emprestimo.getDataDevolucao()+"\n");
			}
		}
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
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public int getNumEmprestimos() {
		return numEmprestimos;
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
	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	public void setNumEmprestimos(int numEmprestimos) {
		this.numEmprestimos = numEmprestimos;
	}


}
