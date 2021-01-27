package negocio;

import dados.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Testes {
	static Sistema sistema = new Sistema();
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean menu = true;
		
		while(menu == true) {
			System.out.println("---------- MENU ---------");
			System.out.println("1 - Cadastrar um aluno");
			System.out.println("2 - Cadastrar um Semestre");
			System.out.println("-------------------------");

			
			int opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					cadAluno();
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					mostraAlunos();
				case 5:
					menu = false;
					break;
				default: 
					System.out.println("O Comando digitado é inválido!\n");
					break;
			}
		}
	}
	
	public static void cadAluno() {
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
		
		sistema.cadastrarAluno(a);
	}
	
	public static void mostraAlunos() {
		List<Aluno> l = new ArrayList<Aluno>();
		
		l = sistema.retornaLista();
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(i + " - " + l.get(i).getNome());
		}
	}

}
