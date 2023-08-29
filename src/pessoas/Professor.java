package pessoas;

import java.time.LocalDate;
import java.util.List;

import procedimentos.Emprestimo;
import procedimentos.Prints;

public class Professor extends Pessoa implements Prints {
	//construtor
	public Professor(String nome, String id, String endereco, String contato, LocalDate dataRegistro,
			List<Emprestimo> emprestimos, int numEmprestimos) {
		super(nome, id, endereco, contato, dataRegistro, emprestimos, numEmprestimos);
		// TODO Auto-generated constructor stub
	}

	//metodos


	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Pessoa:\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEndereço: "+this.getEndereco()+
				"\nN° emprestimos: "+this.getNumEmprestimos()+"\n");
		if(this.getNumEmprestimos()>0) {
			emprestimos.get(0).printListaEmprestimos(emprestimos);
		}
	}
}
