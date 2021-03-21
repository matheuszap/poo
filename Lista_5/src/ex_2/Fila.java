package ex_2;

import java.util.LinkedList;
import java.util.List;

public class Fila<T> {
	private List<T> objetos;
	private int max;
	
	public Fila(int max) {
		objetos = new LinkedList<T>();
		this.max = max;
	}
	
	public void add(T objeto) throws FilaCheiaException {
	if(tam() == max) {
		throw new FilaCheiaException();
	}
		objetos.add(objeto);
	}
	
	
	public T tirar() throws FilaVaziaException {
	if(tam() == 0) {
		throw new FilaVaziaException();
	}
	T obj = objetos.remove(0);
	return obj;
	}
	
	public int tam() {
		int tamanho = objetos.size();
		return tamanho;
	}

	public List<T> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<T> objetos) {
		this.objetos = objetos;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	
	
}
