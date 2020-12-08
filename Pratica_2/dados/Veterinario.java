package dados;

import java.util.Arrays;

public class Veterinario {
	private String nome;
	private float salario;
	private Endereco endereco;
	private Animal animais;
	private Animal[] animais_vet = new Animal[10];

	private int quantidadeAnimais;
	
	public Veterinario() {
		
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Animal[] getAnimais() {
		return animais_vet;
	}

	public void setAnimais(Animal animal) {
		this.animais = animal;
		
		animais_vet[this.quantidadeAnimais] = this.animais;
		this.quantidadeAnimais++;
	}

	public int getQuantidadeAnimais() {
		return quantidadeAnimais;
	}

	public void setQuantidadeAnimais(int quantidadeAnimais) {
		this.quantidadeAnimais = quantidadeAnimais;
	}

	@Override
	public String toString() {
		return "Veterinario [Nome = " + nome + "]";
	}
	
}
