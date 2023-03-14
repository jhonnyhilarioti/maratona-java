package com.maratonajava.javacore.throwable.exception.test;

import java.util.Scanner;

import com.maratonajava.javacore.throwable.exception.model.LoginInvalidoException;

public class LoginInvalidoExceptionTest {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}

	public static void logar() throws LoginInvalidoException {
		Scanner teclado = new Scanner(System.in);
		String usernameDB = "João";
		String senhaDB = "ssj";
		System.out.println("Usuario:");
		String userDigitado = teclado.nextLine();
		System.out.println("Senha:");
		String senhaDigitada = teclado.nextLine();
		if (usernameDB.equals(userDigitado) && senhaDB.equals(senhaDigitada)) {
			System.out.println("Enjoi");
		} else {
			throw new LoginInvalidoException("Login ou senha inválidos");
		}
	}

}
