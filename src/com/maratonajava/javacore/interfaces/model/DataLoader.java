package com.maratonajava.javacore.interfaces.model;

public interface DataLoader {
	public static final int MAX_DATA_SIZE = 10;

	void load();

	default void checkPermission() {
		System.out.println("Checando permissões");
	}

	static void retriveMaxDataSize() {
		System.out.println("Dentro do retriveMaxDataSize da interface");
	}
}
