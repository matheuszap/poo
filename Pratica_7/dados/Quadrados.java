package dados;

import java.lang.Math;
import java.util.List;

public class Quadrados extends Gerador{
	
	public void gerar(int quantidade) {
		for(int i=1; i<=quantidade; i++) {
			if(Quadrado(i) == true) {	
				sequencia.add(i);
				}
			}
		}
	
	public List<Integer> getSequencia() {
		return sequencia;
	}
	
	public static boolean Quadrado(int i) {
		Double resultado = Math.sqrt(i);
		if (resultado != null) {
			return (resultado.intValue() == resultado.doubleValue());
		}else {
			return false;
		}
	}
}	
