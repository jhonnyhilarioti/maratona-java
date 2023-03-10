package com.maratonajava.javacore.polimorfismo.test;

import com.maratonajava.javacore.polimorfismo.controller.RepositorioArquivo;
import com.maratonajava.javacore.polimorfismo.controller.RepositorioBancoDeDados;
import com.maratonajava.javacore.polimorfismo.controller.RepositorioMemoria;
import com.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioTest {
	public static void main(String[] args) {
		Repositorio bancoDeDados = new RepositorioBancoDeDados();
		Repositorio arquivo = new RepositorioArquivo();
		Repositorio memoria = new RepositorioMemoria();

		bancoDeDados.salvar();
		arquivo.salvar();
		memoria.salvar();
	}
}
