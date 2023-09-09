package models;

import java.time.LocalDate;

public class Professor extends Membro implements PrintInformacoes {
	//atributos
	public static final int LIMITE_EMPRESTIMO = 7; 
	public static final int PRAZO_EMPRESTIMO = 30; 
	public static final double MULTA_ATRASO = 0.5; 
	//construtor
	public Professor(String nome, String id, String endereco, String contato, LocalDate dataRegistro) {
		super(nome, id, endereco, contato, dataRegistro);
	}

	//metodos


	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Professor(a):\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEndereço: "+this.getEndereco()+
				"\nN° emprestimos: "+this.getNumEmprestimosVigentes()+"\n");
		if(this.getNumEmprestimosVigentes()>0) {
			emprestimosVigentes.get(0).printListaEmprestimosVigentes(emprestimosVigentes);
		}
	}
	@Override
	public String getIdentificacao() {
		return this.id;
	}

	@Override
	public int getLimiteEmprestimo() {
		return LIMITE_EMPRESTIMO;
	}

	@Override
	public int getPrazoEmprestimo() {
		return PRAZO_EMPRESTIMO;
	}

	@Override
	public double getMultaAtraso() {
		return MULTA_ATRASO;
	}

}
