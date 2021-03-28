package ex_1;

public class IteratorList<T> implements Iterator<T>{
	private List<T> lista;
	private int tam;
	public int i;
	private int aux;
	
	public IteratorList(List<T> est) {
		this.lista = est;
	}
	
	public boolean hasNext() {
		return tam < lista.getTam();
	}
	
	public T next() {
		i++;
		if(tam != lista.getTam() -1) {
			tam++;
		}else {
			tam++;
		}
		
		if((aux)%2 == 0) {
			aux++;
			i--;
			return lista.get(i);
		} else {
			aux++;
			return lista.get((lista.getTam()) - i);
		}
		
	}
	
	public void reset() {
		tam = 0;
	}
}

