package com.maratonajava.javacore.introducaometodos.model;

public class ImpressoraEstudante {

	public void imprimeEstudante(Estudante estudante) {
		System.out.println("Nome = " + estudante.nome + "\nIdae = " + estudante.idade + "\nSexo = " + estudante.sexo + "\n");
	}
}
