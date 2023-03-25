package com.maratonajava.javacore.regex.test;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		String texto = "Levi, Eren, Mikasa, true, 200";
		/**
		 * Um scanner de texto simples, pode analisar os tipos primitivos e strings usando expressões regulares. 
		 * A classe Scanner tem como objetivo separar a entrada dos textos em blocos, gerando os conhecidos tokens,
		 * que são sequências de caracteres separados por delimitadores que por padrão
		 * correspondem aos espaços em branco, tabulações e mudança de linha.
		 * 
		 * A classe Scanner possui um delimitador padrão que é o espaço em branco,
		 * caso queira usar outro delimitador tem que usar o .useDelimiter.
		 */
		Scanner scanner = new Scanner(texto);
		scanner.useDelimiter(",");

		while (scanner.hasNext()) {
			System.out.println(scanner.next().trim());
		}

		/**
		 * Caso queira pegar os valores da String de acordo com o tipo, precisa utilizar
		 * por exemplo o .hasNextInt() e o .nextBoolean() junto com uma estrutura de
		 * controle.
		 */
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				System.out.println(scanner.nextInt());
			} else if (scanner.hasNextBoolean()) {
				System.out.println(scanner.nextBoolean());
			} else {
				System.out.println(scanner.next().trim());
			}
		}
	}

}
