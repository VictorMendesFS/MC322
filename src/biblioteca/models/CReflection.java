package models;

import java.lang.reflect.*;
import java.util.List;

public class CReflection {
	//metodos para Membros
	public static void printMembrosAtt() {
		printAtributos("Membro");
	}
	public static void printMembroMetodos() {
		printMetodos("Membro");
	}
	//metodos para ItemMultimidia
	public static void printItemMultimidiaAtt() {
		printAtributos("ItemMultimidia");
	}
	public static void printItemMultimidiaMetodos() {
		printMetodos("ItemMultimidia");
	}
	
	//imprimir metodos
	public static void printMetodos(String nome) { //IMPLEMENTAR A EXCEÇÃO
		Class<?> classe = null;
		try {
			classe = Class.forName(nome); //obter a classe pelo nome
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Method[] metodos = classe.getDeclaredMethods(); //obter os metodos
		
		//impressao dos nomes dos metodos
		System.out.println("Lista de Métodos de: " + classe.getName());
		for(Method metodo:metodos) {
			System.out.println(metodo.getName());
		}
	}
	//imprimir atributos
	public static void printAtributos(String nome) {
		Class<?> classe = null;
		try {
			classe = Class.forName(nome);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Field[] atributos = classe.getDeclaredFields();//obter os atributos (fields/campos)
		
		//impressao do nome dos atts
		System.out.println("Lista de Atributos de: "+classe.getName());
		for(Field att:atributos) {
			System.out.println(att);
		}
	}
	//imprimir informações de uma lista
	public static void printInfosLista(List<?> lista) {
		//imprimir o nome da lista, os tipos de elementos, tamanho e os elementos.
		System.out.println("Nome da classe da lista: " + lista.getClass().getName());
	    if (!lista.isEmpty()) {
	    	System.out.println("Tipo de elementos na lista: " + lista.get(0).getClass().getName());
	    } else {
	    	System.out.println("A lista está vazia.");
	    }
	    System.out.println("Tamanho da lista: " + lista.size());
	    System.out.println("Elementos da lista:");
	    for (Object elemento : lista) {
	    	System.out.println(" - " + elemento);
	    }
	}
	
}
