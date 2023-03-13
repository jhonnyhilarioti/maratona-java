package com.maratonajava.javacore.throwable.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
	public static void main(String[] args) {

		/**
		 * No exemplo abaixo, é tratado várias exceptions seguidas. Lançando uma
		 * exception com throw, o java irá procurar qual dos tratamentos das exceções
		 * mais se adequa ao lançamento da exception, caso não tenha o cacth correto, a
		 * exceção irá explodir.
		 * 
		 * Algumas regras para o tratamento multiplo de eceções: 
		 * 1 - Não podemos colocar um tipo mais genérico antes de um timpo mais específico.
		 */
		try {
			throw new RuntimeException();
			// throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		} catch (IllegalArgumentException e) {
			System.out.println("Dentro do IllegalArgumentException");
		} catch (ArithmeticException e) {
			System.out.println("Dentro do ArithmeticException");
		} catch (RuntimeException e) {
			System.out.println("Dentro o RuntimeException");
		}

		try {
			talvezLanceException();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void talvezLanceException() throws SQLException, FileNotFoundException {
		System.out.println("Dentro do método talvezLanceException");
	}
}
