package com.maratonajava.javacore.classesabstratas.model;

public abstract class Funcionario extends Pessoa{
	protected String nome;
	protected double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}
	
	public abstract void calculaBonus();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
