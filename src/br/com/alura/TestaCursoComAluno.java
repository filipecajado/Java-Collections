package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("MOdelando colecoes", 22));
		
		Aluno a1 = new Aluno("Filipe cajado", 34444);
		Aluno a2 = new Aluno("Joao cajado", 34343);
		Aluno a3 = new Aluno("Maria cajado", 123131);
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados");
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
	}

}
