package com.maratonajava.javacore.string.test;

public class StringBuilderTest {
	public static void main(String[] args) {
		String nome = "Jhonny";
		nome.concat(" Hilário");
		System.out.println(nome);

		/**
		 * A classe StringBuilder diferente da String não é imutavel. Quando cria-se o
		 * objeto StringBuilder pode-se passa uma String como parâmetro, caso não passe
		 * nenhum parâmetro, ela irá ter uma capacidade de 16 caracteres, caso precise
		 * de mais caracteres, elá irá dobrar o tamanho.
		 * A classe append da StringBuilder e da StringBuffer funcionam como o concat das classes utilitárias.
		 */
		StringBuilder sb = new StringBuilder("Jhonny");

		sb.append(" Hilário").append(" Goulart");

		sb.reverse();
		System.out.println(sb);

		sb.reverse();
		sb.delete(0, 3);
		System.out.println(sb);
	}
}
