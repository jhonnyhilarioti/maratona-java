package com.maratonajava.javacore.polimorfismo.test;

import com.maratonajava.javacore.polimorfismo.controller.CalculadoraImposto;
import com.maratonajava.javacore.polimorfismo.model.Computador;
import com.maratonajava.javacore.polimorfismo.model.Produto;
import com.maratonajava.javacore.polimorfismo.model.Tomate;

public class ProdutoTest02 {
	public static void main(String[] args) {
		Produto produto = new Computador("LG", 3000);
		Tomate tomate = new Tomate("Cereja", 16);
		
		tomate.setDataValidade("11/12/2035");
		
		CalculadoraImposto.calcularImpostoProduto(tomate);
		CalculadoraImposto.calcularImpostoProduto(produto);
	}

}
