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

	public int getNumeroMatricula() {
		return numeroMatriculoa;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matriculo: " + this.numeroMatriculoa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroMatriculoa;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroMatriculoa != other.numeroMatriculoa)
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object obj) {
//
//		Aluno outro = (Aluno) obj;
//		return this.nome.equals(outro.nome);
//	}
//
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}

}
