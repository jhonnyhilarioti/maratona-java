package com.maratonajava.introducao.estruturascondicionais;

import java.util.Scanner;

public class EstruturaCondicionalSwitch {

	public static void main(String[] args) {

		byte dia;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o dia da semana, sendo 0 para Domingo e 6 para Sábado");
		dia = ler.nextByte();

		switch (dia) {
		case 0:
			System.out.println("Final de semana");
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Dia útil");
			break;
		case 6:
			System.out.println("Final de semana");
			break;
		default:
			System.out.println("Opção inválida");

		}
	}
}
