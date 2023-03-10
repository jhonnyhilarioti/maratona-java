package com.maratonajava.javacore.polimorfismo.controller;

import com.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando na memória");
	}

}
