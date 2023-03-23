package com.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
	public static void main(String[] args) {
		/**
		 * Expressões regulares são uma linguagem que foi desenvolvida para pegar determinados padrões dentro de um texto e utiliza metacaracteres.
		 * Para trabalhar com regex precisamos das classes Pattern que é o padrão e a classe Matcher que encontra o padrão
		 */
		String regex = "ab";
		String texto = "abaaba";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto:   "+ texto);
		System.out.println("índice:  0123456789");
		System.out.println("regex "+ regex);
		System.out.println("Posições encontradas");
		
		while (matcher.find()) {
			System.out.print(matcher.start()+" ");
		}
	}

}
