package com.maratonajava.javacore.introducaometodos.test;

import com.maratonajava.javacore.introducaometodos.model.Estudante;
import com.maratonajava.javacore.introducaometodos.model.ImpressoraEstudante;

public class EstudanteTest {
	public static void main(String[] args) {
		ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();

		estudante1.nome = "Marcos Menezes";
		estudante1.idade = 22;
		estudante1.sexo = 'M';

		estudante2.nome = "Alexandre correa";
		estudante2.idade = 25;
		estudante2.sexo = 'M';

		impressoraEstudante.imprimeEstudante(estudante1);
		impressoraEstudante.imprimeEstudante(estudante2);
		System.out.println("-------------------");
		estudante1.imprimeEstudante();
		estudante2.imprimeEstudante();

	}
}
