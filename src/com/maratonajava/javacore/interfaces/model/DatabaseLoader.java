package com.maratonajava.javacore.interfaces.model;

public class DatabaseLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("Carregando dados do banco");
	}

	@Override
	public void remover() {
		System.out.println("Removendo dados do banco");

	}

}
