package com.maratonajava.javacore.throwable.exception.model;

public class LoginInvalidoException extends Exception {

	public LoginInvalidoException() {
		super("Login Inválido");

	}

	public LoginInvalidoException(String message) {
		super(message);
	}

}
