package com.maratonajava.javacore.throwable.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.maratonajava.javacore.throwable.exception.model.Leitor1;
import com.maratonajava.javacore.throwable.exception.model.Leitor2;

public class TryWithResourcesTest01 {
	public static void main(String[] args) {
		
		lerArquivo();

	}

	/**
	 * A sintaxe do Try with resources, como podemos ver logo abaixo, é como um try normal só que com parênteses,
	 * dentro do parêntese do try, é declarado a variável e instanciado o objeto, podemos declarar e instanciar mais 
	 * de um objeto, apenas o separando por ";".
	 * É possível tambem remover o catch utilizando o Try with resources, 
	 * mas precisamos declarar a exception na assinatura do método utilizando throws.
	 */
	public static void lerArquivo() {
		try (Leitor1 leitor1 = new Leitor1();
			 Leitor2 leitor2 = new Leitor2()) {

		} catch (IOException e) {

		}
	}

	public static void lerArquivo2() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
