package ex_3;

import java.util.Date;

public class Boleto {
	private double valor;
	private Date vencimento;
	
	public Boleto(double valor, Date vencimento) {
		super();
		this.valor = valor;
		this.vencimento = vencimento;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	
	
}
