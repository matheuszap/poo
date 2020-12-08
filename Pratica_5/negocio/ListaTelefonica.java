package negocio;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

import dados.*;

public class ListaTelefonica {
	Map<Character, List<Contato>> agenda = new HashMap<Character, List<Contato>>();
	
	
	public ListaTelefonica() {
		for(int i=65; i<=90; i++) {
			List<Contato> contatos = new LinkedList<Contato>();
			agenda.put((char) i, contatos);
		}
	}
	
	public void adicionarContato(Contato contato) {
		agenda.get(contato.getNome().charAt(0)).add(contato);
	}
	
	public void removerContato(Contato contato) {
		List<Contato> contatos = agenda.get(contato.getNome().charAt(0));
		
		for(int i=0; i<contatos.size(); i++) {
			if(contatos.get(i).equals(contato)) {
				contatos.remove(i);
			}
		}
	}
	
	public List<Contato> buscarContatos(char letra) {
		return agenda.get(letra);
	}
	
	public Map<Character, List<Contato>> buscarContatos() {
		return agenda;
	}
	
}
