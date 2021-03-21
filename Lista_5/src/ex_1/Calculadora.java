package ex_1;

import java.util.Scanner;

public class Calculadora {
	static Portugues p = new Portugues();
	static Ingles i = new Ingles();
	static Espanhol e = new Espanhol();
	static Scanner leitor = new Scanner(System.in);
	
	public static void somar() {
		
		System.out.println(p.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(p.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(p.somarValores(v1, v2));
		
		
		/*
		System.out.println(i.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(i.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(i.somarValores(v1, v2));
		*/
		
		/*
		System.out.println(e.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(e.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(e.somarValores(v1, v2));
		*/
	}
	
	public static void multiplicar() {
		
		System.out.println(p.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(p.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(p.multiplicarValores(v1, v2));
		
		/*
		System.out.println(i.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(i.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(i.multiplicarValores(v1, v2));
		*/
		
		/*
		System.out.println(e.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(e.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(e.multiplicarValores(v1, v2));
		*/
	}
	
	public static void mmc() {
		System.out.println(p.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(p.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(p.mmcValores(v1, v2));
		
		/*
		System.out.println(i.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(i.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(i.mmcValores(v1, v2));
		*/
		
		/*
		System.out.println(e.requisitarValor());
		int v1 = leitor.nextInt();
		System.out.println(e.requisitarValor());
		int v2 = leitor.nextInt();
		
		System.out.println(e.mmcValores(v1, v2));
		*/
	}

	public static void executar() {
		System.out.println(p.boaVindas());
		
		somar();
		multiplicar();
		mmc();
		
		System.out.println(p.finalizar());
	}
	
	public static void main(String[] args) {
		executar();
	}

}
