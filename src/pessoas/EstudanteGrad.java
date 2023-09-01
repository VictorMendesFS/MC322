package pessoas;

import java.time.LocalDate;
import procedimentos.Relatorios;

public class EstudanteGrad extends Pessoa implements Relatorios {
	//atributos
	public static final int LIMITE_EMPRESTIMO = 3; 
	public static final int PRAZO_EMPRESTIMO = 15; 
	public static final double MULTA_ATRASO = 1; 

	//construtor
	public EstudanteGrad(String nome, String id, String endereco, String contato, LocalDate dataRegistro) {
		super(nome, id, endereco, contato, dataRegistro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Estudante de Graduação:\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEndereço: "+this.getEndereco()+
				"\nN° emprestimos: "+this.getNumEmprestimosVigentes()+"\n");
		if(this.getNumEmprestimosVigentes()>0) {
			emprestimosVigentes.get(0).printListaEmprestimosVigentes(emprestimosVigentes);
		}

	}

	//geters e seters

}
