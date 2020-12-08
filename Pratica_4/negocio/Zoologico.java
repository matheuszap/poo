package negocio;

import dados.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Zoologico {
	private List<Animal> animais = new ArrayList<Animal>();
	private List<Viveiro> viveiros = new ArrayList<Viveiro>();
	
	public void cadastrarViveiro(Viveiro viveiro) {
		viveiros.add(viveiro);
	}
	
	public void cadastrarAnimais(Animal animal) {
		animais.add(animal);
	}

	public void alocarAnimal(Animal animal, Viveiro viveiro) {
		if((animal instanceof Peixe) && (viveiro instanceof Aquario)) {
			if(viveiro.espacoDisponivel() > animal.calculaEspacoOcupado()*0.7) {
				Aquario aquario = new Aquario();
				Peixe peixe = new Peixe();
				
				aquario = (Aquario) viveiro;
				peixe = (Peixe) animal;
				
				if((aquario.getTemperatura() + 3 > peixe.getTemperaturaIdeal()) || 
					(aquario.getTemperatura() - 3 < peixe.getTemperaturaIdeal())){
					System.out.println("Temperatura não é adequada para este peixe!");
				}else {
					System.out.println("Animal alocado com sucesso!");
					viveiro.adicionarAnimal(animal);
				}
				
				viveiro.adicionarAnimal(animal);
			}
			
		}else {
			if(viveiro.espacoDisponivel() > animal.calculaEspacoOcupado()*0.7) {
				System.out.println("Animal alocado com sucesso!");
				viveiro.adicionarAnimal(animal);
			}
		}
	}
	
		
	public List<Aquario> getSoAquarios() {
		int max = 0;
		
		for(int i=0; i<viveiros.size(); i++) {
			if(viveiros.get(i) instanceof Aquario) {
				max++;
			}
		}
		
		List<Aquario> aquarios = new ArrayList<Aquario>(max);
		
		for(int i=0; i<viveiros.size(); i++) {
			if(viveiros.get(i) instanceof Aquario) {
				aquarios.add((Aquario) (viveiros.get(i)));
			}
		}
		
		return aquarios;
	}
	
	public List<Viveiro> getSoViveiros() {
		int max = 0;
		
		for(int i=0; i<viveiros.size(); i++) {
			if(viveiros.get(i) instanceof Aquario) {
				
			}else {
				max++;
			}
		}
			
			List<Viveiro> viveiros2 = new ArrayList<Viveiro>(max);
			
		for(int i=0; i<viveiros.size(); i++) {
			if(viveiros.get(i) instanceof Aquario) {
					
			}else {
				viveiros2.add((Viveiro) (viveiros.get(i)));
			}
		}

	return viveiros;
	
	}
	
	public List<Animal> listaAnimais() {
		return animais;
	}
	
	public Animal retornaAnimal(int pos) {
		return animais.get(pos);
	}
	
	public Viveiro retornaViveiro(int pos) {
		return viveiros.get(pos);
	}
}
