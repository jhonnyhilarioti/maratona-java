package com.maratonajava.javacore.classesabstratas.model;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	public String toString() {
		return "Desenvolvedor [Nome=" + getNome() + ", Salario=" + getSalario();
	}

	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.05;

	}

	@Override
	public void imprime() {
		
	}
}
