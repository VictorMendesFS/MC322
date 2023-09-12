package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArmazenamentoBiblioteca {
	// esta é a classe responsavel por centralizar todos os objetos instanciados na
	// bilbioteca

	// atributos
	// instanciação de itens multimídia em listas
	protected static HashMap<Integer,ItemMultimidia> itens = new HashMap<>();

	// instanciação de pessoas em listas
	protected static List<Membro> membros = new ArrayList<>();

	// instanciação do historico de emprestimos da biblioteca
	protected static List<Emprestimo> historicoEmprestimos = new ArrayList<>();

	// metodos
	//METODO PARA MEMBROS
	//add membro ao armazenamento
	public static void addMembro(Membro membro)  {
		if(procurarMembro(membro.getId())==null) //caso não haja membro, cadastrá-lo
			membros.add(membro);
		else
			System.out.println("Membro já cadastrado");
	}
	//remover membro
	public static void removerMembro(String id) {
		Membro membro = procurarMembro(id); //procura o membro no banco de dados
		if(membro!=null) { 					//se o membro estiver cadastrado
			membros.remove(membro);
		}
		else
			System.out.println("Membro não cadastrado");
	}
	// procurar membro pelo ID
	public static Membro procurarMembro(String id) {
		for(Membro membro:membros) {
			if(membro.getId()==id) {
				return membro;
			}
		}
		return null;
	}
	
	//MÉTODO PARA ITENS MULTIMIDIA
	
	//add item 
	public static void addItemMultimidia(ItemMultimidia item) {
//		if(!itens.containsKey(item.getId())) //add se não houver o item ou pode repetir?
//				itens.put(item.getId(), item);
//		else
//			System.out.println("Item ja cadastrado");
		itens.put(item.getId(), item);
	}
	//remover
	public static void removerItemMultimidia(Integer id) {
		if(itens.containsKey(id)) //se o item estiver cadastrado
			itens.remove(id); //remover o item procurado pelo id
	}
	// procurar material pelo id
	public static ItemMultimidia procurarItemMultimidia(Integer id) {
		if(itens.containsKey(id))
			return itens.get(id);
		else{
			System.out.println("Material não encontrado");
			return null;
		}
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

	public static HashMap<Integer,ItemMultimidia> getItens() {
		return itens;
	}

	public static List<Membro> getMembros() {
		return membros;
	}

	public static void setItens(HashMap<Integer, ItemMultimidia> itens) {
		ArmazenamentoBiblioteca.itens = itens;
	}

	public static void setMembros(List<Membro> membros) {
		ArmazenamentoBiblioteca.membros = membros;
	}

}
