package apresentacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dados.*;
import negocio.*;

public class main {
	static Zoologico zoo = new Zoologico();
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean menu = true;
		
		while(menu == true) {
			System.out.println("---- MENU ZOOLOGICO ----");
			System.out.println("1 - Cadastrar um animal");
			System.out.println("2 - Cadastrar um viveiro");
			System.out.println("3 - Colocar animal em um viveiro");
			System.out.println("4 - Mostrar Viveiros");
			System.out.println("5 - Sair");
			System.out.println("---------------------------------");

			
			int opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					cadastrarAnimal();
					break;
				case 2:
					cadastrarViveiro();
					break;
				case 3:
					colocarAnimal();
					break;
				case 4:
					//mostrarViveiros();
				case 5:
					menu = false;
					break;
				default: 
					System.out.println("O Comando digitado é inválido!\n");
					break;
			}
		}

	}
	
	static void cadastrarAnimal() {
		System.out.println("Digite as informações do animal: ");
		System.out.println("É um peixe? (SIM = 1, NÃO = 0)");
		int opcao = leitor.nextInt();
		
		if(opcao == 1) {
			
			System.out.println("Nome: ");
			String nome = leitor.next();
			System.out.println("Cor: ");
			String cor = leitor.next();
			System.out.println("Espécie: ");
			String especie = leitor.next();
			System.out.println("Idade: ");
			int idade = leitor.nextInt();
			System.out.println("Largura: ");
			float largura = leitor.nextFloat();
			System.out.println("Comprimento: ");
			float comprimento = leitor.nextFloat();
			System.out.println("Altura: ");
			float altura = leitor.nextFloat();
			System.out.println("Temperatura Ideal: ");
			float temperatura = leitor.nextFloat();
			
			Peixe peixe = new Peixe();
			
			peixe.setNome(nome);
			peixe.setCor(cor);
			peixe.setEspecie(especie);
			peixe.setIdade(idade);
			peixe.setLargura(largura);
			peixe.setComprimento(comprimento);
			peixe.setAltura(altura);
			peixe.setTemperaturaIdeal(temperatura);
			
			zoo.cadastrarAnimais(peixe);
		
		}else {
		
			System.out.println("Nome: ");
			String nome = leitor.next();
			System.out.println("Cor: ");
			String cor = leitor.next();
			System.out.println("Espécie: ");
			String especie = leitor.next();
			System.out.println("Idade: ");
			int idade = leitor.nextInt();
			System.out.println("Largura: ");
			float largura = leitor.nextFloat();
			System.out.println("Comprimento: ");
			float comprimento = leitor.nextFloat();
			System.out.println("Altura: ");
			float altura = leitor.nextFloat();	
			
			Animal animal = new Animal();
			
			animal.setNome(nome);
			animal.setCor(cor);
			animal.setEspecie(especie);
			animal.setIdade(idade);
			animal.setLargura(largura);
			animal.setComprimento(comprimento);
			animal.setAltura(altura);
			
			zoo.cadastrarAnimais(animal);
			
		}
	}
	
	static void cadastrarViveiro() {
		System.out.println("Digite as informações do viveiro: ");
		System.out.println("É um aquário? (SIM = 1, NÃO = 0)");
		int opcao = leitor.nextInt();
		
		if(opcao == 1) {
			System.out.println("Nome: ");
			String nome = leitor.next();
			System.out.println("Comprimento: ");
			float comprimento = leitor.nextFloat();
			System.out.println("Largura: ");
			float largura = leitor.nextFloat();
			System.out.println("Altura: ");
			float altura = leitor.nextFloat();
			System.out.println("Temperatura: ");
			float temperatura = leitor.nextFloat();
			
			Aquario aquario = new Aquario();
			
			aquario.setNome(nome);
			aquario.setComprimento(comprimento);
			aquario.setLargura(largura);
			aquario.setAltura(altura);
			aquario.setTemperatura(temperatura);
			
			zoo.cadastrarViveiro(aquario);
		
		}else {
			
			System.out.println("Nome: ");
			String nome = leitor.next();
			System.out.println("Comprimento: ");
			float comprimento = leitor.nextFloat();
			System.out.println("Largura: ");
			float largura = leitor.nextFloat();
			
			Viveiro viveiro = new Viveiro();
			
			viveiro.setNome(nome);
			viveiro.setComprimento(comprimento);
			viveiro.setLargura(largura);
			
			zoo.cadastrarViveiro(viveiro);
		}
	}
	
	static void Animais() {
		List<Animal> animais = new ArrayList<Animal>();
		
		animais = zoo.listaAnimais();
		
		System.out.println("Lista de Animais: ");
		for(int i=0; i<animais.size(); i++) {
			System.out.println(i + " - " + animais.get(i).getNome());
		}
	}
	
	static void Viveiros() {
		List<Viveiro> viveiros = new ArrayList<Viveiro>();
		
		viveiros = zoo.getSoViveiros();
		
		System.out.println("Lista de Viveiros: ");
		for(int i=0; i<viveiros.size(); i++) {
			System.out.println(i + " - " + viveiros.get(i).getNome());
		}
	}
	
	static void colocarAnimal() {
		System.out.println("Escolha um animal: ");
		Animais();
		
		int opcao1 = leitor.nextInt();
		
		System.out.println("Escolha um viveiro: ");
		Viveiros();
		
		int opcao2 = leitor.nextInt();
		
		Animal animal = new Animal();
		Viveiro viveiro = new Viveiro();
		
		animal = zoo.retornaAnimal(opcao1);
		viveiro = zoo.retornaViveiro(opcao2);
		
		zoo.alocarAnimal(animal, viveiro);
	}
	
/*
	static void mostrarViveiros() {
		System.out.println("Aquários: ");
		
		List<Aquario> aquarios = new ArrayList<Aquario>();
		
		aquarios = zoo.getSoAquarios();
	
		
		for(int i=0; i<aquarios.size(); i++) {
			System.out.println(aquarios.get(i).toString());
		}
		//System.out.println(aquarios.toString());
	}
	
*/
	
	

}
