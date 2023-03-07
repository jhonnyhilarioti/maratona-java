package com.maratonajava.javacore.heranca.test;

import com.maratonajava.javacore.heranca.model.Endereco;
import com.maratonajava.javacore.heranca.model.Funcionario;
import com.maratonajava.javacore.heranca.model.Pessoa;

public class HerancaTest {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();

		endereco.setRua("Figueira");
		endereco.setCep("88707-200");

		pessoa.setNome("João");
		pessoa.setCpf("0897534-73");
		pessoa.setEndereco(endereco);

		funcionario.setNome("João");
		funcionario.setCpf("12345678-99");
		funcionario.setSalario(10000);
		funcionario.setEndereco(endereco);

		funcionario.imprime();
		System.out.println("-------------");
		pessoa.imprime();
		System.out.println("-------------");
		System.out.println("-------------");
		funcionario.relatoriaPagamento();

	}
}
