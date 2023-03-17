package com.maratonajava.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		/**
		 * A classe Calendar está depreciada e não deve ser usada em novos projetos.
		 * A classe calendar é abstrata, ou seja, não pode ser criado um objeto dessa classe.
		 */
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);

		/**
		 * Caso queira saber qual o primeiro dia da semana.
		 */
		if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domingo é o prmeiro dia da semana");
		}

		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		c.add(Calendar.DAY_OF_MONTH, 3);
		date = c.getTime();
		System.out.println(date);

		c.add(Calendar.HOUR, 2);
		date = c.getTime();
		System.out.println(date);

	}

}
