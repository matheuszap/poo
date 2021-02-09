package ex1;

public class Main {

	public static void main(String[] args) {
		Ponto2D p1 = new Ponto2D(4,3);
		Ponto2D p2 = new Ponto2D(0,0);
		
		System.out.println(p1.calcularDistancia(p2));

		Ponto3D p3 = new Ponto3D(3,4,9);
		Ponto3D p4 = new Ponto3D(0,0,0);
		
		System.out.println(p3.calcularDistancia(p4));
	}

}
