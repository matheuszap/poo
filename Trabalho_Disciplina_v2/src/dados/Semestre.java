package dados;

import java.util.ArrayList;
import java.util.List;

public class Semestre {
	private int cods; //Criado BD
	
	private int codigo;
	private int fase;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	private int codal; //Criado BD
	
	public Semestre() {
		
	}
	
	public Semestre(int cods, int codigo, int fase, List<Disciplina> disciplinas) {
		super();
		this.cods = cods;
		this.codigo = codigo;
		this.fase = fase;
		this.disciplinas = disciplinas;
	}

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

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public int getCods() {
		return cods;
	}

	public void setCods(int cods) {
		this.cods = cods;
	}

	public int getCodal() {
		return codal;
	}

	public void setCodal(int codal) {
		this.codal = codal;
	}

	public void adicionarDisciplina(Disciplina d) {
		if(d != null) {
			disciplinas.add(d);
		}
	}
	
	public void removerDisciplina(String nome) {
		for(int i=0;i<disciplinas.size(); i++) {
			if(nome.equals(disciplinas.get(i).getNome())) {
				disciplinas.remove(i);
			}
		}
	}

	public String dadosSemestre() {
		return "Semestre [codigo=" + codigo + ", fase=" + fase + ", disciplinas=" + disciplinas + "]";
	}
	
	
	
}
