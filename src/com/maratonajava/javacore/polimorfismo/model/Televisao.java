package com.maratonajava.javacore.polimorfismo.model;

public class Televisao extends Produto {
	public static final double IMPOSTO_POR_CENTO = 0.21;

	public Televisao(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calculaImposto() {
		System.out.println("Imposto da TV");
		return this.valor * IMPOSTO_POR_CENTO;
	}

}
