package com.maratonajava.introducao.estruturasderepeticao;

public class EstruturaDeRepeticaoForEWhile {
	public static void main(String[] args) {

		int n = 12;
		while (n < 10) {
			System.out.println(n++);
		}
		do {
			System.out.println("dentor do DO WHILE");
		} while (n < 10);

		
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0) {
				System.out.println("Dentro do for " +i);
			}
		}
	}

}
