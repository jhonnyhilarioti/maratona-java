package com.maratonajava.javacore.interfaces.test;

import com.maratonajava.javacore.interfaces.model.DatabaseLoader;
import com.maratonajava.javacore.interfaces.model.FileLoader;

public class DataLoaderTest {
	public static void main(String[] args) {
		DatabaseLoader database = new DatabaseLoader();
		FileLoader file = new FileLoader();

		database.load();
		file.load();

		database.remover();
		file.remover();
		
		database.checkPermission();
		file.checkPermission();
	}

}
