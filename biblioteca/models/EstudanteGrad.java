package models;

import java.time.LocalDate;

public class EstudanteGrad extends Membro implements PrintInformacoes {
	//atributos
	public static final int LIMITE_EMPRESTIMO = 3; 
	public static final int PRAZO_EMPRESTIMO = 15; 
	public static final double MULTA_ATRASO = 1; 

	//construtor
	public EstudanteGrad(String nome, String id, String endereco, String contato, LocalDate dataRegistro) {
		super(nome, id, endereco, contato, dataRegistro);
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

	//geters e seters

}
