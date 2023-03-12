package com.maratonajava.javacore.throwable.exception.runtime.test;

public class RuntimeExceptionTest03 {
	public static void main(String[] args) {

		abreConexao();
		abreConexao2();
	}

	/**
	 * O bloco finilly abaixo sempre será executado
	 */
	public static void abreConexao() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			throw new RuntimeException("Testando o bloco finally");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fechando recurso liberado pelo SO");

		}
	}

	public static String abreConexao2() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			return "Testando o bloco finally";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fechando recurso liberado pelo SO");

		}
		return null;
	}
}
