package pessoas;

import java.time.LocalDate;
import procedimentos.Relatorios;

public class EstudantePos extends Pessoa implements Relatorios {
	//atributos
	public static final int LIMITE_EMPRESTIMO = 5; 
	public static final int PRAZO_EMPRESTIMO = 20; 
	public static final double MULTA_ATRASO = 1; 
	//construtor
	public EstudantePos(String nome, String id, String endereco, String contato, LocalDate dataRegistro) {
		super(nome, id, endereco, contato, dataRegistro);
		// TODO Auto-generated constructor stub
	}
	//metodos



	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Estudante de Pós-Graduação:\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEndereço: "+this.getEndereco()+
				"\nN° emprestimos: "+this.getNumEmprestimos()+"\n");
		if(this.getNumEmprestimos()>0) {
			emprestimosVigentes.get(0).printListaEmprestimosVigentes(emprestimosVigentes);
		}
	}


}
