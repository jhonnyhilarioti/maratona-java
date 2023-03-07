package com.maratonajava.javacore.sobrescrita.model;

public class Anime {
	private String nome;

	public Anime(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Anime [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
