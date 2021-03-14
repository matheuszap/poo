package dados;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private int codal; //Criado BD
	
	private String nome;
	private int cpf;
	private String curso;
	
	private List<Semestre> semestres = new ArrayList<Semestre>();
	
	public Aluno() {
		
	}
	
	public Aluno(int codal, String nome, int cpf, String curso, List<Semestre> semestres) {
		super();
		this.codal = codal;
		this.nome = nome;
		this.cpf = cpf;
		this.curso = curso;
		this.semestres = semestres;
	}

	public int getCodal() {
		return codal;
	}

	public void setCodal(int codal) {
		this.codal = codal;
	}

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

	public List<Semestre> getSemestres() {
		return semestres;
	}

	public void setSemestres(List<Semestre> semestres) {
		this.semestres = semestres;
	}

	public void adicionarSemestre(Semestre s) {
		if(s != null) {
			semestres.add(s);
		}
	}
	
	public void removerSemestre(int fase) {
		for(int i=0; i<semestres.size(); i++) {
			if(semestres.get(i).getFase() == fase) {
				semestres.remove(i);
			}
		}
	}

	public String dadosAluno() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", curso=" + curso + ", semestres=" + semestres + "]";
	}
	
	
	
	
	
	
	
	
	
}
