package com.maratonajava.introducao.estruturasderepeticao;

public class ForComBreak {
	public static void main(String[] args) {

		// Dado o valor de uma carro, descubra em quantas vezes ele pode ser parcelado;
		// Valor da parcela 30
		int valorTotalCarro = 30000;

		for (int parcela = 1; parcela <= valorTotalCarro; parcela++) {
			double valorParcela = valorTotalCarro / parcela;
			if (valorParcela < 1000) {
				break;
			}
			System.out.println("Parcela " + parcela + " R$ " + valorParcela);
		}
	}
}
