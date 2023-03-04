package com.maratonajava.javacore.introducaometodos.test;

import com.maratonajava.javacore.introducaometodos.model.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Marcos Andrade");
		pessoa.setIdade(34);

		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());

	}
}
