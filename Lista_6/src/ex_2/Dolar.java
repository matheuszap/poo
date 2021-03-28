package ex_2;

public class Dolar extends Moeda{
	
	public Dolar(double valor) {
		this.simbolo = "US$";
		this.valor = valor;
	}

	public double converterDolar() {
		double valor_em_dolar = 0;
		
		valor_em_dolar = this.valor * 1;
		
		return valor_em_dolar;
	}
}
