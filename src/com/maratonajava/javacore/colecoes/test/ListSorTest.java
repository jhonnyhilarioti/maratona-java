package com.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorTest {
	public static void main(String[] args) {
		List<String> livrosTheWitcher = new ArrayList<>();
		List<Double> dinheiros = new ArrayList<>();

		livrosTheWitcher.add("O Último Desejo");
		livrosTheWitcher.add("A Espada do Destino");
		livrosTheWitcher.add("O Sangue Dos Elfos");
		livrosTheWitcher.add("Tempo de Desprezo");
		livrosTheWitcher.add("Batismo de fogo");

		dinheiros.add(100.00);
		dinheiros.add(200.00);
		dinheiros.add(300.00);
		dinheiros.add(50.00);
		dinheiros.add(150.00);

		/**
		 * O Collections.sort irá reorganizar a Lista de acordo com o seu tipo.
		 */
		Collections.sort(livrosTheWitcher);
		Collections.sort(dinheiros);

		for (String livro : livrosTheWitcher) {
			System.out.println(livro);
		}

		System.out.println("---------------");

		for (Double dinheiro : dinheiros) {
			System.out.println(dinheiro);
		}

	}

}
