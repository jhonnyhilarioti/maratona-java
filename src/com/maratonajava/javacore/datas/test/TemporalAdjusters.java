package com.maratonajava.javacore.datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TemporalAdjusters {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		/**
		 * with troca os dias do mes ou os meses sem adicionalos. 
		 * ChronoField implementa ChronoUnit e também serve para trocar os dias e meses sem adicionalos.
		 */
		/*now = LocalDate.now().withDayOfMonth(23);
		System.out.println(now);
		
		now = LocalDate.now().withMonth(4);
		System.out.println(now);
		
		now = LocalDate.now().with(ChronoField.DAY_OF_MONTH, 20);
		System.out.println(now);
		System.out.println(now.getDayOfWeek());*/
		
		/**
		 * A classe TemporalAdjusters é uma ferramenta chave para modificar objetos temporais,
		 * os exemplos podem ser um ajustador que define a data evitando fins de semana ou um que define a data para o último dia do mês
		 */
		now = LocalDate.now().with(java.time.temporal.TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("ta1 "+now);
		System.out.println("ta1 "+now.getDayOfWeek());
		
		now = LocalDate.now().with(java.time.temporal.TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("ta2 "+now);
		System.out.println("ta2 "+now.getDayOfWeek());
		
		now = LocalDate.now().with(java.time.temporal.TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println("ta3 "+now);
		System.out.println("ta3 "+now.getDayOfWeek());
		
		now = LocalDate.now().with(java.time.temporal.TemporalAdjusters.firstDayOfMonth());
		System.out.println("ta4 "+now);
		System.out.println("ta4 "+now.getDayOfWeek());
		
		now = LocalDate.now().with(java.time.temporal.TemporalAdjusters.lastDayOfMonth());
		System.out.println("ta5 "+now);
		System.out.println("ta5 "+now.getDayOfWeek());
		
		now = LocalDate.now().with(java.time.temporal.TemporalAdjusters.firstDayOfNextYear());
		System.out.println("ta6 "+now);
		System.out.println("ta6 "+now.getDayOfWeek());
		
		now = LocalDate.now().with(java.time.temporal.TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("ta7 "+now);
		System.out.println("ta7 "+now.getDayOfWeek());
		
		
	}

}
