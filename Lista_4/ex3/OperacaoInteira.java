package ex3;

public abstract class OperacaoInteira {
	protected double a;
	protected double b;
	
	public OperacaoInteira setA(double a) {
		this.a = a;
		
		return this;
	}
	
	public OperacaoInteira setB(double b) {
		this.b = b;
		
		return this;
	}
	
	public abstract double calcular();
}
