package com.maratonajava.javacore.polimorfismo.model;

public class Tomate extends Produto {
	private String dataValidade;
	public static final double IMPOSTO_POR_CENTRO = 0.05;

	public Tomate(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calculaImposto() {
		System.out.println("Imposto do Tomate");
		return this.valor * IMPOSTO_POR_CENTRO;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

}
