package com.maratonajava.javacore.construtores.test;

import com.maratonajava.javacore.construtores.model.Anime;

public class AnimeTest {
	public static void main(String[] args) {
		Anime anime = new Anime("Naruto", "TV", 12, "Ação");

		anime.imprime();
	}
}
