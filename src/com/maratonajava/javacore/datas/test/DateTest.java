package com.maratonajava.javacore.datas.test;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		/**
		 * A classe Date está depreciada e não deve ser usada em novos projetos.
		 * A classe Date trabalha em milisegundos com long, representando os ms desde 1970;
		 */
		Date date = new Date(1679068838472L);
		System.out.println(date);
		System.out.println(date.getTime());
	}
}
