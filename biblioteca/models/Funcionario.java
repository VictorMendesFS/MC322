package models;

import java.time.LocalDate;

public class Funcionario extends Membro implements PrintInformacoes {
	//atributos
	public static final int LIMITE_EMPRESTIMO = 4; 
	public static final int PRAZO_EMPRESTIMO = 20; 
	public static final double MULTA_ATRASO = 0.75; 
	private PerfilFuncionario perfil;

	//construtor
	public Funcionario(String nome, String id, String endereco, String contato, LocalDate dataRegistro, PerfilFuncionario perfil) {
		super(nome, id, endereco, contato, dataRegistro);
		this.perfil = perfil;
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
		System.out.println("Informações do(a) Funcionário(a):\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
				"\nCargo: "+this.perfil +
				"\nEndereço: "+this.getEndereco()+
				"\nN° emprestimos: "+this.getNumEmprestimosVigentes()+"\n");
		if(this.getNumEmprestimosVigentes()>0) {
			emprestimosVigentes.get(0).printListaEmprestimosVigentes(emprestimosVigentes);
		}
	}
	//geters e seters
	public PerfilFuncionario getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilFuncionario perfil) {
		this.perfil = perfil;
	}
}
