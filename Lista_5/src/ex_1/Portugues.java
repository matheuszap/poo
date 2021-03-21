package ex_1;

public class Portugues implements Idioma{
	
	public String boaVindas() {
		String s = "Bem-vindo!";
		
		return s;
	}

	public String finalizar() {
		String s = "Finalizando...";
		
		return s;
	}

	
	public String requisitarValor() {
		String s = "Digite um inteiro:";

		return s;
	}


	public String somarValores(int x, int y) {
		int soma = x + y;
		
		return x + " mais " + y + " � " + soma;
 
	}


	public String multiplicarValores(int x, int y) {
		int mult = x*y;
		
		return x + " vezes " + y + " � " + mult;
	
	}


	public String mmcValores(int x, int y) {
		 int mmc = x * (y / mdc(x, y));

		 return "O m�nimo m�ltiplo comum entre " + x +" e " + y + " � " + mmc;
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
