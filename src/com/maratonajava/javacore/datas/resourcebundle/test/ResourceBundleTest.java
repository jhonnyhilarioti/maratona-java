package com.maratonajava.javacore.datas.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
	public static void main(String[] args) {
		/**
		 * Com a Classe ResourceBundle, é possível internacionalizar as suas mensagens.
		 */
		/**
		 * Abaixo está sendo verificado a linguagem padrão.
		 */
		System.out.println(Locale.getDefault());

		/**
		 * Abaixo está sendo setado o arquivo e a linguagem que deseja itilizar.
		 */
		ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));

		/**
		 * No exemplo abaixo, está sendo feita a verificação de chave do arquivo .properties.
		 */
		boolean text = bundle.containsKey("text");
		System.out.println(text);

		/**
		 * Abaixo está sendo chamado a chave estipulada no arquivo .properties.
		 */
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("good.morning"));

		System.out.println("------------------");

		System.out.println(bundle2.getString("hello"));
		System.out.println(bundle2.getString("good.morning"));

	}

}
