package com.maratonajava.javacore.introducaoclasses.test;

import com.maratonajava.javacore.introducaoclasses.model.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {

		new Estudante();// forma de inicialização sem referência

		Estudante estudante = new Estudante();
		Estudante estudante2 = new Estudante();

		estudante.nome = "João de Souza";
		estudante.idade = 32;
		estudante.sexo = 'M';

		estudante2.nome = "Felipe Andrade";
		estudante2.idade = 28;
		estudante2.sexo = 'M';

		System.out.println("Nome = " + estudante.nome + "\nIdae = " + estudante.idade + "\nSexo = " + estudante.sexo);

		System.out.println("Nome = " + estudante2.nome + "\nIdae = " + estudante2.idade + "\nSexo = " + estudante2.sexo);

	}
}
