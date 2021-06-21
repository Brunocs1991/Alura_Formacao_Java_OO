package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import br.com.alura.classes.Aluno;
import br.com.alura.classes.Aula;
import br.com.alura.classes.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "instrutor Alura");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo", 34672);
		Aluno a2 = new Aluno("Guilherme Slveira", 5617);
		Aluno a3 = new Aluno("Mauricio", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});

//		for (Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}

		Set<Aluno> alunos = javaColecoes.getAlunos();

		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		Vector<Aluno> vetor = new Vector<>();

		System.out.println("O aluno " + a1 + " esta matriculado");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno rodrigo = new Aluno("Rodrigo", 34672);
		System.out.println(javaColecoes.estaMatriculado(rodrigo));

		// obrigatoriamente o seguinte e true.
		System.out.println(a1.hashCode() == rodrigo.hashCode());

	}
}
