package com.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
	public static void main(String[] args) {
		/**
		 * Quantificadores:
		 * Em alguns momentos é preciso fazer com que alguns caracteres se repitam, 
		 * sendo por esse motivo que os metacaracteres precisam ter um controlador, conhecido como quantificador. 
		 * O quantificador é um caractere que consegue informar quantas vezes um metacaractere pode ser repetido.
		 * 
		 * Alguns quantificadores:
		 * ? Zero ou uma ocorrência;
		 * * Zero ou mais ocorrẽncias;
		 * + Uma ou mais ocorrências;
		 * {nm} de n até m ocorrẽncias. 
		 * () Agrupamento de ocorrẽncias;
		 * | Usado em agrupamento de ocorrências com significado de "OU";
		 * $ Fim da linha.
		 */
		
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
		
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
