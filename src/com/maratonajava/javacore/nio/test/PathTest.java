package com.maratonajava.javacore.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest {
	public static void main(String[] args) {
		/**
		 * A interface 'Path foi criada para substituir o File do Java, e para trabalhar
		 * com Path precisamos da classe 'Paths'
		 * 
		 * baixo temos alguns exemplos de como pegar o path.
		 */
		Path p1 = Paths.get("/home/jhonny/dev/dados/estudos/projetos/maratona-java/arquivo\\teste.txt");
		Path p2 = Paths.get("/home/jhonny/dev/dados/estudos/projetos/maratona-java/arquivo", "teste.txt");
		Path p3 = Paths.get("/home/jhonny/dev/dados/estudos/projetos/maratona-java/arquivo\\teste.txt");
		System.out.println("getFileName() " + p1.getFileName());
		System.out.println("toFile() " + p1.toFile());
		System.out.println("toFile().toPath() " + p1.toFile().toPath());
		System.out.println("toAbsolutePath() " + p1.toAbsolutePath());

		/**
		 * Para criar um diretório precisamos do 'Paths.get', passando o nome do
		 * diretório que desejamos criar, isso é equivalente a 'new File("pasta");'
		 * utilizando a classe File. Caso não informe nenhum nome ele irá criar o
		 * diretório onde o projeto está sendo executado. Para criar o diretório deve
		 * ser chamado a o método da classe Files .createDirectory(pastaPath),
		 * passando a variável de referência do 'Path'. O createDirectory serve para
		 * criar apenas um diretório, e para criar mais de um diretório, deve ser
		 * chamado o método createDirectorys.
		 * 
		 * Após ser criado o diretório, caso execute o comando de criação novamente ele
		 * irá lançar uma exception, isso caso esteja usando o createDirectory, para
		 * contornar esse problema é preciso englobar a criação do diretório em um if
		 * passando o método da classe Files, 'notExists' ou 'exists', passando a
		 * variável de referência do Path
		 * 
		 * O método createDirectorys não lança exception caso for executado novamente e
		 * o diretório já exista.
		 */
		Path pastaPath = Paths.get("pasta");
		if (Files.notExists(pastaPath)) {
			try {
				Path pastaDirectory = Files.createDirectory(pastaPath);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		Path subPastaPath = Paths.get("pasta/subpasta");
		try {
			Path subpastaDirectory = Files.createDirectories(subPastaPath);
		} catch (IOException e) {

			e.printStackTrace();
		}

		/**
		 * Para criar um arquivo é preciso chamar o Files.createFile() 
		 * passando a variável de referência onde se encontra o path de destino mais o nome do arquivo.
		 * Também é necessário utilizar os métodos 'notExists' ou 'exists' 
		 * para a verificação na criação do arquivo.
		 * 
		 */
		Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
		if (Files.notExists(filePath)) {
			try {
				Path filePathCreated = Files.createFile(filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * Para copiar e renomear um arquivo utilize o Paths.get passando path de origem do arquivo 
		 * mais '.getParent().toString()' mais o novo nome do arquivo, e logo em seguida utilize o
		 * 'Files.copy' passando o path de origem mais o path de destino mais StandardCopyOption.REPLACE_EXISTING 
		 * para dar um Replace caso o conteudo do arquvo for alterado;
		 */
		Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
		try {
			Files.copy(filePath, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
