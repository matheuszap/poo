package ex2;

public class Main {

	public static void main(String[] args) {
		Quadrado q = new Quadrado();
		
		q.setMedida(3);
		System.out.println("Área: " + q.calcularArea() + " Perimetro: " + q.calcularPerimetro());
		
		Circulo c = new Circulo();
		c.setMedida(3);
		
		System.out.println("Área: " + c.calcularArea() + " Perimetro: " + c.calcularPerimetro());
	}

}
