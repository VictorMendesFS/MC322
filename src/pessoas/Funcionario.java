package pessoas;

import java.time.LocalDate;
import procedimentos.Relatorios;

public class Funcionario extends Pessoa implements Relatorios {
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
	public void printInfos() {
		System.out.println("Informações do(a) Funcionário(a):\n"
				+ "Nome: "+ this.getNome()+
				"\nId: "+this.getId()+
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
