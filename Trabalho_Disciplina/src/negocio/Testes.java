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
			System.out.println("3 - Mostrar Alunos");
			System.out.println("4 - Mostrar Semestres");
			System.out.println("5 - Cadastrar Disciplina");
			System.out.println("6 - Mostrar Disciplinas");
			System.out.println("-------------------------");

			
			int opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					sistema.cadastrarAluno();
					break;
				case 2:
					sistema.cadastrarSemestre();
					break;
				case 3:
					sistema.mostraAlunos();
					break;
				case 4:
					sistema.mostraSemestres();
					break;
				case 5:
					sistema.cadastrarDisciplina();
					break;
				case 6:
					sistema.mostraDisciplinas();
					break;
				case 9:
					menu = false;
					break;
				default: 
					System.out.println("O Comando digitado é inválido!\n");
					break;
			}
		}	
	}

}
