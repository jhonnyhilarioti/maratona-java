package com.maratonajava.javacore.introducaometodos.test;

import com.maratonajava.javacore.introducaometodos.model.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		int result1 = calculadora.calculaSubtracao();
		int result2 = calculadora.calculaDivisao(10, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("---------------");

		calculadora.calculaSoma();
		System.out.println("----------------");

		calculadora.calculaMultiplicacao(2, 2);
		System.out.println("----------------");

		System.out.println(calculadora.calculaSubtracao());
		System.out.println("----------------");

		System.out.println(calculadora.calculaDivisao(0, 10));
	}
}