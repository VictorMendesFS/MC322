package models;

import java.time.LocalDate;

public class EstudantePos extends Membro implements PrintInformacoes {
	//atributos
	public static final int LIMITE_EMPRESTIMO = 5; 
	public static final int PRAZO_EMPRESTIMO = 20; 
	public static final double MULTA_ATRASO = 1; 
	//construtor
	public EstudantePos(String nome, String id, String endereco, String contato, LocalDate dataRegistro) {
		super(nome, id, endereco, contato, dataRegistro);
	}
	//metodos


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
	@Override
	public void printInfos() {
		System.out.println("Informações do(a) Estudante de Pós-Graduação:\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nEndereço: "+this.getEndereco()+
				"\nN° emprestimos Vigentes: "+this.getNumEmprestimosVigentes()+"\n");
		if(this.getNumEmprestimosVigentes()>0) {
			emprestimosVigentes.get(0).printListaEmprestimosVigentes(emprestimosVigentes);
		}
	}


}
