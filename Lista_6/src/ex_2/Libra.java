package ex_2;

public class Libra extends Moeda{
	
	public Libra(double valor) {
		this.simbolo = "£";
		this.valor = valor;
	}

	public double converterDolar() {
		double valor_em_dolar = 0;
		
		valor_em_dolar = this.valor * 7.94;
		
		return valor_em_dolar;
	}
}
