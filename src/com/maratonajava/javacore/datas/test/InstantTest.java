package com.maratonajava.javacore.datas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
	public static void main(String[] args) {
		/**
		 * A classe Instant trabalha com nano segundos, e ela guarda esses nano segundos desde 1970 até agora,
		 * e ela retorna o horário em zuzlutime.
		 */
		Instant now = Instant.now();
		
		System.out.println(now);
		System.out.println(LocalDateTime.now());
		
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano());
	}

}
