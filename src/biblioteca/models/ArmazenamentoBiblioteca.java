package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	//instanciação da lista de emprestimos vigentes
	protected static Set<Emprestimo> emprestimosVigentes = new HashSet<>();

	//lista de reservas 
	protected static List<Reserva> reservasVigentes = new ArrayList<>();
	
	//lista de categorias
	protected static HashSet<Categoria> categorias = new HashSet<>();
	
	

	// metodos
	//	METODO PARA MEMBROS
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
	//add um novo emprestimo vigente
	public static void addEmprestimoVigente(Emprestimo emprestimo) {
		//flag de emprestimo
		boolean emprestado = true;
		// realiza varredura para ver se o material do emprestimo já está emprestado atualmente
		for(Emprestimo elemento:emprestimosVigentes) {
			//compara se ambos tem o msm id
			if(procurarItemMultimidia(elemento.getMaterialEmprestado().getId()) == 
					procurarItemMultimidia(emprestimo.getMaterialEmprestado().getId())) {
				System.out.println("Material atualmente emprestado");
				emprestado = false;
			}
		}
		if(emprestado) {
			//o adiciona aos emprestimos
			emprestimosVigentes.add(emprestimo);
			System.out.println("Emprestimo do material '" +
					emprestimo.getMaterialEmprestado().getTitulo()
					+ "' para '" +emprestimo.getEmprestante().getNome() +"' realizado com sucesso!\n");
		}
	}
	
	//MÉTODO PARA CATEGORIAS
	public static void addCategoria(Categoria categoria) {
		//se nao houver a categoria no set, adicionar ele
		if(!categorias.contains(categoria))
			categorias.add(categoria);
		else
			System.out.println("Categoria já pertence a biblioteca");
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
	public static Set<Emprestimo> getEmprestimosVigentes() {
		return emprestimosVigentes;
	}
	public static List<Reserva> getReservasVigentes() {
		return reservasVigentes;
	}
	public static void setEmprestimosVigentes(Set<Emprestimo> emprestimosVigentes) {
		ArmazenamentoBiblioteca.emprestimosVigentes = emprestimosVigentes;
	}
	public static void setReservasVigentes(List<Reserva> reservasVigentes) {
		ArmazenamentoBiblioteca.reservasVigentes = reservasVigentes;
	}
	

}
