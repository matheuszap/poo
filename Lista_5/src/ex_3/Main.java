package ex_3;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(2000);
		
		Date vencimento = new Date(121,02,21,12,00,00);
		Boleto boleto = new Boleto(500, vencimento);
		
		try {
			conta.sacar(1000);
			System.out.println("Saldo após saque: " + conta.getSaldo());
			
			try {
				conta.pagarBoleto(boleto);
				System.out.println("Saldo após pagar boleto: " + conta.getSaldo());
			} catch (BoletoVencidoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SaldoInsuficienteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
