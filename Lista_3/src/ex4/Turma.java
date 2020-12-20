package ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ex1.Pessoas;

public class Turma{
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	void ordenarAlunosPorIdade() {
		Collections.sort(alunos, ComparaIdade);
	}
	
	public List<Par<Aluno>> separaEmPares() {
		List<Par<Aluno>> list = new ArrayList<Par<Aluno>>();
		int i=0;
		
		while(i<alunos.size()) {
			Par<Aluno> par = new Par<Aluno>();
			
			par.setElemento1(alunos.get(i));
			par.setElemento2(alunos.get(++i));
			
			list.add(par);
			i++;
		}
		
		return list;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

public static Comparator<Aluno> ComparaIdade = new Comparator<Aluno>() {
	public int compare(Aluno a1, Aluno a2) {
		int idade1 = a1.getIdade();
		int idade2 = a2.getIdade();

		return idade1 - idade2;
		}
	};
}