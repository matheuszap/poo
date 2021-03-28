package ex_1;

public class Main {

	public static void main(String[] args) {
		List<String> lista = new List<String>(8);
		
		lista.set("A");
		lista.set("B");
		lista.set("C");
		lista.set("D");
		lista.set("E");
		lista.set("F");
		lista.set("G");
		lista.set("H");
		
		while(lista.getIt().hasNext()) {
			System.out.println(lista.getIt().next());
		}

	}

}
