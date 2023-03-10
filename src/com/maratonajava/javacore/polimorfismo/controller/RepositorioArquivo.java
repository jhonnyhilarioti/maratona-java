package com.maratonajava.javacore.polimorfismo.controller;

import com.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em um arquvivo");
	}

}
