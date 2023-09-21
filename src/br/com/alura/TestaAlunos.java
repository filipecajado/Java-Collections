package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("filipe");
		alunos.add("joao");
		alunos.add("vitor");
		alunos.add("maria");
		alunos.add("carla");
		alunos.add("filipe");
		
		boolean vitorEstaMatriculado = alunos.contains("vi tor");
		System.out.println(vitorEstaMatriculado);
		
		System.out.println(alunos.size());
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<String>(alunos);
		System.out.println(alunosEmLista);
	}
}
