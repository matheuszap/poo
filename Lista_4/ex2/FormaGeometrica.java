package ex2;

public abstract class FormaGeometrica {
	private double medida;

	public double getMedida() {
		return medida;
	}

	public void setMedida(double medida) {
		this.medida = medida;
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
}
