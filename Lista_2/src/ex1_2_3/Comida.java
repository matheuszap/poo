package ex1_2_3;


public class Comida {
	private String nome_prato;
	private String ingredientes;
	private boolean vegana;
	
	public Comida() {
		
	}
	
	public Comida(String nome_prato, String ingredientes, boolean vegana) {
		this.nome_prato = nome_prato;
		this.ingredientes = ingredientes;
		this.vegana = vegana;
	}
	
	public String getNome_prato() {
		return nome_prato;
	}
	public void setNome_prato(String nome_prato) {
		this.nome_prato = nome_prato;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public boolean isVegana() {
		return vegana;
	}
	public void setVegana(boolean vegana) {
		this.vegana = vegana;
	}
	
	public String toString() {
		return "Comida [nome_prato=" + nome_prato + ", ingredientes=" + ingredientes + ", vegana=" + vegana + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comida other = (Comida) obj;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nome_prato == null) {
			if (other.nome_prato != null)
				return false;
		} else if (!nome_prato.equals(other.nome_prato))
			return false;
		if (vegana != other.vegana)
			return false;
		return true;
	}
	
	
	
}
