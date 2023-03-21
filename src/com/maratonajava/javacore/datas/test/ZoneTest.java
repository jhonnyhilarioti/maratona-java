package com.maratonajava.javacore.datas.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest {
	public static void main(String[] args) {
		/**
		 * A classe ZoneId trabalha com as áreas ou zonas que são determinados locais.
		 * Podemos pegar a zona pré-definida do nosso pc ou as zonas disponíveis.
		 */
		Map<String, String> shortIds = ZoneId.SHORT_IDS;
		System.out.println(shortIds);
		System.out.println(ZoneId.systemDefault());

		ZoneId asiaZone = ZoneId.of("Asia/Karachi");
		System.out.println(asiaZone);

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		/**
		 * Utilizando as classes ZonedDateTime e OffsetDateTime, podemos setar qual zona
		 * queremos, para converter o horário baseado no fuso horário.
		 */
		ZonedDateTime zonedDateTime = now.atZone(asiaZone);
		System.out.println(zonedDateTime);

		Instant nowInstant = Instant.now();
		ZonedDateTime zonedDateTime2 = nowInstant.atZone(asiaZone);
		System.out.println(zonedDateTime2);

		System.out.println(ZoneOffset.MIN);
		System.out.println(ZoneOffset.MAX);

		ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
		OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
		System.out.println(offsetDateTime);
	}

}
