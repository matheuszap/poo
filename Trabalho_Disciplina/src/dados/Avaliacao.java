package dados;

public class Avaliacao {
	private String nome;
	private float peso;
	private String data;

	
	public String toString() {
		return "Avaliacao [nome=" + nome + ", peso=" + peso + ", data=" + data + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}
	
	
}
