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
		
		return x + " mais " + y + " é " + soma;
 
	}


	public String multiplicarValores(int x, int y) {
		int mult = x*y;
		
		return x + " vezes " + y + " é " + mult;
	
	}


	public String mmcValores(int x, int y) {
		 int mmc = x * (y / mdc(x, y));

		 return "O mínimo múltiplo comum entre " + x +" e " + y + " é " + mmc;
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
