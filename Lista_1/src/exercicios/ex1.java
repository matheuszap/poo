package exercicios;

public class ex1 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		
        for(int i = 0; i < vetor.length; i++) {
        	vetor[i] = (int) (1+ (Math.random()*100));
        }

        for(int i=1; i < vetor.length; i++) {
            for(int j=0; j<i; j++) {
            	if(vetor[i] < vetor[j]) {
            		int temp = vetor[i];
            		vetor[i] = vetor[j];
            		vetor[j] = temp;
            	}
            }
        }
        
        System.out.println("Vetor ordenado:");
        for(int i=0;i<vetor.length;i++) {
        		System.out.println(vetor[i]);
        	}
        
        System.out.print("Quantidade de números primos: ");
        int count = 0;
        for(int i=0;i<vetor.length;i++) {
        	if(Primo(vetor[i]) == true) {
        		count++;
        	}
        }
        System.out.println(count);
        
        System.out.print("Média: ");
        float media = 0;
        for(int i=0;i<vetor.length;i++) {
        	media += vetor[i];
        }
        System.out.println(media/10);
    }

	
	private static boolean Primo(int numero) {
		if(numero == 1) {
			return false;
		}
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    	}
	    		return true;
	    	}
}