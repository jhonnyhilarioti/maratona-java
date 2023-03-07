package com.maratonajava.javacore.modificadorfinal.model;

public class Comprador {
	private String nome;
	
	@Override
	public String toString() {
		System.out.println("toString da classe comprador");
		return "Comprador [nome=" + nome + "]";
	}

	public Comprador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
