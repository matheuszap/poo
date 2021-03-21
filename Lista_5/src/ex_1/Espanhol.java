package ex_1;

public class Espanhol implements Idioma{
	public String boaVindas() {
		String s = "Bienvenido!";
		
		return s;
	}

	public String finalizar() {
		String s = "Saliendo...";
		
		return s;
	}

	
	public String requisitarValor() {
		String s = "Ingresse un número inteiro:";

		return s;
	}


	public String somarValores(int x, int y) {
		int soma = x + y;
		
		return x + " más " + y + " es " + soma;
 
	}


	public String multiplicarValores(int x, int y) {
		int mult = x*y;
		
		return x + " por " + y + " es " + mult;
	
	}


	public String mmcValores(int x, int y) {
		 int mmc = x * (y / mdc(x, y));

		 return "El mínimo común múltiplo entre " + x +" e " + y + " es " + mmc;
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
