package ex_1;

import java.util.LinkedList;

public class List<T> {
	private LinkedList<T> lista;
	private int tam;
	private Iterator<T> it = new IteratorList<T>(this);
	
	public void setLista(LinkedList<T> lista) {
		this.lista = lista;
	}
	
	public LinkedList<T> getLista() {
		return lista;
	}
	
	public List(int tam) {
		this.lista = new LinkedList<T>();
		this.tam = tam;
	}
	
	public int getTam() {
		return this.tam;
	}
	
	public void set(T elem) {
		lista.add(elem);
	}
	
	public T get(int i) {
		return lista.get(i);
	}

	public Iterator<T> getIt() {
		return it;
	}

	public void setIt(Iterator<T> it) {
		this.it = it;
	}
	
	
	
}
