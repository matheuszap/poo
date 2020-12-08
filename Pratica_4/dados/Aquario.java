package dados;

public class Aquario extends Viveiro{
	private float altura;
	private float temperatura;
	
	public Aquario() {
		super();
	}
	
	public float calculaEspaco() {
		return comprimento * largura * altura;
	}
	
	public void adicionarAnimal(Animal animal) {
		if(animal instanceof Peixe) {
			animais.add(animal);
		}else {
			System.out.println("Espécie não é um peixe!");
		}
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return " getAnimais()=" + getAnimais();
	}
	
	
}
