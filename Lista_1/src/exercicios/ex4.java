package exercicios;

public class ex4 {

	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(somaRecursiva(vetor,9));

	}
	
	static int Primo(int num) {
		if(num == 1) return 0;
	    int i;
	    for (i = 2; i <= num - 1; i++) {
	        if (num % i == 0)
	            return 0;
	    }
	    return 1;
	}

	public static int somaRecursiva(int vetor[], int indice) {
		if(indice == 0) {
			return 0;
		}
		
		if(Primo(vetor[indice]) == 1) {
			return vetor[indice] + somaRecursiva(vetor, indice - 1);
		}else {
			return somaRecursiva(vetor, indice - 1);
		}
	}
}

