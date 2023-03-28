package com.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		/**
		 * A classe FileWriter serve para a escrita em arquivos.
		 * Para a escrita em arquivos não é necessário criar um arquivo dretamente pela classe File utilizando o crateNewFile,
		 * podemos inicialiar um File passando o local da criação, e logo em seguida inicializar um FileWriter,
		 * passando a variável em que queremos escrever.
		 * 
		 * No construtor do FileWriter é implementado também o 'append' que significa que,
		 * em cada execução de escrita do FileWriter será acrescentado ao final da linha e podemos ou não implementalo.
		 * 
		 * Para trabalhar com leitura e escrita de arquivos é preciso encerrar o mesmo com o método 'close'.
		 * Antes de encerrar a leitura ou escrita de arquivos, é preciso chamar o método flush, 
		 * que irá mandar tudo que há dentro do buffer antes de encerrar o mesmo.
		 * 
		 */
		File file = new File("/home/jhonny/dev/dados/estudos/projetos/maratona-java/arquivo/file.txt");
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write("testando a escrita em arquivos com FileWriter");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
