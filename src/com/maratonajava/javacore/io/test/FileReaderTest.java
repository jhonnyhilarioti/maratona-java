package com.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		/**
		 * A classe FileReader serve para leitura de arquivos.
		 * 
		 * O método 'read' retorna um Integer que representa o primeiro caractere escrito no nosso arquivo,
		 * para imprimir toda a escrita do arquvivo é necessário fazer uma iteração para pegar todas as posições, 
		 * e imprimilas fazendo um cast para um char.
		 * 
		 */
		File file = new File("/home/jhonny/dev/dados/estudos/projetos/maratona-java/arquivo/file.txt");
		try {
			FileReader fr = new FileReader(file);
			System.out.println(fr.read());
			int i;
			while((i = fr.read()) != -1){
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
