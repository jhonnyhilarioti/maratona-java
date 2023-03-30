package com.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

import com.maratonajava.javacore.colecoes.model.Smartphone;

public class SmartphoneListTest {
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("1ABC1", "iPhone");
		Smartphone s2 = new Smartphone("2222", "Pixel");
		Smartphone s3 = new Smartphone("3333", "Sansung");
		
		List<Smartphone> smartphones = new ArrayList<>();
		smartphones.add(s1);
		smartphones.add(s2);
		smartphones.add(s3);
		
		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone);
		}
		
		Smartphone s4 = new Smartphone("3333", "Sansung");
		
		/**
		 * O método 'contais' retorna true ou false caso o objeto exista ou não dentro da lista,
		 * assim como acontece com 'equals'.
		 */
		System.out.println(smartphones.contains(s4));
		System.out.println(s4.equals(s3));
		
		/**
		 * Caso queira adicionar um objeto em determinada posição da List ou mesmo mudalo de posição,
		 * utilize o índice da posição que deseja adiciona-lo antes de passar o objeto como argumento.
		 */
		smartphones.add(0, s3);
		
		/**
		 * O método indexOf retorna o índice que o objeto se encontra na lista.
		 */
		int indexSmartphone4 = smartphones.indexOf(s3);
		System.out.println(indexSmartphone4);
		
		/**
		 * Para retornar o objeto é necessário passar o índice do mesmo, como foi feito no exemplo acima,
		 * e passar como argumento no get.
		 */
		System.out.println(smartphones.get(indexSmartphone4));
		
		/**
		 * O método 'clear' serve para deletar tudo que está na lista sem perder a variável de referência.
		 */
		smartphones.clear();
		
		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone);
		}
	}

}
