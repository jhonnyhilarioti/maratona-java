package com.maratonajava.javacore.wrapper.test;

public class WrapperTest {
	public static void main(String[] args) {
		/**
		 * Wrappers são objetos que irão encapsular os tipos pirmitivos do Java, ou
		 * seja, são classes que irão representar os tipos primitivos.
		 * 
		 * Dois conceitos importantes sobre Wrappers são: AutoBoxing: É quando temos um
		 * tipo primitivo e o java os transforma em Wrappers. Unboxing: É quando o Java
		 * se encarrega de trasnformar um Wrapper em um tipo primitivo
		 */
		byte byteP = 1;
		short shortP = 1;
		int intP = 1;
		long longP = 10L;
		float floatP = 10F;
		double doubleP = 10D;
		char charP = 'W';
		boolean bolleanP = false;

		// AutoBoxing
		Byte byteW = 1;
		Short shortW = 1;
		Integer intW = 1;
		Long longW = 10L;
		Float floatW = 10F;
		Double doubleW = 10D;
		Character charW = 'W';
		Boolean bolleanW = false;

		// Unboxing
		int i = intW;

		System.out.println(intW.intValue());

		Integer wInt = Integer.parseInt("2");
		Byte wByte = Byte.parseByte("1");
		Double wDouble = Double.parseDouble("3.99");
		Boolean wBoolean = Boolean.parseBoolean("true");

		System.out.println(wInt);
		System.out.println(wByte);
		System.out.println(wDouble);
		System.out.println(wBoolean);

		System.out.println(Character.isDigit(charW));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isLetterOrDigit('!'));

	}

}
