package dados;

import java.util.List;
import java.util.Random;
import java.lang.Math;

public class Naturais extends Gerador {
	
	public void gerar(int quantidade) {
		for(int i=1; i<=quantidade; i++) {
			sequencia.add(i);
		}
	}
	
	public List<Integer> getSequencia() {
		return sequencia;
	}

}
