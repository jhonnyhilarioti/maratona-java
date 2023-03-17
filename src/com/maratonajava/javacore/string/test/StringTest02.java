package com.maratonajava.javacore.string.test;

public class StringTest02 {
	public static void main(String[] args) {
		String nome = "   Goku   ";
		String numeros = "0123456789";
		/**
		 * A classe charAt irá retornar o char baseado no índice
		 */
		System.out.println(nome.charAt(2));

		/**
		 * A classe length irá retornar o tamanho da String
		 */
		System.out.println(nome.length());

		/**
		 * A classe replace irá trocar o caracter estipulado na primeira posição para o
		 * da segunda posição
		 */
		System.out.println(nome.replace("G", "f"));

		/**
		 * As classes toLowerCase e toUpperCase irão deixar tudo em maiúsculo e mínusculo
		 */
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());

		/**
		 * A classe substring irá contar o tamanho da String a partir do índice do primeiro parâmetro,
		 * até o índice do segundo parâmetro
		 */
		System.out.println(numeros.substring(3, numeros.length()));
		System.out.println(numeros.substring(3));
		
		/**
		 * A classe trim irá remover os valores em branco da String
		 */
		System.out.println(nome.trim());
		
		
	}
}
