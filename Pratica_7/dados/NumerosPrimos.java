package dados;

import java.util.List;

public class NumerosPrimos extends Gerador {
	
	public void gerar(int quantidade) {
		for(int i=1; i<=quantidade; i++) {
			if(Primo(i) == true) {
			sequencia.add(i);
			}
		}
	}
	
	public List<Integer> getSequencia() {
		return sequencia;
	}
	
	private static boolean Primo(int numero) {
		if(numero == 1) {
			return false;
		}
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    	}
	    		return true;
	    	}
	
}
