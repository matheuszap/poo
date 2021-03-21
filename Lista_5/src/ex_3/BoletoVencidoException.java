package ex_3;

import java.util.Date;

public class BoletoVencidoException extends Exception {
	private Date dataVencimento;
	
	public BoletoVencidoException(String mensagem, Date dataVencimento) {
		super(mensagem + dataVencimento);
	}
}
