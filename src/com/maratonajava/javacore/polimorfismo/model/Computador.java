package com.maratonajava.javacore.polimorfismo.model;

public class Computador extends Produto {

	public static final double IMPOSTO_POR_CENTO = 0.21;

	private static String dataValidade;

	public Computador(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calculaImposto() {
		System.out.println("Imposto do Computador");
		return this.valor * IMPOSTO_POR_CENTO;
	}

}
