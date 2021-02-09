package ex3;

public class Main {

	public static void main(String[] args) {
		MMC m = new MMC();
		
		m.setA(60);
		m.setB(1.70);
		
		System.out.println("IMC: " + m.calcular());
		
		Soma s = new Soma();
		
		s.setA(5);
		s.setB(5);
		
		System.out.println("Soma: " + s.calcular());
		
		Multiplicacao mult = new Multiplicacao();
		
		mult.setA(5);
		mult.setB(5);
		
		System.out.println("Multiplicação: " + mult.calcular());
	}

}
