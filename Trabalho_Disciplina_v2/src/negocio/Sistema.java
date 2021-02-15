package negocio;

import dados.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sistema {
	private List<Aluno> ListaAlunos = new ArrayList <Aluno>();
	static Scanner leitor = new Scanner(System.in);
	
	public void cadastrarAluno(Aluno aluno) {
		if(aluno != null) {
			ListaAlunos.add(aluno);
		}
	}
	
	public void cadastrarSemestre(int cpf, Semestre semestre) {
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				ListaAlunos.get(i).adicionarSemestre(semestre);
			}
		}
	}
	
	public void cadastrarDisciplina(int cpf, Semestre semestre, Disciplina disciplina) {
		int fase = semestre.getFase();
		
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
				
				for(int j=0; j<s.size(); j++) {
					if(s.get(j).getFase() == fase) {
						s.get(j).adicionarDisciplina(disciplina);
					}	
				}
			}
		}
	}
	
	public void cadastrarAvaliacao(int cpf, Semestre semestre, Disciplina disciplina, Avaliacao avaliacao) {
		int fase = semestre.getFase();
		int codigo = avaliacao.getCodigo();
		
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
				
				for(int j=0; j<s.size(); j++) {
					if(s.get(j).getFase() == fase) {
						List<Disciplina> d = s.get(j).getDisciplinas();
						
						for(int k=0; k<d.size(); k++) {
							if(d.get(k).getCodigo() == codigo) {
								d.get(k).adicionarAvaliacao(avaliacao);
							}
						}
					}
				}
			}
		}
	}
	
	public List<Aluno> retornaLista() {
		return ListaAlunos;
	}
	

}
