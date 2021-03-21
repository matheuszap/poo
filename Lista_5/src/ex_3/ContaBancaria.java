package ex_3;

import java.util.Date;

public class ContaBancaria {
	private double saldo;

	public ContaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(valor > saldo) {
			double valorFaltante = valor - saldo;
			
			SaldoInsuficienteException saldoInsuficiente = new SaldoInsuficienteException("Saldo insuficiente, valor faltante: ", valorFaltante);
			saldoInsuficiente.setValorFaltante(valorFaltante);
			throw saldoInsuficiente;
		}else {
			setSaldo(this.saldo - valor);	
		}
	}
	
	public void pagarBoleto(Boleto boleto) throws SaldoInsuficienteException, BoletoVencidoException {
		double valor = boleto.getValor();
		
		if(valor > saldo) {
			double valorFaltante = valor - saldo;
			
			SaldoInsuficienteException saldoInsuficiente = new SaldoInsuficienteException("Saldo insuficiente, valor faltante: ", valorFaltante);
			saldoInsuficiente.setValorFaltante(valorFaltante);
			throw saldoInsuficiente;
		}
		
		Date dataSistema = new Date();
		
		if(dataSistema.compareTo(boleto.getVencimento()) == 1) { //Boleto vencido
			BoletoVencidoException boletoVencido = new BoletoVencidoException("Boleto vencido. Data de vencimento: ", boleto.getVencimento());
			throw boletoVencido;
		}
		
		setSaldo(this.saldo - valor);	
	}
	
	
}
