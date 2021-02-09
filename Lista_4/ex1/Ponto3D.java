package ex1;

public class Ponto3D extends Ponto2D{
	private double z;
	
	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double calcularDistancia(Ponto3D outro) {
		double d3 = 0;
		
		d3 = Math.sqrt(Math.pow(this.getX() - outro.getX(), 2) + Math.pow(this.getY() - outro.getY(), 2) + Math.pow(this.z - outro.getZ(), 2));
		
		return d3;
	}
}
