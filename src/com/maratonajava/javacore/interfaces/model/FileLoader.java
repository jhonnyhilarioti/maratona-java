package com.maratonajava.javacore.interfaces.model;

public class FileLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("Carregando dados do arquivo");
	}

	@Override
	public void remover() {
		System.out.println("Removendo dados do arquivo");
	}

}
