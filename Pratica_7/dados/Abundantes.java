package dados;

import java.util.List;

public class Abundantes extends Gerador{
	
	public void gerar(int quantidade) {
		for(int i=0; i<=quantidade; i++) {
			if(i < somadiv(i)) {
				sequencia.add(i);
			}
		}
	}
	
	public int somadiv(int n) {
		int soma = 0;
		for(int i=1; i<n; i++) {
			if(n % i == 0) {
				soma += i;
			}
		}
		return soma;
	}
	
	public List<Integer> getSequencia() {
		return sequencia;
	}

}
