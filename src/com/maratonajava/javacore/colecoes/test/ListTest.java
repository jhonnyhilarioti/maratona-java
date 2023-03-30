package com.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		/**
		 * A Lis é uma coleção ordenada de elementos, esses elementos podem variar em relação ao tipo de dado.
		 * A List é uma interface e o ArrayList é a classe que implementa o List.
		 * 
		 * Funcionalidades:
		 * .add Adiciona valores a lista;
		 * .remove Remove valores da lista;
		 * .addAll Adiciona uma lista a outra;
		 * .size() Tamanho da lista
		 */
		List<String> nomes = new ArrayList<>();
		List<String> nomes2 = new ArrayList<>();
		nomes.add("Jhonny");
		nomes.add("Hilário");
		
		nomes2.add("João");
		nomes2.add("Souza");
		
		nomes.addAll(nomes2);
		
		nomes.remove(0);
		nomes.remove("Hilário");
	
		for (String nome : nomes) {
			System.out.print(nome + " ");
		}
	
		nomes.add("Jhonny");
		nomes.add("Goulart");
		
		/**
		 * Iteração de uma List utilizando fori
		 */
		for(int i = 0; i < nomes.size(); i++) {
			System.out.print(nomes.get(i) + " ");
		}
	}

}
