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
		String s = "Ingresse un n�mero inteiro:";

		return s;
	}


	public String somarValores(int x, int y) {
		int soma = x + y;
		
		return x + " m�s " + y + " es " + soma;
 
	}


	public String multiplicarValores(int x, int y) {
		int mult = x*y;
		
		return x + " por " + y + " es " + mult;
	
	}


	public String mmcValores(int x, int y) {
		 int mmc = x * (y / mdc(x, y));

		 return "El m�nimo com�n m�ltiplo entre " + x +" e " + y + " es " + mmc;
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
