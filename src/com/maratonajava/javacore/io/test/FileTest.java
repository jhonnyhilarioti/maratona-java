package com.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
	/**
	 * O 'createNewFile' irá criar um novo arquivo, para criar um arquivo, 
	 * é necessário passar o local absoluto de onde ele deve ser criado mais o nome do arquivo e extensão do mesmo,
	 * ou apenas o nome e extensão, para que ele seja criado onde o projeto está sendo executado.
	 * Após o arquivo ser  criado no local estipulado, ele não poderá ser sobrescrito caso execute o createNewFile novamente.
	 * 
	 * Para deletar o arquivo use o comando 'delete', 
	 * porém uma boa prática para deletar um arquvivo é verificar se o mesmo existe utilizando o comando 'exists'.
	 * 
	 * Podemos pegar o path que passamos quando criamos o arquivo utilizando o 'getPath', 
	 * ou se quiser pegar o caminho absoluto também temos o 'getAbsolutePath'.
	 * 
	 * Podemos também saber se o arquivo é um diretório ou um file com os comandos 'isDirectory' e 'isFile'.
	 * 
	 * Para saber se o arquivo é oculto utilize o comando 'isHidden'.
	 * 
	 * Para saber qual a data da ultima modificação do arquvio utilize o comando 'lastModified'.
	 */
	public static void main(String[] args) {
		File file = new File("/home/jhonny/dev/dados/estudos/projetos/maratona-java/arquivo/file.txt");
		try {
			boolean isCreated = file.createNewFile();
			System.out.println("isCreated "+isCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("path "+file.getPath());
		System.out.println("getAbsolutePath "+file.getAbsolutePath());
		System.out.println("isDirectory "+file.isDirectory());
		System.out.println("isFile "+file.isFile());
		System.out.println("isHidden "+file.isHidden());
		System.out.println("isHidden "+new Date(file.lastModified()));
		
		boolean isExists = file.exists();
		if(isExists) {
			boolean isDeleted = file.delete();
			System.out.println("isDeleted "+isDeleted);
		}
		
	}

}
