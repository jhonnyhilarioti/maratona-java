package com.maratonajava.javacore.associacao.model;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor() {

	}

	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Professor(String nome, String especialidade, Seminario[] seminarios) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = seminarios;
	}

	public void imprime() {
		System.out.println("-----------------");
		System.out.println("Professor = " + this.nome);
		System.out.println("Especialidade = " + this.especialidade);
		if (seminarios == null)return;
		for (Seminario seminario : this.seminarios) {
			System.out.println("Ministrando = " + seminario.getTitulo());
			System.out.println("Local do Seminário = " + seminario.getLocal().getEndereco());
			if (seminario.getEstudante() == null || seminario.getEstudante().length == 0)continue;
			for (Estudante estudante : seminario.getEstudante()) {
				System.out.println("Estudantes = " + estudante.getNome());
			}

		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminario() {
		return seminarios;
	}

	public void setSeminario(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

}
