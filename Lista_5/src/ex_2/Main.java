package ex_2;

import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner leitor = new Scanner(System.in);
	static Fila fila = new Fila(5);
	
	public static void main(String[] args) throws FilaCheiaException {	
		boolean menu = true;
		
		while(menu == true) {
			System.out.println("Interface de cadastro");
			System.out.println(" 1 - Adicionar");
			System.out.println(" 2 - Remover");
			System.out.println("-1 - Sair");
		
			int opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1: 
					System.out.println("Escolha um nome para a pessoa:");
					String nome = leitor.next();
					Pessoa p = new Pessoa(nome);
					
					if(fila.tam() == fila.getMax()) {
						duplicar_tam();
					}
					
					fila.add(p);
					
					
					show();
					break;
				case 2:
					
				try {
					fila.tirar();
				} catch (FilaVaziaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				show();
					
					break;
				case -1:
					menu = false;
					break;
				default:
					System.out.println("O Comando digitado é inválido!\n");
					break;
			}
		}
	}
	
	public static void show() {
		List<Pessoa> pessoas = fila.getObjetos();
		
		for(int i=0; i<pessoas.size(); i++) {
			System.out.println(i + " - Nome: " + pessoas.get(i).getNome());
		}
	}
	
	public static void duplicar_tam() {
		int max = fila.getMax();
		
		fila.setMax(max*2);
	}
}
