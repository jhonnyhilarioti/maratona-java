package com.maratonajava.javacore.introducaometodos.model;

public class ImprimeFuncionario {
	Funcionario funcionario = new Funcionario();
	CalculaMediaSalario calculaMedia = new CalculaMediaSalario();
	
	public void relatorioDadosFuncionario(Funcionario funcionario) {
		if (funcionario.salarios == null) {
			return;
		}
		System.out.println("Funcionario = " + funcionario.nome + "\nIdade = " + funcionario.idade);
		for (double salario : funcionario.salarios) {
			System.out.println("Salário = " + salario);

		}
		System.out.println("Média Salarial = "+calculaMedia.calculaMedia(funcionario));
	}
}
