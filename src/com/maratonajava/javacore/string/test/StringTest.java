package com.maratonajava.javacore.string.test;

public class StringTest {
	public static void main(String[] args) {
		/**
		 * Strings São imutáveis!
		 */
		String nome = "Jhonny";
		String nome2 = "Jhonny";
		nome = nome.concat(" Hilário");
		System.out.println(nome);

		System.out.println(nome.equals(nome2));
		System.out.println(nome == nome2);

		String nome3 = new String("Jhonny");
		System.out.println(nome3);
	}

}
