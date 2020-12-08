package dados;

import java.util.ArrayList;
import java.util.List;


public class Viveiro {
	protected String nome;
	protected float comprimento;
	protected float largura;
	protected List<Animal> animais = new ArrayList<Animal>();
	
	public float calculaEspaco() {
		return comprimento * largura;
	}
	
	private float espacoOcupado() {
		float espaco = 0;
		for(int i=0; i<animais.size(); i++) {
			espaco += animais.get(i).calculaEspacoOcupado();
		}
		return espaco;
	}
	
	public float espacoDisponivel() {
		return calculaEspaco() - espacoOcupado();
	}
	
	public void adicionarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public Viveiro() {

	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
	
	
	
	
	
}
