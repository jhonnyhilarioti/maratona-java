package com.maratonajava.javacore.enums.model;

public enum TipoPessoa {
	PESSOA_JURIDICA(1, "Pessoa Juridica"),
	PESSOA_FISICA(2, "Pessoa Física");
	
	private final int VALOR;
	private final String nomeRelatorio;
	
	TipoPessoa(int valor,String nomeRelatorio){
		this.VALOR = valor;
		this.nomeRelatorio = nomeRelatorio;
	}

	public int getValor() {
		return VALOR;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}		
}
