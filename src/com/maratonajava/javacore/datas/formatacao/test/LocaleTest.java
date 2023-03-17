package com.maratonajava.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
	public static void main(String[] args) {

		/**
		 * A classe Locale foi criada para trabalhar com internacionalização e é utilizada para formatar 
		 * datas, moedas e números, baseado na preferência do usuário ou na localização da JVM.
		 * Com a classe Locale, é possível trabalhar com diversos tipos de formatação, seguindo o padrão da ISO.
		 */
		Locale localeItaly = new Locale("it", "IT");
		Locale localeCH = new Locale("it", "CH");

		Calendar calendar = Calendar.getInstance();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);

		System.out.println(df1.format(calendar.getTime()));
		System.out.println(df2.format(calendar.getTime()));

		System.out.println(localeItaly.getDisplayCountry());
		System.out.println(localeCH.getDisplayCountry());
	}
}
