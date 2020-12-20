package ex4;

public class Par<T>{
	private T elemento1;
	private T elemento2;
	
	public T getElemento1() {
		return elemento1;
	}

	public void setElemento1(T elemento1) {
		this.elemento1 = elemento1;
	}

	public T getElemento2() {
		return elemento2;
	}

	public void setElemento2(T elemento2) {
		this.elemento2 = elemento2;
	}

	public String toString() {
		return "Par [elemento1=" + elemento1 + ", elemento2=" + elemento2 + "]";
	}
	
	
}
