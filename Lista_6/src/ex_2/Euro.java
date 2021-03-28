package ex_2;

public class Euro extends Moeda{
	
	public Euro(double valor) {
		this.simbolo = "€";
		this.valor = valor;
	}

	public double converterDolar() {
		double valor_em_dolar = 0;
		
		valor_em_dolar = this.valor * 1.18;
		
		return valor_em_dolar;
	}
}