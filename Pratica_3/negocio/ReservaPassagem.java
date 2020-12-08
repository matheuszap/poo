package negocio;

import dados.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservaPassagem {
	private List<Cidade> listaCidades = new ArrayList<Cidade>();
	private List<Cliente> listaClientes= new ArrayList<Cliente>();
	
	
	public void cadastrarCidade(Cidade cidade) {
		listaCidades.add(cidade);
	}
	
	public void cadastraCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	public void reservarIda(Cliente cliente, Reserva reserva) {
		for(int i=0; i<listaClientes.size(); i++) {
			if(listaClientes.get(i).getCpf() == cliente.getCpf()) {
				listaClientes.get(i).reservarIda(reserva);
			}
		}
	}
	
	public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta) {
		for(int i=0; i<listaClientes.size(); i++) {
			if(listaClientes.get(i).getCpf() == cliente.getCpf()) {
				for(int j=0; j<listaClientes.get(i).getReservas().size(); j++) {
					if(listaClientes.get(i).getReservas().get(i).getNumReserva() == ida.getNumReserva()) {
						listaClientes.get(i).getReservas().get(i).setVolta(volta);
					}
				}
			}
		}
	}
	
	public void mostrarReservas(int cpfCliente) {
		for(int i=0; i<listaClientes.size(); i++) {
			if(listaClientes.get(i).getCpf() == cpfCliente) {
				System.out.println(listaClientes.get(i).toString());
			}
		}
	}
	
	public List<Cliente> mostrarClientes() {
		return listaClientes;
	}
	
	public List<Cidade> mostrarCidades() {
		return listaCidades;
	}
	
	public Cidade retorna_cidade(String nome) {
		for (int i=0; i<listaCidades.size(); i++) {
			if (listaCidades.get(i).getNome() == nome) {
				return listaCidades.get(i);
			}
		}
		return null;
	}
	
	public Cliente retorna_cliente(int cpf) {
		for (int i=0; i<listaClientes.size(); i++) {
			if (listaClientes.get(i).getCpf() == cpf) {
				return listaClientes.get(i);
			}
		}
		return null;
	}
	
}
