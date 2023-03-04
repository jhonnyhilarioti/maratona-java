package com.maratonajava.javacore.sobrecargametodos.test;

import com.maratonajava.javacore.sobrecargametodos.model.Anime;

public class AnimeTest {
	public static void main(String[] args) {
		Anime anime = new Anime();

		anime.init("Naruto", "TV", 12, "Ação");
		anime.imprime();
	}
}
