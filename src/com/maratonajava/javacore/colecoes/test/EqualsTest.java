package com.maratonajava.javacore.colecoes.test;

import com.maratonajava.javacore.colecoes.model.Smartphone;

public class EqualsTest {
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("1ABC1", "iPhone");
		Smartphone s2 = new Smartphone("1ABC1", "iPhone");
		
		System.out.println(s1.equals(s2));
	}
}
