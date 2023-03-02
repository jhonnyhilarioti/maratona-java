package com.maratonajava.introducao.arrays;

public class ArraysMultidimensionais {
	public static void main(String[] args) {

		int[][] dias = new int[3][];
		
		dias[0] = new int[2];
		dias[1] = new int[3];
		dias[2] = new int[4];
		
		dias[0][0] = 17;
		dias[0][1] = 28;
		
		dias[1][0] = 31;
		dias[1][1] = 22;
		dias[1][2] = 25;

		dias[2][0] = 31;
		dias[2][1] = 27;
		dias[2][2] = 34;
		dias[2][3] = 25;

		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
			}
		}
		
		System.out.println("------------------------");
		
		for (int[] arrBase : dias) {
			for (int num : arrBase) {
				System.out.println(num);
			}
		}
	}
}
