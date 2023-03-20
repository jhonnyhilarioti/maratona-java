package com.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest {
	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println(Calendar.getInstance());
		System.out.println(Month.JANUARY);
		System.out.println(Month.JANUARY.getValue());

		LocalDate date = LocalDate.of(2023, 4, 1);
		LocalDate agora = LocalDate.now();
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.isLeapYear());
		System.out.println(date.get(ChronoField.YEAR));
		System.out.println(date.get(ChronoField.DAY_OF_MONTH));

		System.out.println(date);
		System.out.println(agora);
	}

}
