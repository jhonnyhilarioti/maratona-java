package com.maratonajava.javacore.blocosinicializacao.model;

public class Anime {
	private String nome;
	private int[] episodeos;

	{
		this.episodeos = new int[100];
		for (int i = 0; i < episodeos.length; i++) {
			episodeos[i] = i + 1;
		}
	}

	public Anime() {

	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public void imprime() {
		System.out.println(this.nome);
		for (int episodeo : episodeos) {
			System.out.print(episodeo + " ");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodeos() {
		return episodeos;
	}

	public void setEpisodeos(int[] episodeos) {
		this.episodeos = episodeos;
	}

}
