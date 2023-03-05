package com.maratonajava.javacore.modificadorstatic.test;

import com.maratonajava.javacore.modificadorstatic.model.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro c1 = new Carro("Fusca Azul", 190);
		Carro c2 = new Carro("Mercedez", 270);
		Carro c3 = new Carro("BMW", 390);

		Carro.setVelocidadeLimite(200);

		c1.imprime();
		c2.imprime();
		c3.imprime();
	}
}
