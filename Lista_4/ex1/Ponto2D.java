package ex1;


public class Ponto2D {
	private double x;
	private double y;
	
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double calcularDistancia(Ponto2D outro) {
		double d2 = 0;
		
		d2 = Math.sqrt(Math.pow(this.x - outro.getX(), 2) + Math.pow(this.y - outro.getY(), 2));
		
		return d2;
	}
}
