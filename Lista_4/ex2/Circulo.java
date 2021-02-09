package ex2;

public class Circulo extends FormaGeometrica{
	
	public double calcularArea() {
		double area = 0;
		double pi = 3.14159265359;
		
		area = pi*getMedida()*getMedida();
		
		return area;
	}
	
	public double calcularPerimetro() {
		double area = 0;
		double pi = 3.14159265359;
		
		area = 4*pi*getMedida();
		
		return area;
	}
	
}
