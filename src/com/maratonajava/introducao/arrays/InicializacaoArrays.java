package com.maratonajava.introducao.arrays;

public class InicializacaoArrays {
	public static void main(String[] args) {
		/**
		 * Valores de inicialização:
		 * byte, short, int long, float, double == 0;
		 * char == '\u0000;
		 * boolean == false;
		 * String == null;
		 */
		
		int[] idades1 = new int[3];
		idades1[0] = 25;
		idades1[1] = 12;
		idades1[2] = 78;
		System.out.println(idades1[2]);
		
		int[] idades2 = new int[] {8,2,7};
		System.out.println(idades2[0]);
	}

}
