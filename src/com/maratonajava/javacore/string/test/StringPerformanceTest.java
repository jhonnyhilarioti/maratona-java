package com.maratonajava.javacore.string.test;

public class StringPerformanceTest {
	public static void main(String[] args) {

		Long inicio = System.currentTimeMillis();
		concatenaString(100_000);
		Long fim = System.currentTimeMillis();
		System.out.println("tempo gasto para a String " + (fim - inicio) + "ms");

		inicio = System.currentTimeMillis();
		concatenaStringBuilder(100_000);
		fim = System.currentTimeMillis();
		System.out.println("tempo gasto para a StringBuilder " + (fim - inicio) + "ms");

		inicio = System.currentTimeMillis();
		concatenaStringBuilder(100_000);
		fim = System.currentTimeMillis();
		System.out.println("tempo gasto para a StringBuffer " + (fim - inicio) + "ms");
	}

	public static void concatenaString(int tamanho) {
		String texto = "";
		for (int i = 0; i < tamanho; i++) {
			texto += 1;
		}
	}

	public static void concatenaStringBuilder(int tamanho) {
		StringBuilder sb = new StringBuilder(tamanho);
		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}

	public static void concatenaStringBuffer(int tamanho) {
		StringBuffer sb = new StringBuffer(tamanho);
		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}
}
