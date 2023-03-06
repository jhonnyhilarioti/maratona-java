package com.maratonajava.javacore.associacao.test;

import com.maratonajava.javacore.associacao.model.Estudante;
import com.maratonajava.javacore.associacao.model.Local;
import com.maratonajava.javacore.associacao.model.Professor;
import com.maratonajava.javacore.associacao.model.Seminario;

public class SeminarioTest {
	public static void main(String[] args) {
		Local local = new Local("Rua da Aroeiras");

		Estudante estudante1 = new Estudante("João", 30);
		Estudante estudante2 = new Estudante("Marcos", 32);
		Estudante estudante3 = new Estudante("Felipe", 25);
		Estudante estudante4 = new Estudante("Marlon", 27);

		Professor professor = new Professor("Leandro", "Java OO");
		Professor professor2 = new Professor("Vitor", "JSF");

		Seminario seminario = new Seminario("Java OO", new Estudante[] { estudante1, estudante3 }, local);
		Seminario seminario2 = new Seminario("JSF", new Estudante[] {estudante2,estudante4}, local);

		professor.setSeminario(new Seminario[] {seminario});
		professor2.setSeminario(new Seminario[] {seminario2});
		
		professor.imprime();
		professor2.imprime();
		
	}

}
