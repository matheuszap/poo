
public class veterinario {
	private String nome;
	private float salario;
	private endereco endereco;
	private animal[] animais;
	private int quantidadeAnimais;
	
	public veterinario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
	}

	public animal[] getAnimais() {
		return animais;
	}

	public void setAnimais(animal[] animais) {
		this.animais = animais;
	}

	public int getQuantidadeAnimais() {
		return quantidadeAnimais;
	}

	public void setQuantidadeAnimais(int quantidadeAnimais) {
		this.quantidadeAnimais = quantidadeAnimais;
	}
	
	
}
