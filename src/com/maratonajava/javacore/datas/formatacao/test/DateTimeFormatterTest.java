package com.maratonajava.javacore.datas.formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
	public static void main(String[] args) {
		/**
		 * A nova classe responsável pela formatação de datas no Java é a DateTimeFormatter.
		 * OBS: É preciso lembrar que quando vemos a palavra 'format',significa que está transformando de um Objeto para uma String,
		 * e quando vemos a palavra 'parse' está transformando de uma String para um Objeto.
		 */
		LocalDateTime date = LocalDateTime.now(); 
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		String s4 = date.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		LocalDate parse1 = LocalDate.parse("20230321", DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate parse2 = LocalDate.parse("2023-03-21", DateTimeFormatter.ISO_DATE);
		LocalDate parse3 = LocalDate.parse("2023-03-21", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(parse1);
		System.out.println(parse2);
		System.out.println(parse3);
		
		DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String formatBR = LocalDate.now().format(formatterBR);
		System.out.println(formatBR);
		
		LocalDate parseBR = LocalDate.parse("21/03/2023", formatterBR);
		System.out.println(parseBR);
	}

}
