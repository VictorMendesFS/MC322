package pessoas;

import java.util.ArrayList;
import java.util.List;

import procedimentos.Emprestimo;

public abstract class Pessoa {
	//atributos
	protected String nome;
	protected String id;
	protected String email;
	protected String senha;
	protected int numEmprestimos;
	protected List<Emprestimo> emprestimos = new ArrayList<>();
	
	public Pessoa(String nome,String id,String email,String senha) {
		this.nome=nome;
		this.id=id;
		this.email=email;
		this.senha=senha;
		numEmprestimos=0;
	}
	
	//metodos
	//adiciona um emprestimo a lista da pessoa
	public void addEmprestimo(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);
		numEmprestimos++;
//		implementar print com o titulo do emprestimo
		System.out.println("Emprestimo do material '" +
				emprestimos.get(numEmprestimos-1).getMaterialEmprestado().getTitulo()
				+ "' para '" +this.nome +"' realizado com sucesso!\n");
		//RESTA IMPLEMENTAR A MUDANÇA DE "STATUS" DO EMPRESTIMO
	}
	//remove um emprestimo a lista da pessoa
	public void removerEmprestimo(String codigo) {
		for(int i=0; i<numEmprestimos;i++) {
			if(emprestimos.get(i).getCodigoEmprestimo()==codigo) {
				emprestimos.remove(i);
				numEmprestimos--;
				System.out.println("Emprestimo Código '"+codigo+"' removido\n");
			}
		}
	}
	//getters
	public String getNome() {
		return this.nome;
	}
	public String getId() {
		return this.id;
	}
	public String getEmail() {
		return this.email;
	}
	public int getNumEmprestimos() {
		return this.numEmprestimos;
	}
	
	
}
