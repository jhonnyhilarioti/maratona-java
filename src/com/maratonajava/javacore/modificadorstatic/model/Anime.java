package com.maratonajava.javacore.modificadorstatic.model;

public class Anime {
	private String nome;
	private static int[] episodeos;

	static {
		Anime.episodeos = new int[100];
		for (int i = 0; i < Anime.episodeos.length; i++) {
			Anime.episodeos[i] = i + 1;
			System.out.print(Anime.episodeos[i] + " ");
		}
		System.out.println("\nDentro do bloco de inicialização STATIC");
	}

	public Anime() {

	}

	public Anime(String nome) {
		System.out.println(this.nome = nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodeos() {
		return Anime.episodeos;
	}

}
