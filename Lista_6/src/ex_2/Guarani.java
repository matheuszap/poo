package ex_2;

public class Guarani extends Moeda{
	
	public Guarani(double valor) {
		this.simbolo = "₲";
		this.valor = valor;
	}

	public double converterDolar() {
		double valor_em_dolar = 0;
		
		valor_em_dolar = this.valor * 0.00015;
		
		return valor_em_dolar;
	}
}