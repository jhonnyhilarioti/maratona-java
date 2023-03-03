package com.maratonajava.javacore.introducaometodos.model;

public class CalculaMediaSalario {
	Funcionario funcionario = new Funcionario();

	public double calculaMedia(Funcionario funcionario) {
		double media = 0;
		if (funcionario.salarios == null) {
			return 0;
		}
		for (double salario : funcionario.salarios) {
			media += salario;
		}

		return media /= funcionario.salarios.length;

	}
}
