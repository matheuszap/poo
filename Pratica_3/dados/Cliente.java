package dados;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int cpf;
	private String nome;
	private String endereco;
	private int telefone;
	private List<Reserva> reservas = new ArrayList<Reserva>();
	
	public void reservarIda(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public void reservarVolta(Reserva ida, Reserva volta) {
		for(int i=0; i<reservas.size(); i++) {
			if(reservas.get(i).getNumReserva() == ida.getNumReserva()) {
				reservas.get(i).setVolta(volta);
			}
		}
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public String toString() {
		return "Cliente [CPF = " + cpf + ", Nome = " + nome + ", Endereço = " + endereco + ", Telefone = " + telefone
				+ "\n" + "Reserva Ida = " + reservas + "]";
	}

}
