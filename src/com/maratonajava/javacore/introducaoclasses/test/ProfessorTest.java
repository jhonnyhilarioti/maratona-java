package com.maratonajava.javacore.introducaoclasses.test;

import com.maratonajava.javacore.introducaoclasses.model.Professor;

public class ProfessorTest {
	public static void main(String[] args) {
		Professor professor = new Professor();

		professor.nome = "Mateus Maiate";
		professor.idade = 40;
		professor.sexo = 'M';

		System.out.println("Nome = " + professor.nome + "\nIdade = " + professor.idade + "\nSexo = " + professor.sexo);

	}
}
