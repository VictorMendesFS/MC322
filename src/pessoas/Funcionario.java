package pessoas;

import java.util.List;

import procedimentos.Emprestimo;
import procedimentos.Prints;

public class Funcionario extends Pessoa implements Prints {
	//atributos
	private String departamento;
	
	//construtor
	public Funcionario(String nome, String id, 
			String email, String senha, String departamento) {
		super(nome, id, email, senha);
		this.departamento=departamento;
	}

	//metodos

	
	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Funcionário(a):\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEmail: "+this.getEmail()+
				"\nDepartamento: "+this.departamento+
				"\nN° emprestimos: "+this.getNumEmprestimos()+"\n");
		if(this.getNumEmprestimos()>0) {
			printListaEmprestimos(this.emprestimos);
		}
		
	}

	private static void printListaEmprestimos(List<Emprestimo> emprestimos) {
		System.out.println("Lista de Emprestimos da pessoa:\n");   
		for (Emprestimo emprestimoAux : emprestimos) {
			 emprestimoAux.printInfos();
	        }
		
	}

}
