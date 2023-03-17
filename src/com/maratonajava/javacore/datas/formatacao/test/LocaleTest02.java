package com.maratonajava.javacore.datas.formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		String[] isoCountries = Locale.getISOCountries();
		String[] isoLanguages = Locale.getISOLanguages();

		for (String isoCountrie : isoCountries) {
			System.out.print(isoCountrie + " ");
		}

		System.out.println();

		for (String isoLanguage : isoLanguages) {
			System.out.print(isoLanguage + " ");
		}
	}
}
