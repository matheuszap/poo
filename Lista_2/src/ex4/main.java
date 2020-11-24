package ex4;

public class main {

	public static void main(String[] args) {
		Estado sc = new Estado();
		
		Cidade c1 = new Cidade("Joinville",300,5000);
		Cidade c2 = new Cidade("São Francisco do Sul",100,4400);
	
		sc.adicionar_cidade(c1);
		sc.adicionar_cidade(c2);
		
		sc.filtrarRendaPerCapta(20);

	}

}
