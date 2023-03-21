package com.maratonajava.javacore.datas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
	public static void main(String[] args) {
		/**
		 * A classe ChronoUnit serve para trabalhar com intervalo de tempo, manipulando data, hora e ou data-hora.
		 */
		LocalDateTime aniversario = LocalDateTime.of(1994, Month.SEPTEMBER,16, 2,30);
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(ChronoUnit.DAYS.between(aniversario, now));
		System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
		System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
		System.out.println(ChronoUnit.YEARS.between(aniversario, now));
		System.out.println(ChronoUnit.HOURS.between(aniversario, now));
	}

}
