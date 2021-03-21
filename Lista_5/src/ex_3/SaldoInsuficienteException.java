package ex_3;

public class SaldoInsuficienteException extends Exception{
	private double valorFaltante;
	
	public SaldoInsuficienteException(String mensagem, double valorFaltante) {
		super(mensagem + valorFaltante);
	}

	public double getValorFaltante() {
		return valorFaltante;
	}

	public void setValorFaltante(double valorFaltante) {
		this.valorFaltante = valorFaltante;
	}
	
	

}
