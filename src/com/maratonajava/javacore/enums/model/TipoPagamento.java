package com.maratonajava.javacore.enums.model;

public enum TipoPagamento{
		DEBITO{
			@Override
			public double calculaDesconto(double valor) {
				return valor * 0.1;
			}
		},
		CREDITO{
			@Override
			public double calculaDesconto(double valor) {
				return valor * 0.05;
			}
		};
		
		public abstract double calculaDesconto(double valor);
	}