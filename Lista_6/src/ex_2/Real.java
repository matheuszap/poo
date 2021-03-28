package ex_2;

public class Real extends Moeda{
	
	public Real(double valor) {
		this.simbolo = "R$";
		this.valor = valor;
	}

	public double converterDolar() {
		double valor_em_dolar = 0;
		
		valor_em_dolar = this.valor * 5.76;
		
		return valor_em_dolar;
	}
	
	
}
