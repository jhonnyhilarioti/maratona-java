package com.maratonajava.javacore.introducaometodos.test;

import com.maratonajava.javacore.introducaometodos.model.Funcionario;
import com.maratonajava.javacore.introducaometodos.model.ImprimeFuncionario;

/**
 * Crie um uma classe Funcionário com os seguintes atributos:
 * 
 * nome
 * idade
 * salario // três salarios devem ser guardados
 * 
 * Crie dois métodos:
 * 
 *  1. Para imprimir os dados
 *  2. Para tirar a media dos salarios e imprimir o resultado
 */

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		ImprimeFuncionario imprime = new ImprimeFuncionario();

		funcionario.nome = "João de Souza";
		funcionario.idade = 32;
		funcionario.salarios = new double[] { 3500, 4250, 2700 };

		imprime.relatorioDadosFuncionario(funcionario);

	}
}
