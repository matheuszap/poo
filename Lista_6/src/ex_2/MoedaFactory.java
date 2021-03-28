package ex_2;

public class MoedaFactory {
	private static MoedaFactory instance = null;
	
	public static MoedaFactory getInstance(){
		if(instance == null) {
			instance = new MoedaFactory();
		}
		return instance;
	}
	
	
	public Moeda createMoeda(TipoMoeda tipo, double valor) {
		switch(tipo) {
		case REAL: 
			return new Real(valor);
		case DOLAR:
			return new Dolar(valor);
		case EURO:
			return new Euro(valor);
		case GUARANI:
			return new Guarani(valor);
		case LIBRA:
			return new Libra(valor);
		default:
			throw new IllegalArgumentException("Tipo de moeda inexistente");
		}
	}
}
