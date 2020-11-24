package ex1_2_3;

public class Pais {
	private String nome;
	private int quant_estados;
	private boolean republica;
	
	public Pais() {
		
	}

	public Pais(String nome, int quant_estados, boolean republica) {
		this.nome = nome;
		this.quant_estados = quant_estados;
		this.republica = republica;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuant_estados() {
		return quant_estados;
	}
	public void setQuant_estados(int quant_estados) {
		this.quant_estados = quant_estados;
	}
	public boolean isRepublica() {
		return republica;
	}
	public void setRepublica(boolean republica) {
		this.republica = republica;
	}

	public String toString() {
		return "Pais [nome=" + nome + ", quant_estados=" + quant_estados + ", republica=" + republica + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (quant_estados != other.quant_estados)
			return false;
		if (republica != other.republica)
			return false;
		return true;
	}
	
}
