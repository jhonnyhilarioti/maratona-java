package com.maratonajava.javacore.datas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
	public static void main(String[] args) {
		/**
		 * A classe Duration foi criada para trabalhar com quatidade de tempo,
		 * geralmente é utilizada para pegar um intervalo entre duas datas e é baseada
		 * em segundos e nano segundos, ou seja, caso tenha uma classe qua não ofereça
		 * suporte para nano segundos ou segundos como a classe 'Localdate', não poderá
		 * trabalhar com Duration;
		 */
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowAfterTowYears = LocalDateTime.now().plusYears(2);
		LocalTime timeNow = LocalTime.now();
		LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

		Duration d1 = Duration.between(now, nowAfterTowYears);
		Duration d2 = Duration.between(timeNow, timeMinus7Hours);
		Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
		Duration d4 = Duration.ofDays(20);
		Duration d5 = Duration.ofMinutes(3);
		Duration d6 = Duration.ofSeconds(100);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);

	}

}
