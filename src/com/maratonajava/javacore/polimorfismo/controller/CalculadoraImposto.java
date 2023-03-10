package com.maratonajava.javacore.polimorfismo.controller;

import com.maratonajava.javacore.polimorfismo.model.Produto;
import com.maratonajava.javacore.polimorfismo.model.Tomate;

public class CalculadoraImposto {

	public static void calcularImpostoProduto(Produto produto) {
		System.out.println("--------------------");
		System.out.println("Relatório de imposto do Produto");
		double imposto = produto.calculaImposto();
		System.out.println("Produto " + produto.getNome());
		System.out.println("Valor " + produto.getValor());
		System.out.println("Imposto " + imposto);

		if (produto instanceof Tomate) {
			Tomate tomate = (Tomate) produto;
			System.out.println("Data de validade do tomate " + tomate.getDataValidade());
		}

	}

}
