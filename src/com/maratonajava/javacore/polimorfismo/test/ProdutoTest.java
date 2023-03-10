package com.maratonajava.javacore.polimorfismo.test;

import com.maratonajava.javacore.polimorfismo.controller.CalculadoraImposto;
import com.maratonajava.javacore.polimorfismo.model.Computador;
import com.maratonajava.javacore.polimorfismo.model.Produto;
import com.maratonajava.javacore.polimorfismo.model.Televisao;
import com.maratonajava.javacore.polimorfismo.model.Tomate;

public class ProdutoTest {
	public static void main(String[] args) {
		Produto computador = new Computador("ACER", 4000);
		Produto tomate = new Tomate("Cereja", 16);
		Tomate tomate2 = new Tomate("Cereja", 10);
		Produto TV = new Televisao("Samsung", 5000);

		System.out.println(computador.calculaImposto());
		System.out.println(tomate.calculaImposto());

		CalculadoraImposto.calcularImpostoProduto(computador);
		CalculadoraImposto.calcularImpostoProduto(tomate);
		CalculadoraImposto.calcularImpostoProduto(TV);

		tomate2.setDataValidade(null);

	}

}
