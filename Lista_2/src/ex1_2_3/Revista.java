package ex1_2_3;

public class Revista {
	private String nome;
	private String genero;
	private int ano;
	
	public Revista() {
	
	}
	
	public Revista(String nome, String genero, int ano) {
		this.nome = nome;
		this.genero = genero;
		this.ano = ano;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return "Revista [nome=" + nome + ", genero=" + genero + ", ano=" + ano + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Revista other = (Revista) obj;
		if (ano != other.ano)
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
