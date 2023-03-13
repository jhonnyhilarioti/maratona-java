package com.maratonajava.javacore.throwable.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
	public static void main(String[] args) {

		/**
		 * Para criar um multi catch em linha, não se pode ter classes na mesma linha de
		 * herança no tratamento das exceções.
		 */
		try {
			// throw new RuntimeException();
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException IllegalArgumentException ArithmeticException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		} catch (RuntimeException e) {
			System.out.println("Dentro o RuntimeException");
		}

		try {
			talvezLanceException();
		} catch (SQLException | FileNotFoundException e) {
			e.printStackTrace();

		}
	}

	public static void talvezLanceException() throws SQLException, FileNotFoundException {
		System.out.println("Dentro do método talvezLanceException");
	}
}
