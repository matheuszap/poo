package apresentacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import negocio.*;
import dados.*;

public class Main {
	static ListaTelefonica l = new ListaTelefonica();
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean menu = true;
		
		while(menu == true) {
			System.out.println("---- LISTA TELEFONICA ----");
			System.out.println("1 - Adicionar Contato");
			System.out.println("2 - Remover Contato");
			System.out.println("3 - Exibir Contatos");
			System.out.println("4 - Sair");
			System.out.println("---------------------------------");

			
			int opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					adicionarContato();
					break;
				case 2:
					removerContato();
					break;
				case 3:
					exibirContatos();
					break;
				case 4:
					menu = false;
					break;
				default: 
					System.out.println("O Comando digitado é inválido!\n");
					break;
			}
		}
	}
	
	public static Contato novoContato() {
		Contato c = new Contato();
		
		System.out.println("Digite o nome: ");
		String nome = leitor.next();
		System.out.println("Digite o telefone: ");
		int telefone = leitor.nextInt();
		
		c.setNome(nome.toUpperCase());
		c.setTelefone(telefone);
		
		return c;
	}
	
	public static void adicionarContato() {
		Contato contato = new Contato();
		
		contato = novoContato();
		
		l.adicionarContato(contato);
	}
	
	public static void removerContato() {
		System.out.println("Digite a inicial do nome: ");
		char inicial = leitor.next().charAt(0);
		
		List<Contato> lista = l.buscarContatos(inicial);
		
		System.out.println("Escolha um contato para remover: ");
		for(int i=0; i<lista.size(); i++) {
			System.out.println("Num = " + i + " Nome: " + lista.get(i).getNome());
		}
		
		int opcao = leitor.nextInt();
		
		Contato contato = lista.get(opcao);
		
		l.removerContato(contato);
	}
	
	public static void exibirContatos(char letra) {
		List<Contato> lista = l.buscarContatos(letra);
		
		System.out.println(letra + ":");
		for(int i=0; i<lista.size(); i++) {
			System.out.println("- " + lista.get(i).getNome() + ": " + lista.get(i).getTelefone());
		
		}
	}
	
	public static void exibirContatos() {
		Map<Character, List<Contato>> agenda = l.buscarContatos();
		
		for(int i=65; i<=90; i++) {
			exibirContatos((char) i);
		}
	}
	
}
