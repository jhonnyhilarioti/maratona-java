package com.maratonajava.javacore.introducaometodos.model;

public class Estudante {

	public String nome;
	public int idade;
	public char sexo;

	public void imprimeEstudante() {
		System.out.println(this.nome);
		System.out.println(this.sexo);
		System.out.println(this.idade);
	}
}
