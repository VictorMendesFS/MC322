package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArmazenamentoBiblioteca {
	// esta é a classe responsavel por centralizar todos os objetos instanciados na
	// bilbioteca

	// atributos
	// instanciação de itens multimídia em listas
	protected static List<ItemMultimidia> itens = new ArrayList<>();

	// instanciação de pessoas em listas
	protected static Map<String,Membro> membros = new HashMap<>();

	// instanciação do historico de emprestimos da biblioteca
	protected static List<Emprestimo> historicoEmprestimos = new ArrayList<>();

	// metodos
	//add membro ao armazenamento
	public static void addMembro(String id,Membro membro)  {
		membros.put(id,membro);
	}
	
	// procurar pessoas pelo ID
	public static Membro procurarMembro(String id) {
		if(membros.containsKey(id)) {
			return membros.get(id);
		}
		System.out.println("Id não cadastrado");
		return null;
	}

	// procurar material pelo título (já que não há código)
	public static ItemMultimidia procurarItemMultimidia(String titulo) {
		for (ItemMultimidia item : itens) {
			if (item.getTitulo() == titulo)
				return item;
		}
		System.out.println("Material não encontrado");
		return null;
	}

	// busca de emprestimo pelo codigo
	public static Emprestimo procurarEmprestimo(int codigo) {
		for (Emprestimo item : historicoEmprestimos) {
			if (item.getCodigoEmprestimo() == codigo)
				return item;
		}
		System.out.println("Emprestimo não encontrado");
		return null;
	}

	// geters e seters

	public static List<Emprestimo> getHistoricoEmprestimos() {
		return historicoEmprestimos;
	}

	public static void setHistoricoEmprestimos(List<Emprestimo> historicoEmprestimos) {
		ArmazenamentoBiblioteca.historicoEmprestimos = historicoEmprestimos;
	}

	public static List<ItemMultimidia> getItens() {
		return itens;
	}

	public static Map<String,Membro> getMembros() {
		return membros;
	}

	public static void setItens(List<ItemMultimidia> itens) {
		ArmazenamentoBiblioteca.itens = itens;
	}

	public static void setMembros(Map<String,Membro> membros) {
		ArmazenamentoBiblioteca.membros = membros;
	}

}
