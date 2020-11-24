package ex4;

public class Cidade {
	private String nome;
	private int quant_hab;
	private int renda_total;
	
	public Cidade() {
		
	}

	public Cidade(String nome, int quant_hab, int renda_total) {
		this.nome = nome;
		this.quant_hab = quant_hab;
		this.renda_total = renda_total;
	}
	
	public int per_capta() {
		return (int) (this.renda_total/this.quant_hab);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuant_hab() {
		return quant_hab;
	}

	public void setQuant_hab(int quant_hab) {
		this.quant_hab = quant_hab;
	}

	public int getRenda_total() {
		return renda_total;
	}

	public void setRenda_total(int renda_total) {
		this.renda_total = renda_total;
	}

	public String toString() {
		return "Cidade [nome=" + nome + ", quant_hab=" + quant_hab + ", renda_total=" + renda_total + "]";
	}
	
	
}
