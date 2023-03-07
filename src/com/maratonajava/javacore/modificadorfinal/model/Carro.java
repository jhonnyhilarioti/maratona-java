package com.maratonajava.javacore.modificadorfinal.model;

public class Carro {
	private String nome;
	private static final double VELOCIDADE_LIMITE;

	static {
		VELOCIDADE_LIMITE = 250;
	}
	
	@Override
	public String toString() {
		return "Carro [nome=" + nome + "]"
			 + "Carro [VELOCIDADE_LIMITE=" + Carro.VELOCIDADE_LIMITE;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static double getVelocidadeLimite() {
		return VELOCIDADE_LIMITE;
	}

}
