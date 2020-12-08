package apresentacao;

import java.util.Scanner;

import dados.*;

public class Main {
	public static void main(String[] args) {
	       Scanner leitor = new Scanner(System.in);
	       SistemaPetShop s = new SistemaPetShop();
			boolean menu = true;
			
			while(menu) {
				System.out.println("\n");
				System.out.println("------- MENU DE OP��ES VETERIN�RIO --------");
				System.out.println("1. Cadastrar veterin�rio");
				System.out.println("2. Mostrar veterin�rios cadastrados");
				System.out.println("3. Cadastrar endere�o de um veterin�rio");
				System.out.println("4. Cadastrar um animal");
				System.out.println("5. Mostrar os animais cadastrados");
				System.out.println("6. Cadastrar o dono de um animal (Nome, CPF e ENDERE�O)");
				System.out.println("7. Sair");
				System.out.println("------------------------------------------");
			
			int opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					s.cadastrarVeterinario();
					break;
				case 2:
					s.mostrarVeterinarios();
					break;
				case 3:
					s.cadastrarEnderecoVeterinario();
					break;
				case 4:
					s.cadastrarAnimalVeterinario();
					break;
				case 5:
					s.mostrarAnimais();
					break;
				case 6:
					s.cadastrarDonoAnimal();
					break;
				case 7:
					menu = false;
					break;
				default:
					System.out.println("O Comando digitado � inv�lido!\n");
					break;
				}
			}
		}
	}
