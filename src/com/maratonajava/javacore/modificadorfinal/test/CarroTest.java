package com.maratonajava.javacore.modificadorfinal.test;

import com.maratonajava.javacore.modificadorfinal.model.Carro;
import com.maratonajava.javacore.modificadorfinal.model.Comprador;

public class CarroTest {
	public static void main(String[] args) {
		Carro carro = new Carro("Mercedes");
		Comprador comprador = new Comprador("Diego");
		
		System.out.println("variável comprador "+comprador.getNome());
		System.out.println("variável carro "+carro.getCOMPRADOR().getNome());
		
		System.out.println("--------------");
		System.out.println(Carro.getVelocidadeLimite());
		System.out.println("--------------");
		System.out.println(carro);
		System.out.println("--------------");
		System.out.println(comprador);
				
	}
}
