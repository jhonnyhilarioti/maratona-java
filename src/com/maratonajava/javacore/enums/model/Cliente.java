package com.maratonajava.javacore.enums.model;

public class Cliente {
	private String nome;
	private TipoPessoa tipoPessoa;
	
	public Cliente() {

	}

	public Cliente(String nome, TipoPessoa tipoPessoa) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipoPessoa=" + tipoPessoa + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

}
