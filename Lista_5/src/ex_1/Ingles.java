package ex_1;

public class Ingles implements Idioma{
	public String boaVindas() {
		String s = "Welcome!";
		
		return s;
	}

	public String finalizar() {
		String s = "Exiting...";
		
		return s;
	}

	
	public String requisitarValor() {
		String s = "Type an integer:";

		return s;
	}


	public String somarValores(int x, int y) {
		int soma = x + y;
		
		return x + " plus " + y + " is " + soma;
 
	}


	public String multiplicarValores(int x, int y) {
		int mult = x*y;
		
		return x + " times " + y + " is " + mult;
	
	}


	public String mmcValores(int x, int y) {
		 int mmc = x * (y / mdc(x, y));

		 return "The least common multiple between " + x +" and " + y + " is " + mmc;
	}
	
	 private static int mdc(int a, int b){
	        while(b != 0){
	            int r = a % b;
	            a = b;
	            b = r;
	        }
	        return a;
	    }
}
