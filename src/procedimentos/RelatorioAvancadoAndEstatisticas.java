package procedimentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import itensMultimidia.*;

public class RelatorioAvancadoAndEstatisticas {
	// esta é uma classe responsavel por acessar e imprimir dados relevantes da
	// biblioteca

	// impressão do historico e emprestimos
	public static void printHistoricoTotalDeEmprestimos() {
		printHistoricoDeEmprestimosPorData(LocalDate.of(1, 1, 1), LocalDate.of(999999999, 12, 31), true, true);
	}

	public static void printHistoricoDeEmprestimosPorData(LocalDate dataInicial, LocalDate dataFinal,
			boolean imprimirNumEmprestimos, boolean imprimirListaEmprestimos) {
		// cria uma lista com os emprestimos compreendidos entre duas datas
		List<Emprestimo> lista = new ArrayList<>();
		for (Emprestimo item : ArmazenamentoBiblioteca.historicoEmprestimos) {
			if (item.getDataEmprestimo().isEqual(dataInicial) || item.getDataEmprestimo().isEqual(dataFinal)
					|| item.getDataEmprestimo().isAfter(dataInicial) || item.getDataEmprestimo().isBefore(dataFinal))
				lista.add(item);
		}
		// imprimir infos da lista
		if (imprimirNumEmprestimos) {
			System.out.println("Número de imprestimos no intervalo: " + lista.size());
		}
		if (imprimirListaEmprestimos) {
			for (Emprestimo item : lista)
				item.printInfos();
		}
	}

	// relatorio de disponibilidade de itens
	public static void relatorioDeDisponibilidadeDeItens() {
		System.out.println("Relatório de Disponibilidade de ítens\n");
		
		System.out.println("Livros Físicos Disponíveis :\n");
		for (LivroFisico item : ArmazenamentoBiblioteca.livrosFisicos) {
			if (item.getNumDisponivel() > 0)
				item.printInfos();
		}
		
		System.out.println("Livros Digitais Disponíveis :\n");
		for (LivroDigital item : ArmazenamentoBiblioteca.livrosDigitais) {
			if (item.getNumDisponivel() > 0)
				item.printInfos();
		}
		
		System.out.println("CDs Disponíveis :\n");
		for (CD item : ArmazenamentoBiblioteca.cds) {
			if (item.getNumDisponivel() > 0)
				item.printInfos();
		}
		
		System.out.println("DVDs Disponíveis :\n");
		for (DVD item : ArmazenamentoBiblioteca.dvds) {
			if (item.getNumDisponivel() > 0)
				item.printInfos();
		}
		
		System.out.println("Outros Recursos Disponíveis :\n");
		for (OutroRecursoMultimidia item : ArmazenamentoBiblioteca.outrosRecursos) {
			if (item.getNumDisponivel() > 0)
				item.printInfos();
		}
	}

}
