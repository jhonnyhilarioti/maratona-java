package com.maratonajava.javacore.modificadorstatic.model;

public class Carro {

	private String nome;
	private double velociadeMaxima;
	private static double velocidadeLimite;

	{
		velocidadeLimite = 250;
	}

	public Carro(String nome, double velociadeMaxima) {
		this.nome = nome;
		this.velociadeMaxima = velociadeMaxima;
	}

	public void imprime() {
		System.out.println("---------");
		System.out.println("Marca = " + this.nome);
		System.out.println("Velocidade máxima = " + this.velociadeMaxima);
		System.out.println("Velocidade limite = " + Carro.velocidadeLimite);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelociadeMaxima() {
		return velociadeMaxima;
	}

	public void setVelociadeMaxima(double velociadeMaxima) {
		this.velociadeMaxima = velociadeMaxima;
	}

	public static double getVelocidadeLimite() {
		return Carro.velocidadeLimite;
	}

	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}

}
