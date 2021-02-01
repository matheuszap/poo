package negocio;

import dados.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sistema {
	private List<Aluno> ListaAlunos = new ArrayList <Aluno>();
	static Scanner leitor = new Scanner(System.in);
	
	public static Aluno criaAluno() {
		System.out.println("Nome: ");
		String nome = leitor.next();
		System.out.println("CPF: ");
		int cpf = leitor.nextInt();
		System.out.println("Curso: ");
		String curso = leitor.next();
		
		Aluno a = new Aluno();
		List<Semestre> s = new ArrayList<Semestre>();
		
		a.setNome(nome);
		a.setCpf(cpf);
		a.setCurso(curso);
		a.setSemestre(s);
		
		return a;
	}
	
	public void cadastrarAluno() {
		Aluno a = criaAluno();
		
		if(a != null) {
			ListaAlunos.add(a);
		}else {
			return;
		}
	}
	
	public void mostraAlunos() {
		for(int i=0; i<ListaAlunos.size(); i++) {
			System.out.println(i + " - " + ListaAlunos.get(i).getNome());
		}
	}
	
	public static Semestre criaSemestre() {
		System.out.println("Código: ");
		int codigo = leitor.nextInt();
		System.out.println("Fase: ");
		int fase = leitor.nextInt();
		
		Semestre semestre = new Semestre();
		List<Disciplina> d = new ArrayList<Disciplina>();
		
		semestre.setCodigo(codigo);
		semestre.setFase(fase);
		semestre.setDisciplina(d);
		
		return semestre;
	}
	
	
	public void cadastrarSemestre() {
		System.out.println("Escolha um aluno para cadastrar um semestre:");
		mostraAlunos();
		
		int op = leitor.nextInt();
		List<Semestre> s = ListaAlunos.get(op).getSemestre();
		
		Semestre semestre = criaSemestre();
		
		s.add(semestre);
	}
	
	public void mostraSemestres() {
		System.out.println("Escolha um aluno para mostrar o semestre:");
		mostraAlunos();
		
		int op = leitor.nextInt();
		List<Semestre> s = ListaAlunos.get(op).getSemestre();
		
		for(int i=0; i<s.size(); i++) {
			System.out.println("Código Semestre: " + s.get(i).getCodigo() + " Fase: " + s.get(i).getFase());
		}
	}
	
}

