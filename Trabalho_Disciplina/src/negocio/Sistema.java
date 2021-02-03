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
	
	public int mostraSemestres() {
		System.out.println("Escolha um aluno para mostrar o semestre:");
		mostraAlunos();
		
		int op = leitor.nextInt();
		List<Semestre> s = ListaAlunos.get(op).getSemestre();
		
		for(int i=0; i<s.size(); i++) {
			System.out.println(i + " - Código Semestre: " + s.get(i).getCodigo() + " Fase: " + s.get(i).getFase());
		}
		return op;
	}
	
	public Disciplina criaDisciplina() {
		System.out.println("Nome: ");
		String nome = leitor.next();
		System.out.println("Código: ");
		int codigo = leitor.nextInt();
		System.out.println("Departamento: ");
		String departamento = leitor.next();
		
		Disciplina d = new Disciplina();
		List<Float> n = new ArrayList<Float>();
		
		d.setNome(nome);
		d.setCodigo(codigo);
		d.setDepartamento(departamento);
		d.setNotas(n);
		d.setNota_exame(0);
		
		return d;
	}
	
	public void cadastrarDisciplina() {
		int op1 = mostraSemestres();
		
		System.out.println("Escolha um semestre para cadastrar as disciplinas:");
		int op2 = leitor.nextInt();
		
		List<Disciplina> disciplinas = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina();
		
		Disciplina d = criaDisciplina();
		
		disciplinas.add(d);
	}
	
	public void mostraDisciplinas() {
		int op1 = mostraSemestres();
		
		System.out.println("Escolha um semestre para mostrar as disciplinas:");
		int op2 = leitor.nextInt();
		
		List<Disciplina> disciplinas = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina();
		
		for(int i=0; i<disciplinas.size(); i++) {
			System.out.println(i + " - " + "Nome: " + disciplinas.get(i).getNome());
		}
	}
 	
}

