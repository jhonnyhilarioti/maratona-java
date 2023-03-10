package com.maratonajava.javacore.polimorfismo.controller;

import com.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando no banco");
	}

}
