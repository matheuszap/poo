package dados;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int cpf;
	private String curso;
	
	private List<Semestre> semestre = new ArrayList<Semestre>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Semestre> getSemestre() {
		return semestre;
	}

	public void setSemestre(List<Semestre> semestre) {
		this.semestre = semestre;
	}
	
	
}
