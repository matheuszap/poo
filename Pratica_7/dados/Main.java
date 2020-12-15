package dados;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList();
		
		// TESTE DOS RESULTADOS //
		
		/*
		Naturais n = new Naturais();
		
		n.gerar(5);
		s = n.getSequencia();
	
		
		System.out.println("Naturais:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("\n");
		
		
		int num = n.sortear();
		long somatorio = n.somatorio();
		double ma = n.mediaAritmetica();
		double mg = n.mediaGeometrica();
		double v = n.variancia();
		double d = n.desvioPadrao();
		long a = n.amplitude();
		
		System.out.println("Sorteado: " + num);
		System.out.println("Somatório: " + somatorio);
		System.out.println("Média Aritmética: " + ma);
		System.out.println("Média Geométrica: " + mg);
		System.out.println("Variância: " + v);
		System.out.println("Desvio Padrão: " + d);
		System.out.println("Amplitude: " + a);
		
		System.out.println("\n");
		*/
		
		/*
		Abundantes ab = new Abundantes();
		
		ab.gerar(30);
		
		s = ab.getSequencia();
	
		
		System.out.println("Abundantes:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("\n");
		
		int num = ab.sortear();
		long somatorio = ab.somatorio();
		double ma = ab.mediaAritmetica();
		double mg = ab.mediaGeometrica();
		double v = ab.variancia();
		double d = ab.desvioPadrao();
		long a = ab.amplitude();
		
		System.out.println("Sorteado: " + num);
		System.out.println("Somatório: " + somatorio);
		System.out.println("Média Aritmética: " + ma);
		System.out.println("Média Geométrica: " + mg);
		System.out.println("Variância: " + v);
		System.out.println("Desvio Padrão: " + d);
		System.out.println("Amplitude: " + a);
		
		System.out.println("\n");
		*/
		
		Fibonacci fib = new Fibonacci();
		
		fib.gerar(5);
		
		s = fib.getSequencia();
	
		
		System.out.println("Fibonacci:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("\n");
		
		int num = fib.sortear();
		long somatorio = fib.somatorio();
		double ma = fib.mediaAritmetica();
		double mg = fib.mediaGeometrica();
		double v = fib.variancia();
		double d = fib.desvioPadrao();
		long a = fib.amplitude();
		
		System.out.println("Sorteado: " + num);
		System.out.println("Somatório: " + somatorio);
		System.out.println("Média Aritmética: " + ma);
		System.out.println("Média Geométrica: " + mg);
		System.out.println("Variância: " + v);
		System.out.println("Desvio Padrão: " + d);
		System.out.println("Amplitude: " + a);
		
		System.out.println("\n");
		
		
	}
}
