package com.maratonajava.javacore.throwable.error.test;

public class StackOverFlowTest {
	public static void main(String[] args) {
		recursivo();
	}

	public static void recursivo() {
		recursivo();
	}

}
