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
				System.out.println("------- MENU DE OPÇÕES VETERINÁRIO --------");
				System.out.println("1. Cadastrar veterinário");
				System.out.println("2. Mostrar veterinários cadastrados");
				System.out.println("3. Cadastrar endereço de um veterinário");
				System.out.println("4. Cadastrar um animal");
				System.out.println("5. Mostrar os animais cadastrados");
				System.out.println("6. Cadastrar o dono de um animal (Nome, CPF e ENDEREÇO)");
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
					System.out.println("O Comando digitado é inválido!\n");
					break;
				}
			}
		}
	}
