package com.maratonajava.javacore.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) {
		/**
		 * A estrutura para a escrita em rquivos com o BufferedWriter é a mesma do FileWriter, com a diferença de que,
		 * BufferedWriter incapsula  FileWriter para uma melhor otimização no tempo de gravação da escrita.
		 * 
		 * Para a quebra de linha é utilizado o método 'newLine' da classe BufferedWriter.
		 */
		File file = new File("/home/jhonny/dev/dados/estudos/projetos/maratona-java/arquivo/file.txt");
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("testando a escrita em arquivos com FileWriter");
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
