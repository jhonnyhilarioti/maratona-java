package com.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
	public static void main(String[] args) {
		/**
		 * Assim como a classe Duration, a Period também trabalha com quantidade de tempo
		 * e geralmente é utilizada para pegar um intervalo entre duas datas, 
		 * diferente da classe Duration a Period trabalha com periodo de Datas.
		 */
		LocalDate date = LocalDate.now();
		LocalDate date2 = LocalDate.now().plusDays(7).plusYears(2).plusMonths(8);
		
		Period p1 = Period.between(date, date2);
		
		Period p2 = Period.ofDays(10);
		Period p3 = Period.ofWeeks(58);
		Period p4 = Period.ofMonths(3);
		Period p5 = Period.ofYears(3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}

}
