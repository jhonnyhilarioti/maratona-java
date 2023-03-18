package com.maratonajava.javacore.datas.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
	public static void main(String[] args) {

		/**
		 * Abaixo está a formatação da variável 'valor' em valores monetários, para cada
		 * localidade estipulada com Locale.
		 */
		Locale localeDefault = Locale.getDefault();
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALIAN;

		NumberFormat[] nfa = new NumberFormat[4];

		nfa[0] = NumberFormat.getCurrencyInstance(localeDefault);
		nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
		nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
		nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

		double valor = 1000.2130;

		for (NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.format(valor));
			numberFormat.setMaximumFractionDigits(2);
			System.out.println(numberFormat.getMaximumFractionDigits());
		}

		String valorString = "R$ 1.000,21";

		try {
			System.out.println(nfa[1].parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
