package ex_2;

public class Main {

	public static void main(String[] args) {
		MoedaFactory factory = new MoedaFactory();
		
		Moeda m1 = factory.createMoeda(TipoMoeda.REAL, 10);
		Moeda m2 = factory.createMoeda(TipoMoeda.DOLAR, 10);
		Moeda m3 = factory.createMoeda(TipoMoeda.EURO, 10);
		Moeda m4 = factory.createMoeda(TipoMoeda.GUARANI, 10);
		Moeda m5 = factory.createMoeda(TipoMoeda.LIBRA, 10);
		
		System.out.println(m1.converterDolar());
		System.out.println(m2.converterDolar());
		System.out.println(m3.converterDolar());
		System.out.println(m4.converterDolar());
		System.out.println(m5.converterDolar());
	}

}
