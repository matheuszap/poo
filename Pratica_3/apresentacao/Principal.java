package apresentacao;

import dados.*;
import negocio.*;

import java.util.Scanner;
import java.util.List;

public class Principal {
	static ReservaPassagem r = new ReservaPassagem();

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		boolean menu = true;
		
		while(menu == true) {
			System.out.println("---- MENU SISTEMA DE VIAGENS ----");
			System.out.println("1 - Fazer uma reserva");
			System.out.println("2 - Cadastrar um cliente");
			System.out.println("3 - Cadastrar uma cidade");
			System.out.println("4 - Mostrar reservas");
			System.out.println("5 - Sair");
			System.out.println("---------------------------------");

			
			int opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					fazerReserva();
					break;
				case 2:
					cadastrarCliente();
					break;
				case 3:
					cadastrarCidade();
					break;
				case 4:
					mostrarReservas();
					break;
				case 5:
					menu = false;
					break;
				default: 
					System.out.println("O Comando digitado é inválido!\n");
					break;
			}
		}
	}
	
		
		public static void cadastrarCliente() {
			Scanner leitor = new Scanner(System.in);
			Cliente c = new Cliente(); 
			
			System.out.println("\n---- Cadastro do Cliente ----");
			System.out.println("Digite o CPF:");
			int cpf = leitor.nextInt();
			System.out.println("Digite o nome:");
			String nome = leitor.next();
			System.out.println("Digite o endereço:");
			String endereco = leitor.next();
			System.out.println("Digite o telefone:");
			int telefone = leitor.nextInt();
			
			c.setCpf(cpf);
			c.setNome(nome);
			c.setEndereco(endereco);
			c.setTelefone(telefone);
			
			r.cadastraCliente(c);
		}
		
		public static void cadastrarCidade() {
			Scanner leitor = new Scanner(System.in);
			Cidade cidade = new Cidade();
			
			System.out.println("\n---- Cadastro de Cidade ----");
			System.out.println("Digite a cidade:");
			String nome = leitor.next();
			System.out.println("Digite o estado:");
			String estado = leitor.next();
			
			cidade.setNome(nome);
			cidade.setEstado(estado);
			
			r.cadastrarCidade(cidade);
		}
		
		public static void mostrarReservas() {
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Digite o CPF:");
			int cpf = leitor.nextInt();
			
			r.mostrarReservas(cpf);
			
		}
		
		public static Reserva Reserva_menu() {
			Scanner leitor = new Scanner(System.in);
			Reserva res = new Reserva();
			
			System.out.println("Digite o número da reserva:");
			int numReserva = leitor.nextInt();
			System.out.println("Digite a data do voo:");
			String dataVoo = leitor.next();
			System.out.println("Digite a hora do voo:");
			String horaVoo = leitor.next();
			System.out.println("Digite o preço:");
			float preco = leitor.nextFloat();
			System.out.println("Digite a classe:");
			String classeVoo = leitor.next();
			System.out.println("Digite a poltrona:");
			int poltrona = leitor.nextInt();
			
			res.setNumReserva(numReserva);
			res.setDataVoo(dataVoo);
			res.setHoraVoo(horaVoo);
			res.setPreco(preco);
			res.setClasseVoo(classeVoo);
			res.setPoltrona(poltrona);
			
			return res;
		}
		
		public static void fazerReserva() {
			Scanner leitor = new Scanner(System.in);
			
			Reserva res = new Reserva();
			Reserva volta = new Reserva();
			
			System.out.println("\n---- Reserva ----");
			System.out.println("Reservar ida e volta? (Sim = 1, Não = 0)");
			
			int opcao = leitor.nextInt();
			
			if(opcao == 1) {
				System.out.println("-- Reserva ida --");
				res.setIdaEvolta(true);
				res = Reserva_menu();
				
				System.out.println("Cidade origem: ");
				String ori = leitor.next();
				Cidade origem = r.retorna_cidade(ori);
				
				if(origem == null) {
					cadastrarCidade();
				}
				origem = r.retorna_cidade(ori);
				res.setOrigem(origem);
				
				System.out.println("Cidade destino: ");
				String dest = leitor.next();
				Cidade destino = r.retorna_cidade(dest);
				
				if(destino == null) {
					cadastrarCidade();
				}
				
				res.setDestino(destino);
				System.out.println("-- Reserva volta --");
				volta = Reserva_menu();
				volta.setOrigem(destino);
				volta.setDestino(origem);
				res.setVolta(volta);
			}else {
				
				res.setIdaEvolta(false);
				res = Reserva_menu();
				
				System.out.println("Cidade origem: ");
				String ori = leitor.next();
				Cidade origem = r.retorna_cidade(ori);
				
				if(origem == null) {
					cadastrarCidade();
				}
				origem = r.retorna_cidade(ori);
				res.setOrigem(origem);
				
				System.out.println("Cidade destino: ");
				String dest = leitor.next();
				Cidade destino = r.retorna_cidade(dest);
				
				if(destino == null) {
					cadastrarCidade();
				}
				
				res.setDestino(destino);	
			}
			
			System.out.println("Digite o CPF do cliente: ");
			int cpf = leitor.nextInt();
			Cliente cliente = r.retorna_cliente(cpf);
			
			if(cliente == null) {
				cadastrarCliente();
			}
			cliente = r.retorna_cliente(cpf);
			
			if(opcao == 1) {
				r.reservarIda(cliente, res);
				r.reservarVolta(cliente, res, volta);
			}else {
				r.reservarIda(cliente, res);
			}		
		}
				
}
















