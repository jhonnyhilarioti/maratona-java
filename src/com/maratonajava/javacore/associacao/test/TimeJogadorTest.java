package com.maratonajava.javacore.associacao.test;

import com.maratonajava.javacore.associacao.model.Jogador;
import com.maratonajava.javacore.associacao.model.Time;

public class TimeJogadorTest {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Romario");
		Jogador jogador2 = new Jogador("Ronaldo");
		Jogador jogador3 = new Jogador("Ronaldinho");
		//Jogador[] jogadores = new Jogador[] { jogador1, jogador2, jogador3 };

		Time time = new Time("Barcelona", new Jogador[]{jogador1, jogador2, jogador3});

		jogador1.setTime(time);
		//time.setJogadores(jogadores);

		jogador1.imprimeJogador();
		System.out.println("----------");
		time.imprimeTime();

	}
}
