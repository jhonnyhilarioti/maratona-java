package com.maratonajava.javacore.heranca.model;

public class Funcionario extends Pessoa {
	private double salario;

	public void imprime() {
		super.imprime();
		System.out.println("Salário = " + salario);
	}

	/**
	 * Observe no método abaixo que, utilizando o modificados de acesso protected
	 * nos atributos da superclass, é possível acessá los diretamente pela classe em
	 * que foi extendida.
	 */
	public void relatoriaPagamento() {
		System.out.println("Eu " + this.nome + " recebi  salário de " + this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
