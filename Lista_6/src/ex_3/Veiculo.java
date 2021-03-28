package ex_3;

import java.util.LinkedList;
import java.util.List;

public class Veiculo implements Sujeito{
	private String placa;
	private double velocidade;
	
	private List<Observador> observadores = new LinkedList<Observador>();
	public Object array[] = new Object[2];
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void acelerar() {
		this.velocidade += 50;
		notificar();
	}

	public String toString() {
		return "Veiculo [placa = " + placa + ", velocidade = " + velocidade + "]";
	}
	
	public void notificar() {		
		for(Observador obs: observadores) {
			array[0] = velocidade;
			array[1] = toString();
			obs.atualizar(array);
		}
	}

	public void adicionar(Observador observador) {
		observadores.add(observador);
	}

	public void remover(Observador observador) {
		observadores.remove(observador);
	}

	public List<Observador> getObservadores() {
		return observadores;
	}

	public void setObservadores(List<Observador> observadores) {
		this.observadores = observadores;
	}

	public Object[] getArray() {
		return array;
	}

	public void setArray(Object[] array) {
		this.array = array;
	}
	
	
}
