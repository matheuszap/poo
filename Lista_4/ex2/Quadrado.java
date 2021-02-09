package ex2;

public class Quadrado extends FormaGeometrica{
	
	public double calcularArea() {
		double area = 0;
		
		area = getMedida() * getMedida();
		
		return area;
	}
	
	public double calcularPerimetro() {
		double p = 0;
		
		p = 4*getMedida();
		
		return p;
	}
}
