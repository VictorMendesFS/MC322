package pessoas;

import java.time.LocalDate;
import java.util.List;

import procedimentos.Emprestimo;
import procedimentos.Prints;

public class EstudanteGrad extends Pessoa implements Prints {

	//construtor
	public EstudanteGrad(String nome, String id, String endereco, String contato, LocalDate dataRegistro,
			List<Emprestimo> emprestimos, int numEmprestimos) {
		super(nome, id, endereco, contato, dataRegistro, emprestimos, numEmprestimos);
		// TODO Auto-generated constructor stub
	}


	//metodos


	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Estudante de Graduação:\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEndereço: "+this.getEndereco()+
				"\nN° emprestimos: "+this.getNumEmprestimos()+"\n");
		if(this.getNumEmprestimos()>0) {
			emprestimos.get(0).printListaEmprestimos(emprestimos);
		}

	}

	//geters e seters

}
