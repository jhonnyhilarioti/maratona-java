package com.maratonajava.javacore.throwable.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		/**
		 * Checked: São filhas da classe Exception diretamente, e irão lançar um erro em
		 * tempo de compilação, ou seja, o código não poderá ser compilado.
		 * 
		 */

		criarNovoArquivo();

	}

	private static void criarNovoArquivo() {
		File file = new File("arquivo\\teste.txt");
		/**
		 * Caso a criação do arquivo não fosse tratada com o try catch, 
		 * seria lançado uma exception do tipo Checked
		 */
		try {
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado? " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
