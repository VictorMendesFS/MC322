package procedimentos;

import java.util.ArrayList;
import java.util.List;

public class RelatorioAvancadoAndEstatisticas {
	//esta é uma classe responsavel por armazenar os materiais da bilbioteca, assim como seus históricos de atividades
	//atributos

	
	//criar lista de emprestimos e atribuir às pessoas
	private static List<Emprestimo> historicoEmprestimos =  new ArrayList<>();
	
	
	//metodos
	public static void printHistoricoTotalDeEmprestimos() {
		System.out.println("Lista de todos os emprestimos realizados na biblioteca\n");
		for(Emprestimo item:historicoEmprestimos) {
			item.printInfos();
		}
	}
	
	//geters e seters
	public static List<Emprestimo> getHistoricoEmprestimos() {
		return historicoEmprestimos;
	}
	public static void setHistoricoEmprestimos(List<Emprestimo> historicoEmprestimos) {
		RelatorioAvancadoAndEstatisticas.historicoEmprestimos = historicoEmprestimos;
	}
	
	
}
