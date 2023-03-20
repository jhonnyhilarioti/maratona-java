package com.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
	public static void main(String[] args) {
		/**
		 * Os métodos da classe LocalDateTime são uma junção dos métodos das classes LocalDate e LocalTime.
		 * Utilizando o método 'atTime' podemos fazer a junção de uma classe LocalDate e com uma classe LocalTime.
		 * É possível também, fazer o parse de String para as classes LocalDateTime, LocalDate e LocalTime.
		 */
		LocalDateTime dataTime = LocalDateTime.of(2023, 04, 05, 14, 30);
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime dataTime2 = LocalDateTime.now();
		LocalDate date = LocalDate.parse("2023-03-20");
		LocalTime time = LocalTime.of(14, 30);
		
		System.out.println(dataTime);
		System.out.println(dataTime2);
		
		LocalDateTime ldt1 = date.atTime(time);
		LocalDateTime ldt2 = time.atDate(date);
		System.out.println(ldt1);
		System.out.println(ldt2);
		
	}
}
