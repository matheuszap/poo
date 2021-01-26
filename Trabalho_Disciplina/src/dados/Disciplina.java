package dados;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private int codigo;
	private String departamento;
	private List<Float> notas = new ArrayList<Float>();
	private float nota_exame;
	
	private List<Avaliacao> avaliacao = new ArrayList<Avaliacao>();

	public String toString() {
		return "Disciplina [nome=" + nome + ", codigo=" + codigo + ", departamento=" + departamento + ", notas=" + notas
				+ ", nota_exame=" + nota_exame + ", avaliacao=" + avaliacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public List<Float> getNotas() {
		return notas;
	}

	public void setNotas(List<Float> notas) {
		this.notas = notas;
	}

	public float getNota_exame() {
		return nota_exame;
	}

	public void setNota_exame(float nota_exame) {
		this.nota_exame = nota_exame;
	}

	public List<Avaliacao> getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(List<Avaliacao> avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	
}
