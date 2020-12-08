package dados;

public class Peixe extends Animal{
	private float temperaturaIdeal;

	public Peixe() {
		super();
	}

	public Peixe(float temperaturaIdeal) {
		super();
		this.temperaturaIdeal = temperaturaIdeal;
	}


	public float getTemperaturaIdeal() {
		return temperaturaIdeal;
	}

	public void setTemperaturaIdeal(float temperaturaIdeal) {
		this.temperaturaIdeal = temperaturaIdeal;
	}

	@Override
	public String toString() {
		return "Nome = " + getNome() + ", Cor = " + getCor()
				+ ", Espécie = " + getEspecie() +  ", Temperatura Ideal = " + temperaturaIdeal;
	}
	
	
	
	
}
