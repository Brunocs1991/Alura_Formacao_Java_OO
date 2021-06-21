package br.com.alura.classes;

public class Aluno {
	private String nome;
	private int numeroMatriculoa;

	public Aluno(String nome, int numeroMatriculoa) {
		this.nome = nome;
		this.numeroMatriculoa = numeroMatriculoa;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatriculoa() {
		return numeroMatriculoa;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matriculo: " + this.numeroMatriculoa + "]";
	}

}
