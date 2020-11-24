package ex5;

public class main {

	public static void main(String[] args) {
		SacoDeMoedas s = new SacoDeMoedas();
		int x = 10;
		
		Moeda[] m = new Moeda[x];
		
		
		m = s.puxarMoedas(x);
		
		System.out.println("Valores retirados do saco: ");
		for(int i=0; i<x; i++) {
			System.out.printf("Valor: R$ %.2f\n",m[i].getValor());
		}
		
		float soma = 0;
		for(int i=0; i<x; i++) {
			soma += m[i].getValor();
		}
		
		System.out.println("Soma total dos valores: R$ " + soma);
		

	}

}
