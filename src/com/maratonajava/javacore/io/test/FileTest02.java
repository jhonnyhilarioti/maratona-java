package com.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) {
		/**
		 * Para criar um diretório é utilizado o método da classe File chamado 'mkdir'
		 */
		File fileDiretorio = new File("pasta");
		boolean isCreateDirectory = fileDiretorio.mkdir();
		System.out.println("isCreateDirectory " + isCreateDirectory);

		/**
		 * Uma forma de criar um arquivo em determinado diretório é chamando a variável
		 * que está referenciando o diretório, como no exemplo abaixo.
		 */
		File arquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
		try {
			boolean isFileCrated = arquivoDiretorio.createNewFile();
			System.out.println("isFileCrated " + isFileCrated);
		} catch (IOException e) {
			e.printStackTrace();
		}

		/**
		 * Para renomear um arquivo é preciso criar um novo File passando o diretório em
		 * que ele irá ser renomeado e logo em seguida o novo nome do arquivo, e então
		 * charmar o a variável que faz referência para o arquivo que deseja renomear
		 * mais o método 'renameTo' passando como argumento a variável de referência do novo File.
		 */
		File filerenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
		boolean isRenamedFile = arquivoDiretorio.renameTo(filerenamed);
		System.out.println("isRenamed " + isRenamedFile);

		/**
		 * Para renomear um diretório é utilizado o mesmo método da renomeação de
		 * arquivos.
		 */
		File diretorioRenamed = new File("Pasta2");
		boolean isRenamedDiretory = fileDiretorio.renameTo(diretorioRenamed);
		System.out.println("isRenamedDiretory " + isRenamedDiretory);
	}
}
