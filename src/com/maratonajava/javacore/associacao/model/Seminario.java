package com.maratonajava.javacore.associacao.model;

public class Seminario {
	private String titulo;
	private Estudante[] estudantes;
	private Local local;
	
	public Seminario() {

	}

	public Seminario(String titulo,Estudante[] estudantes, Local local) {
		this.titulo = titulo;
		this.estudantes = estudantes;
		this.local = local;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Estudante[] getEstudante() {
		return estudantes;
	}

	public void setEstudante(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
