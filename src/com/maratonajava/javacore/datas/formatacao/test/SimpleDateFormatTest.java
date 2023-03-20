package com.maratonajava.javacore.datas.formatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) {
		/**
		 * A SimpleDateFormat oferece um pouco mais de flexibilidade do que a DateFormate e vem do pacote java.text.
		 */
		String pattern = "\"yyyy.MM.dd G 'at' HH:mm:ss z\"";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
		System.out.println(simpleDateFormat.toPattern());
		System.out.println(simpleDateFormat.format(new Date()));
	}
}
