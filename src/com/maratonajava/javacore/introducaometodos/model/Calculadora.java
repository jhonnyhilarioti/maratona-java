package com.maratonajava.javacore.introducaometodos.model;

public class Calculadora {

	// void sem parâmetro
	public void calculaSoma() {
		System.out.println(10 + 2);
	}

	// void com parâmetro
	public void calculaMultiplicacao(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	// int sem parâmetro
	public int calculaSubtracao() {
		return 10 - 5;
	}

	// int com parâmetro
	public int calculaDivisao(int num1, int num2) {
		if (num1 == 0) {
			return 0;
		}
		return num1 / num2;
	}
	
	public void somaArray(int[] numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		System.out.println(soma);
	}
	/**
	 * O varargs é um facilitador, ao invés de criar um array ou lista e colocar os valores dentro dele para depois chamar o método,
	 * o mesmo pode ser chamado diretamente passando os n valores e os parâmetros enviados são automaticamente adicionados em um array do mesmo tipo do varargs.
	 */
	public void somaVarargs(int... numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		System.out.println(soma);
	}
}
