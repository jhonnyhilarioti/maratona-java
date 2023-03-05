package com.maratonajava.javacore.associacao.model;

public class Jogador {
	private Time time;
	private String nome;

	public Jogador() {

	}

	public Jogador(String nome) {
		this.nome = nome;
	}

	public void imprimeJogador() {
		System.out.println(this.nome);
		if (time == null) {
			return;
		}
		System.out.println(this.time.getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
