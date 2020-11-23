package exercicios;
import java.util.Scanner;


public class ex3 {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String string = leitor.next();
        
        char[] st2 = string.toCharArray();
        char[] st = string.toCharArray();
        int comeco_st = 0;
        int final_st = st.length - 1;
        char tmp;
        
        while(final_st > comeco_st) {
        	tmp = st[comeco_st];
        	st[comeco_st] = st[final_st];
        	st[final_st] = tmp;
        	final_st--;
        	comeco_st++;
        }
        
        int cons = 0, vogal = 0;
        
        for(int j=0;j<st.length;j++) {
        	if(st[j] == 'a' || st[j] == 'e' || st[j] == 'i' || st[j] == 'o' || st[j] == 'u') {
        		vogal++;
        	}else {
        		cons++;
        	}
        }
        
        System.out.println(st);
        System.out.println("Quantidade consoantes: " + cons);
        System.out.println("Quantidade vogais: " + vogal);
        
        int count = 0;
        for(int i=0;i<st.length;i++) {
	        if(st[i] == st2[i]) {
	        	count++;
	        }
        }
        
    	if(count == st.length) {
            System.out.println("Palindromo: Sim");
      	}else {
      	  System.out.println("Palindromo: Não");
      	}

	}
}
