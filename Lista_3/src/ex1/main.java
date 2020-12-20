package ex1;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<Pessoas> pessoas = new ArrayList<Pessoas>();
		int op = 1;
		
		while(op != -1) {
			System.out.println("Nome: ");
			String nome = leitor.next();
			System.out.println("Idade: ");
			int idade = leitor.nextInt();
			System.out.println("CPF: ");
			int cpf = leitor.nextInt();
			System.out.println("Cidade: ");
			String cidade = leitor.next();
			
			Pessoas p = new Pessoas();
			
			p.setNome(nome);
			p.setIdade(idade);
			p.setCpf(cpf);
			p.setCidade(cidade);
			
			pessoas.add(p);
		
			Collections.sort(pessoas, Pessoas.ComparaNome);
			
			System.out.println("LISTA: ");
			for(int i=0; i<pessoas.size(); i++) {
				System.out.println("Nome: " + pessoas.get(i).getNome() + " - " + "Idade: " + pessoas.get(i).getIdade() + " - " + "CPF: " + 
						pessoas.get(i).getCpf() + " - " + "Cidade: " + pessoas.get(i).getCidade());
			}
			
			float cont = 0;
			float percent = 0;
			for(int i=0; i<pessoas.size(); i++) {
				if(pessoas.get(i).getIdade() == p.getIdade()) {
					cont++;
				}
			}
			
			percent = (cont/pessoas.size())*100;
			
			System.out.println("\n");
			System.out.println("Porcentagem mesma faixa etária: " + percent);
			
			System.out.println("1 - Continuar");
			System.out.println("-1 - Parar leitura");
			
			op = leitor.nextInt();
			
		}

	}

}
