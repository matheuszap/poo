package dados;

import java.util.ArrayList;
import java.util.List;

public class Semestre {
	private int codigo;
	private int fase;
	
	private List<Disciplina> disciplina = new ArrayList<Disciplina>();

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
