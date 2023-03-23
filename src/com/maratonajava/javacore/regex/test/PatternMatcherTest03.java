package com.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
	public static void main(String[] args) {
		/**
		 * Metacaractere Range:
		 * O matacaractere Range é representado pelo [], 
		 * ou seja, tudo que for inserido dentro dos [] é um Ranger de caracteres.
		 */
		//String regex = "[abcABC]";
		String regex = "[a-zA-C]";
		String texto = "cafeBABE";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto:   "+ texto);
		System.out.println("índice:  0123456789");
		System.out.println("regex "+ regex);
		System.out.println("Posições encontradas");
		
		while (matcher.find()) {
			System.out.print(matcher.start()+" " + matcher.group() + "\n");
		}
		/*
		Integer numerosHexadecimais = 0xFFFFFF;
		System.out.println(numerosHexadecimais);
		*/
	}
}
