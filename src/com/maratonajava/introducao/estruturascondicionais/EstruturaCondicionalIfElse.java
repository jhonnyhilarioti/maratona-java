package com.maratonajava.introducao.estruturascondicionais;

public class EstruturaCondicionalIfElse {
	public static void main(String[] args) {

		double salarioAnual = 70000;
		double primeiraFaixa = 9.70 / 100;
		double segundaFaixa = 37.35 / 100;
		double terceiraFaixa = 49.50 / 100;
		double valorImposto;

		if (salarioAnual <= primeiraFaixa) {
			valorImposto = salarioAnual * primeiraFaixa;
		} else if (salarioAnual > primeiraFaixa && salarioAnual <= segundaFaixa) {
			valorImposto = salarioAnual * segundaFaixa;
		} else {
			valorImposto = salarioAnual * terceiraFaixa;
		}

		System.out.println("Imposto a pagar = " + valorImposto);

	}
}
