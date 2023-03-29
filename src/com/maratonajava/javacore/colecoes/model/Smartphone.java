package com.maratonajava.javacore.colecoes.model;

import java.util.Objects;

public class Smartphone {
	private String serialNumber;
	private String marca;

	public Smartphone(String serialNumber, String marca) {
		this.serialNumber = serialNumber;
		this.marca = marca;
	}

	/**
	 * O método equals é utilizado para comparações. A classe String e as classes Wrapper sobrescrevem equals() 
	 * para garantir que dois objetos desses tipos, com o mesmo conteúdo, possam ser considerados iguais. 
	 * Quando a finalidade for descobrir se duas referências são iguais, o operador “= =” deverá ser usado, 
	 * pois serão comparados os bits das variáveis.
	 * 
	 * Existem situações onde não queremos que uma classe seja considerada, em hipótese alguma, idêntica à outra.
	 * Por exemplo, existe um laptop X que possui os atributos Y. Assim como existe um laptop Z 
	 * que também possui os atributos Y. Eles são iguais? Ou melhor, seus donos querem que eles sejam considerados 
	 * iguais? Que não possuam seu respectivo dono, já que são idênticos?! 
	 * Em casos como esses será necessários que o método equals() seja sobrescrito a 
	 * fim de garantirmos que jamais um laptop seja igual a outro.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smartphone smartphone = (Smartphone) obj;
		//return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
		return Objects.equals(marca, smartphone.marca) && Objects.equals(serialNumber, smartphone.serialNumber);
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
