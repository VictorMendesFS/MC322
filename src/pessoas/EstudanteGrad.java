package pessoas;

import java.util.List;

import procedimentos.Emprestimo;
import procedimentos.Prints;

public class EstudanteGrad extends Pessoa implements Prints {
	//atributos
	private String curso;
	
	//construtor
	public EstudanteGrad(String nome, String id, 
			String email, String senha, String curso) {
		super(nome, id, email, senha);
		this.curso=curso;
	}

	//metodos

	
	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Estudante de Graduação:\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEmail: "+this.getEmail()+
				"\nCurso: "+this.curso+
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
