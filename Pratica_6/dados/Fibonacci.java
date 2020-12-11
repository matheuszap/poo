package dados;

import java.util.List;

public class Fibonacci extends Gerador {
	
	public void gerar(int quantidade) {
		for(int i=0; i<=quantidade; i++) {
			sequencia.add(fibonacci(i));
		}
	}
	
	public List<Integer> getSequencia() {
		return sequencia;
	}
	
	public int fibonacci(int n) {
		int a = 0;
		int b = 1;
		int aux = 0;
		
		if(n == 0) return 1;
		if(n == 1) return 1;
		
		for(int i=0; i<n; i++) {
			aux = a+b;
			a = b;
			b = aux;
		}
		return aux;
	}
}
