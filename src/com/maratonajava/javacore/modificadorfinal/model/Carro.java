package com.maratonajava.javacore.modificadorfinal.model;

public class Carro {
	private String nome;
	private static final double VELOCIDADE_LIMITE;
	/**
	 * Quando variáveis do tipo reference são finais, como no exemplo abaixo, 
	 * não é possível alterar a referência para o objeto
	 */
	private final Comprador COMPRADOR = new Comprador("Marlon");

	static {
		VELOCIDADE_LIMITE = 250;
	}
	
	@Override
	public String toString() {
		System.out.println("toString da classe Carro");
		return "Carro [nome=" + nome + "]"
			 + "Carro [VELOCIDADE_LIMITE=]" + Carro.VELOCIDADE_LIMITE
			 + "Carro [COMPRADOR=]" + COMPRADOR.getNome();
	}
	
	public Carro(String nome) {
		this.nome = nome;
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

	public Comprador getCOMPRADOR() {
		return COMPRADOR;
	}

}
