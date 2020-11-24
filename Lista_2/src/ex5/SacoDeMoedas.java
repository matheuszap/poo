package ex5;

public class SacoDeMoedas {
	private Moeda[] moedas = new Moeda[50];
	
	public Moeda[] puxarMoedas(int x) {
		for(int i=0; i<x; i++) {
			Moeda m = new Moeda();
			
			float valor = (float) (Math.random()*0.90);
			m.setValor(valor);
			
			moedas[i] = m;
		}
		return moedas;
	}

	public Moeda[] getMoedas() {
		return moedas;
	}

	public void setMoedas(Moeda[] moedas) {
		this.moedas = moedas;
	}
}
