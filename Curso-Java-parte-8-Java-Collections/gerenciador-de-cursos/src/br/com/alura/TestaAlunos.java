package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Bruno");
		alunos.add("Sergio");
		alunos.add("Renan");
		alunos.add("Mauricio");
		alunos.add("Alberto");

		System.out.println(alunos);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println(alunos.size());
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		boolean pauloEstaMatriculado = alunos.contains("Paulo");
		System.out.println(pauloEstaMatriculado);
		
		alunos.remove("Sergio");
		System.out.println(alunos);
	}
}
