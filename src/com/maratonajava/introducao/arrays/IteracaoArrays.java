package com.maratonajava.introducao.arrays;

public class IteracaoArrays {
	public static void main(String[] args) {

		int[] valores = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		
		for (int i : valores) {
			System.out.println(i);
		}
	}
}
