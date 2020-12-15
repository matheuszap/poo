package dados;

import java.util.List;

public class Fatoriais extends Gerador{
	public void gerar(int quantidade) {
		for(int i=1; i<=quantidade; i++) {
			sequencia.add(fatorial(i));
		}
	}
	
	public List<Integer> getSequencia() {
		return sequencia;
	}
	
	public int fatorial(int n) {
		int fat = 1;
		int aux = n-1;
		
		for(int i=2; i<n; i++) {
			fat *= aux;
			aux--;
		}
		return fat;
	}
	
}
