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
		List<Float> notas = new ArrayList<Float>();
		List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
		
		d.setNome(nome);
		d.setCodigo(codigo);
		d.setDepartamento(departamento);
		d.setNotas(notas);
		d.setNota_exame(0);
		d.setAvaliacao(avaliacoes);
		
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
	
	public int mostraDisciplinas() {
		int op1 = mostraSemestres();
		
		System.out.println("Escolha um semestre para mostrar as disciplinas:");
		int op2 = leitor.nextInt();
		
		List<Disciplina> disciplinas = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina();
		
		for(int i=0; i<disciplinas.size(); i++) {
			System.out.println(i + " - " + "Nome: " + disciplinas.get(i).getNome());
		}
		
		return op2;
	}
	
	public Avaliacao criaAvaliacao() {
		System.out.println("Tema da avaliação: ");
		String nome = leitor.next();
		System.out.println("Peso: ");
		float peso = leitor.nextFloat();
		System.out.println("Data: ");
		String data = leitor.next();
		
		Avaliacao a = new Avaliacao();
		
		a.setNome(nome);
		a.setPeso(peso);
		a.setData(data);
		
		return a;
	}
	
	public void cadastrarAvaliacao() {
		int op1 = mostraSemestres();
		int op2 = mostraDisciplinas();
		
		System.out.println("Escolha uma disciplina para cadastrar uma avaliação: ");
		int op3 = leitor.nextInt();
		
		List<Avaliacao> avaliacoes = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina().get(op3).getAvaliacao();
		
		Avaliacao a = criaAvaliacao();
		
		avaliacoes.add(a);		
	}
	
	public void mostraAvaliacoes() {
		int op1 = mostraSemestres();
		int op2 = mostraDisciplinas();
		
		System.out.println("Escolha uma disciplina para mostrar as avaliações: ");
		int op3 = leitor.nextInt();
		
		List<Avaliacao> avaliacoes = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina().get(op3).getAvaliacao();
		
		for(int i=0; i<avaliacoes.size(); i++) {
			System.out.println(i + " - " + "Tema: " + avaliacoes.get(i).getNome() + " Peso: " + avaliacoes.get(i).getPeso() + " Data: "
					+ avaliacoes.get(i).getData());
		}
	}
	
	public void inserirNotas() {
		int op1 = mostraSemestres();
		int op2 = mostraDisciplinas();
		
		System.out.println("Escolha uma disciplina para inserir suas notas: ");
		int op3 = leitor.nextInt();
		
		List<Float> notas = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina().get(op3).getNotas();
		
		System.out.println("Digite suas notas: (Digite -1 para finalizar)");
		
		float n = 0;
		float soma = 0;
		
		while(n != -1) {
			n = leitor.nextFloat();
			
			if(n != -1) {
				notas.add(n);
			}
			
			soma += n;
		}
	}
	
	public void mostraNotas() {
		int op1 = mostraSemestres();
		int op2 = mostraDisciplinas();
		
		System.out.println("Escolha uma disciplina para mostrar suas notas: ");
		int op3 = leitor.nextInt();
		
		List<Float> notas = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina().get(op3).getNotas();
		
		System.out.println("Suas notas para a disciplina de " + ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina().get(op3).getNome() + " são:");
		
		for(int i=0; i<notas.size(); i++) {
			System.out.println("Nota " + i + ": " + notas.get(i));
		}
	}
	
	public void calcularMedia() {
		int op1 = mostraSemestres();
		int op2 = mostraDisciplinas();
		
		System.out.println("Escolha uma disciplina para calcular sua média: ");
		int op3 = leitor.nextInt();
		
		List<Float> notas = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina().get(op3).getNotas();
		
		float soma = 0;
		
		for(int i=0; i<notas.size(); i++) {
			soma += notas.get(i);
		}
		
		float media = soma/notas.size();
		
		System.out.println("Sua média para a disciplina de " + ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina().get(op3).getNome() + ": " + media);
		
		float nota_exame = 0;
		
		if(media >= 7) {
			System.out.println("Você está aprovado!");
		}else {
			nota_exame = (float) ((-1.5*media)+12.5);
			System.out.println("Nota necessária para o exame: " + nota_exame);
		}
	}
	
	public void editar() {
		System.out.println("----- MENU DE EDIÇÃO ----- ");
		System.out.println("1. Remover um semestre");
		System.out.println("2. Remover uma disciplina");
		System.out.println("--------------------------");
		
		int op = leitor.nextInt();
		
		if(op == 1) {
			int op2 = mostraSemestres();
			
			System.out.println("Escolha um semestre para ser removido: ");
			
			int op3 = leitor.nextInt();
			
			List<Semestre> s = ListaAlunos.get(op2).getSemestre();
			
			s.remove(op3);
		}
		
		if(op == 2) {
			int op1 = mostraSemestres();
			int op2 = mostraDisciplinas();
			
			System.out.println("Escolha uma disciplina para ser removida: ");
			
			int op3 = leitor.nextInt();
			
			List<Disciplina> disciplinas = ListaAlunos.get(op1).getSemestre().get(op2).getDisciplina();
			
			disciplinas.remove(op3);
		}
		

		
	}
 	
}

