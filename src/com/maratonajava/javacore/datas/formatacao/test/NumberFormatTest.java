package com.maratonajava.javacore.datas.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	public static void main(String[] args) {

		/**
		 * Abaixo está a formatação da variável 'valor' para cada localidade estipulada com Locale.
		 */
		Locale localeDefault = Locale.getDefault();
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALIAN;

		NumberFormat[] nfa = new NumberFormat[4];

		nfa[0] = NumberFormat.getInstance(localeDefault);
		nfa[1] = NumberFormat.getInstance(localeBR);
		nfa[2] = NumberFormat.getInstance(localeJP);
		nfa[3] = NumberFormat.getInstance(localeIT);

		double valor = 10_000.1230;

		for (NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.format(valor));
		}
	}
}
