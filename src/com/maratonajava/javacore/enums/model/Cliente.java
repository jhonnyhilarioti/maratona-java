package com.maratonajava.javacore.enums.model;

public class Cliente {
	public enum TipoPagamento{
		DEBITO,
		CREDITO
	}
	private String nome;
	private TipoPessoa tipoPessoa;
	private TipoPagamento tipoPagamento;
	
	public Cliente() {

	}

	public Cliente(String nome, TipoPessoa tipoPessoa) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
	}
	
	public Cliente(String nome, TipoPessoa tipoPessoa, TipoPagamento tipoPagamento) {
		this(nome,tipoPessoa);
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + 
			   ", tipoPessoa=" + tipoPessoa.getNomeRelatorio() + 
			   ", tipoPessoaInt=" + tipoPessoa.getValor()  + 
			   ", tipoPagamento=" + tipoPagamento + "]";
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

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	

}
