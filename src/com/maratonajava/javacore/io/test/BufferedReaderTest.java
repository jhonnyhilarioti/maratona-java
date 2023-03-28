package com.maratonajava.javacore.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		/**
		 * A classe BufferedReader incapsula a calsse Filereader serve para leitura de arquivos.
		 * 
		 * O método 'readLine' retorna uma linha interia de escrita, 
		 * e para ler todas as linhas é preciso fazer uma iteração pegando todas as linhas enquanto for diferente de null.
		 * 
		 */
		File file = new File("/home/jhonny/dev/dados/estudos/projetos/maratona-java/arquivo/file.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String linha;
			while((linha = br.readLine())!= null){
				System.out.println(linha);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
