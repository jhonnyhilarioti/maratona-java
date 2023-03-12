package com.maratonajava.javacore.throwable.exception.runtime.test;

public class RuntimeExceptionTest02 {
	public static void main(String[] args) {

		System.out.println(divisao(10, 0));

	}

	/**
	 * Na assinatura do método abaixo, foi inserido o "throws" e logo em seguida a
	 * possível exception, assim é possível identifica-la no chamamento do método.
	 * 
	 * Antes do tratamento do retorno do método, foi lançado uma exception
	 * utilizando "throw", se a divisão for feita por zero, e em seguida uma
	 * mensagem explicando o motivo da exception.
	 */
	private static int divisao(int num1, int num2) throws IllegalArgumentException {
		if (num2 == 0) {
			throw new IllegalArgumentException("Divisão por zero apenas dentro de buracos negros");
		}
		try {
			return num1 / num2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;

	}

}
