package negocio;

import dados.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		Aluno a = new Aluno();
		List<Semestre> s = new ArrayList<Semestre>();

		a.setNome("Matheus");
		a.setCpf(115);
		a.setCurso("Computacao");
		a.setSemestres(s);
		
		sistema.cadastrarAluno(a);
		/*
		Aluno a2 = new Aluno();
		List<Semestre> s2 = new ArrayList<Semestre>();

		a2.setNome("Ana");
		a2.setCpf(120);
		a2.setCurso("Fisica");
		a2.setSemestres(s2);
		
		sistema.cadastrarAluno(a2);
		*/
		///////////////////////////////////////////////////////
		
		Semestre semestre = new Semestre();
		List<Disciplina> d = new ArrayList<Disciplina>();
		
		semestre.setCodigo(000);
		semestre.setFase(1);
		semestre.setDisciplinas(d);
		
		sistema.cadastrarSemestre(115, semestre);
		/*
		Semestre semestre2 = new Semestre();
		List<Disciplina> d2 = new ArrayList<Disciplina>();
		
		semestre2.setCodigo(001);
		semestre2.setFase(2);
		semestre2.setDisciplinas(d2);
		
		sistema.cadastrarSemestre(115, semestre2);
		*/
		///////////////////////////////////////////////////////
		
		Disciplina disciplina = new Disciplina();
		List<Avaliacao> av = new ArrayList<Avaliacao>();
		List<Float> notas = new ArrayList<Float>();
		
		disciplina.setNome("poo");
		disciplina.setCodigo(0001);
		disciplina.setDepartamento("Computação");
		disciplina.setMedia_final(0);
		disciplina.setNotas(notas);
		disciplina.setAvaliacoes(av);
		
		sistema.cadastrarDisciplina(115, semestre, disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		List<Avaliacao> av2 = new ArrayList<Avaliacao>();
		List<Float> notas2 = new ArrayList<Float>();
		
		disciplina2.setNome("cdi");
		disciplina2.setCodigo(0002);
		disciplina2.setDepartamento("Computação");
		disciplina2.setMedia_final(0);
		disciplina2.setNotas(notas2);
		disciplina2.setAvaliacoes(av2);
		
		sistema.cadastrarDisciplina(115, semestre, disciplina2);
		
		
		/*
		Disciplina disciplina3 = new Disciplina();
		List<Avaliacao> av3 = new ArrayList<Avaliacao>();
		List<Float> notas3 = new ArrayList<Float>();
		
		disciplina3.setNome("ali");
		disciplina3.setCodigo(0003);
		disciplina3.setDepartamento("Computação");
		disciplina3.setMedia_final(0);
		disciplina3.setNotas(notas3);
		disciplina3.setAvaliacoes(av3);
		
		sistema.cadastrarDisciplina(115, semestre2, disciplina3);
		*/
		
		///////////////////////////////////////////////////////
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setCodigo(0001);
		avaliacao.setNome("p1");
		avaliacao.setData("01/01/2021");
		avaliacao.setPeso(0);
		
		sistema.cadastrarAvaliacao(115, semestre, disciplina, avaliacao);
		
		Avaliacao avaliacao2 = new Avaliacao();
		avaliacao2.setCodigo(0002);
		avaliacao2.setNome("p2");
		avaliacao2.setData("02/01/2021");
		avaliacao2.setPeso(0);
		
		sistema.cadastrarAvaliacao(115, semestre, disciplina2, avaliacao2);
		
		///////////////////////////////////////////////////////
		
		List<Aluno> ListaAlunos = sistema.retornaLista();
		
		System.out.println("ALUNO: ");
		for(int i=0;i<ListaAlunos.size();i++) {
			System.out.println("Num: " + i + " Nome: " + ListaAlunos.get(i).getNome() + " CPF: " + ListaAlunos.get(i).getCpf());
			System.out.println("\n");
			
			List<Semestre> sem = ListaAlunos.get(i).getSemestres();
			
			System.out.println("----------------- SEMESTRES -------------------\n");
				for(int j=0;j<sem.size();j++) {
					System.out.println("Num: " + j + " - " + sem.get(j).dadosSemestre());
			
					List<Disciplina> dis = ListaAlunos.get(i).getSemestres().get(j).getDisciplinas();
					System.out.println("\n");
					
					System.out.println("DISCIPLINAS: ");
					for(int k=0; k<dis.size(); k++) {
						System.out.println("Num: " + k + " - " + dis.get(k).dadosDisciplina());
						
						List<Avaliacao> ava = ListaAlunos.get(i).getSemestres().get(j).getDisciplinas().get(k).getAvaliacoes();
						
						System.out.println("AVALIAÇÕES: ");
						for(int l=0; l<ava.size(); l++) {
							System.out.println("Num: " + l + " - " + ava.get(l).dadosAvaliacao());
						}
						System.out.println("\n");
					}
					
					System.out.println("\n");
					System.out.println("-------------------------------------------");
				}	
			}
		
		
		}
	}
