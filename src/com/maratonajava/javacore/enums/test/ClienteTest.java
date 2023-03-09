package com.maratonajava.javacore.enums.test;

import com.maratonajava.javacore.enums.model.Cliente;
import com.maratonajava.javacore.enums.model.TipoPagamento;
import com.maratonajava.javacore.enums.model.TipoPessoa;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João", TipoPessoa.PESSOA_JURIDICA, TipoPagamento.CREDITO);
		Cliente cliente2 = new Cliente("Marcos", TipoPessoa.PESSOA_FISICA,TipoPagamento.DEBITO);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));
	}

}
