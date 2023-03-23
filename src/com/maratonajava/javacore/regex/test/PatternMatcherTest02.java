package com.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
	public static void main(String[] args) {
		/**
		 * Alguns metacaracteres úteis:
		 * 
		 * \d Retorna todos os dígitos;
		 * \D Retorna tudo que não for dígito;
		 * \s Retorna todo os espaçoes em branco;
		 * \S Retorna todos os caracteres exceto os brancos;
		 * \w Retorna tudo que for de a-Z, dígitos e underscore _;
		 * \W Retorna tudo que náo for incluso no \w.
		 */
		String regex = "\\w";
		String texto = "!@#hhj212_gvh 21kh2";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto:   "+ texto);
		System.out.println("índice:  0123456789");
		System.out.println("regex "+ regex);
		System.out.println("Posições encontradas");
		
		while (matcher.find()) {
			System.out.print(matcher.start()+" " + matcher.group() + "\n");
		}
	}
}
