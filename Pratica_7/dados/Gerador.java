package dados;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public abstract class Gerador implements lSequencia{
	protected List<Integer> sequencia = new ArrayList();
	
	public abstract void gerar(int quantidade);
	
	public abstract List<Integer> getSequencia();
	
	public int sortear() {
		Random r = new Random();
		int num = sequencia.get(r.nextInt(sequencia.size()));
		return num;
	}

	public long somatorio() {
		int soma = 0;
		for(int i=0; i<sequencia.size(); i++) {
			soma += sequencia.get(i);
		}
		return soma;
	}

	public double mediaAritmetica() {
		double soma = 0;
		for(int i=0; i<sequencia.size(); i++) {
			soma += sequencia.get(i);
		}
		
		return soma/sequencia.size();
	}

	public double mediaGeometrica() {
		double produto = 1;
		for(int i=1; i<sequencia.size(); i++) {
			produto *= sequencia.get(i);
		}
		double d = sequencia.size();
		
		return Math.pow(produto,1/d);
	}

	public double variancia() {
		double v = 0;
		double soma = 0;
		double media = mediaAritmetica();
		
		for(int i=0; i<sequencia.size(); i++) {
			soma += Math.pow(sequencia.get(i) - media, 2);
		}
		double d = sequencia.size()-1;
		v = soma/d;
		
		return v;
		
	}

	public double desvioPadrao() {
		return Math.sqrt(variancia());
	}

	public long amplitude() {
		long menor = 99999999;
		long maior = 0;
		
		for(int i=0; i<sequencia.size(); i++) {
			 if(sequencia.get(i) > maior) {
				 maior = sequencia.get(i);
			 }
			 
			 if(sequencia.get(i) < menor) {
				 menor = sequencia.get(i);
			 }
		}
		
		return maior - menor;
	}
	
	
}
