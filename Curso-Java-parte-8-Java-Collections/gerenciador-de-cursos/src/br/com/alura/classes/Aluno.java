package br.com.alura.classes;

public class Aluno {
	private String nome;
	private int numeroMatriculoa;

	public Aluno(String nome, int numeroMatriculoa) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}

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

	@Override
	public boolean equals(Object obj) {

		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
