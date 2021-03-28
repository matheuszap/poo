package ex_3;

import java.util.LinkedList;
import java.util.List;

public class Supervisor implements Observador{
	private List<String> registros = new LinkedList<String>();
	private double velocidadeMax = 80;
	
	public Observador obs;
	
	public Observador getObs() {
		return obs;
	}

	public void setObs(Observador obs) {
		this.obs = obs;
	}

	public List<String> getRegistros() {
		return registros;
	}

	public void atualizar(Object[] objeto) {
	if((double) objeto[0] > velocidadeMax) {
		registros.add((String) objeto[1]);
	}
	}
	
	
}
