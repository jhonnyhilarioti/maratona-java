package com.maratonajava.javacore.classesabstratas.test;

import com.maratonajava.javacore.classesabstratas.model.Desenvolvedor;
import com.maratonajava.javacore.classesabstratas.model.Funcionario;
import com.maratonajava.javacore.classesabstratas.model.Gerente;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente("João", 2000);
		Gerente gerente = new Gerente("Bruno", 5000);
		Desenvolvedor dev = new Desenvolvedor("Thiago", 8000);

		System.out.println(funcionario);
		System.out.println(gerente);
		System.out.println(dev);
		
		dev.imprime();
	}
}