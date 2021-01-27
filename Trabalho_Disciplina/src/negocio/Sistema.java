package negocio;

import dados.*;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Aluno> ListaAlunos = new ArrayList <Aluno>();
	
	
	public void cadastrarAluno(Aluno aluno) {
		if(aluno != null) {
			ListaAlunos.add(aluno);
		}else {
			return;
		}
	}
	
	public void CadastrarSemestre(Aluno aluno, List<Semestre> semestre) {
		for(int i=0; i<ListaAlunos.size(); i++) {
			
			//Se for o aluno em questão, entao cadastra o semestre
			if(aluno == ListaAlunos.get(i)) {
				
				Semestre s = new Semestre();
				
				//s.setCodigo();
				
				//ListaAlunos.get(i).setSemestre(semestre.add(s));
			}
		}
	}
	
	public List<Aluno> retornaLista(){
		return ListaAlunos;
	}
	
	
	
	
	
	
	
}
