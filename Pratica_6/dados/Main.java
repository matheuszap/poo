package dados;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList();
		
		Naturais n = new Naturais();
		
		n.gerar(10);
		s = n.getSequencia();
		
		System.out.println("Naturais:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("\n");
			
		Abundantes a = new Abundantes();
		
		a.gerar(25);
		
		s = a.getSequencia();
		
		System.out.println("Abundantes:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("\n");
		
		Fibonacci f = new Fibonacci();
		
		f.gerar(10);
		
		s = f.getSequencia();
		
		System.out.println("Fibonacci:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("\n");

		Fatoriais fat = new Fatoriais();
		
		fat.gerar(10);
		
		s = fat.getSequencia();
		
		System.out.println("Fatoriais:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("\n");
		
		NumerosPrimos p = new NumerosPrimos();
		
		p.gerar(10);

		s = p.getSequencia();
		
		System.out.println("Números Primos:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("\n");
		
		Quadrados q = new Quadrados();
		
		q.gerar(20);
		
		s = q.getSequencia();
		
		System.out.println("Quadrados:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
	
		
		System.out.println("\n");
		
		Perfeitos perf = new Perfeitos();
		
		perf.gerar(30);
		
		s = perf.getSequencia();
		
		System.out.println("Perfeitos:");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		
		
		
		
		
	}
}
