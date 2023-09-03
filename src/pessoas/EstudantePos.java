package pessoas;

import java.time.LocalDate;

import procedimentos.ArmazenamentoBiblioteca;
import procedimentos.PrintInformacoes;

public class EstudantePos extends Pessoa implements PrintInformacoes {
	//atributos
	public static final int LIMITE_EMPRESTIMO = 5; 
	public static final int PRAZO_EMPRESTIMO = 20; 
	public static final double MULTA_ATRASO = 1; 
	//construtor
	public EstudantePos(String nome, String id, String endereco, String contato, LocalDate dataRegistro) {
		super(nome, id, endereco, contato, dataRegistro);
		//add pessoa ao armazenamento da biblioteca
		ArmazenamentoBiblioteca.getEstudantesPos().add(this);
	}
	//metodos



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
