package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("****************************************************************************");
		System.out.println("** O programa só irá funcionar se a quantidade inserida de alunos for par **");
		System.out.println("****************************************************************************");
		Turma t = new Turma();
		
		int op = 1;
		
		while(op != -1) {
			System.out.println("Nome: ");
			String nome = leitor.next();
			System.out.println("Idade: ");
			int idade = leitor.nextInt();
			
			Aluno a = new Aluno();
			
			a.setNome(nome);
			a.setIdade(idade);
			
			t.adicionarAluno(a);
			t.ordenarAlunosPorIdade();
			
			System.out.println("1 - Continuar");
			System.out.println("-1 - Parar leitura");
			
			op = leitor.nextInt();
		}
		
		List<Par<Aluno>> list = new ArrayList<Par<Aluno>>();
		
		list = t.separaEmPares();
		
		System.out.println("DUPLAS CRIADAS: ");
		for(int i=0; i<list.size(); i++) {
			System.out.println("Dupla: " + i + " - Nome_1: " + list.get(i).getElemento1().getNome() + " Idade_1: " + list.get(i).getElemento1().getIdade() + " /// Nome_2: " + list.get(i).getElemento2().getNome() + " Idade_2: " + list.get(i).getElemento2().getIdade());
		}

	}

}
