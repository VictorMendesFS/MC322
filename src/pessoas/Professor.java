package pessoas;

import java.util.List;

import procedimentos.Emprestimo;
import procedimentos.Prints;

public class Professor extends Pessoa implements Prints {
	//atributos
	private String faculdade;
	
	//construtor
	public Professor(String nome, String id, 
			String email, String senha, String faculdade) {
		super(nome, id, email, senha);
		this.faculdade=faculdade;
	}

	//metodos

	
	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Professor(a):\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEmail: "+this.getEmail()+
				"\nFaculdade: "+this.faculdade+
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
