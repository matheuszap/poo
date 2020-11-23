package exercicios;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		int i,j,k1,k2;
		int a[][], b[][], c[][], d[][];
		  
		System.out.println("Matriz A (linhas e colunas):");
		int la = leitor.nextInt();		
		int ca = leitor.nextInt();		
		
		System.out.println("Matriz B (linhas e colunas):");
		int lb = leitor.nextInt();		
		int cb = leitor.nextInt();		
		  
		a = new int[la][ca];
		b = new int[lb][cb];
		c = new int[la][cb];
		d = new int[la][cb];
		
		int tmp;
		  
		for(i=0;i<la;i++){
			for(j=0;j<ca;j++){
			a[i][j] = (int) (1+ (Math.random()*100));    
			}
		}  
		
		for(i=0;i<lb;i++){
			for(j=0;j<cb;j++){
			b[i][j] = (int) (1+ (Math.random()*100));    
			}
		}  	
		
		for(i=0;i<la;i++){
			for(j=0;j<cb;j++){
			c[i][j] = a[i][j] + b[i][j];
			}
		}  
		
		 for(k1=0;k1<la;k1++){
			 for(k2=0;k2<cb;k2++){
			   tmp=0;
			    for(i=0;i<ca;i++){
			      tmp=tmp+a[k1][i]*b[i][k2];
			    }
			      d[k1][k2]=tmp;
			}
		}
		
		
		System.out.println("\n");
		System.out.println("Elementos acima da diagonal principal da soma: ");
		
		for(i=0;i<la;i++){
			for(j=i+1;j<cb;j++){
			System.out.println(c[i][j]);
			
			}
		}
		
		System.out.println("\n");
		System.out.println("Elementos acima da diagonal principal da multiplicação: ");
		
		for(i=0;i<la;i++){
			for(j=i+1;j<cb;j++){
			System.out.println(d[i][j]);
			
			}
		}
		
	}

}
