package dados;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private int codd; //Criado BD
	
	private String nome;
	private int codigo;
	private String departamento;
	private List<Float> notas = new ArrayList<Float>();
	private float media_final;
	private float nota_exame;
	
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	private int cods; //Criado BD

	
	
	public Disciplina(int codd, String nome, int codigo, String departamento, float media_final, float nota_exame,
			List<Avaliacao> avaliacoes) {
		super();
		this.codd = codd;
		this.nome = nome;
		this.codigo = codigo;
		this.departamento = departamento;
		this.media_final = media_final;
		this.nota_exame = nota_exame;
		this.avaliacoes = avaliacoes;
	}

	public Disciplina() {
		// TODO Auto-generated constructor stub
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

	public float getMedia_final() {
		return media_final;
	}

	public void setMedia_final(float media_final) {
		this.media_final = media_final;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public float getNota_exame() {
		return nota_exame;
	}

	public void setNota_exame(float nota_exame) {
		this.nota_exame = nota_exame;
	}

	public int getCodd() {
		return codd;
	}

	public void setCodd(int codd) {
		this.codd = codd;
	}

	public int getCods() {
		return cods;
	}

	public void setCods(int cods) {
		this.cods = cods;
	}

	public float calcularMedia() {
		List<Float> n = new ArrayList<Float>();
		
		n = getNotas();
		
		float soma = 0;
		float media = 0;
		
		for(int i=0; i<n.size(); i++) {
			soma += n.get(i);
		}
		
		media = soma/n.size();
		
		return media;
	}
	
	public float calcularNotaExame() {
		float media = calcularMedia();
		float nota_exame = 0;
		
		if(media < 7) {
			nota_exame = (float) ((-1.5*media)+12.5);
			
			return nota_exame;
		}else {
			return 0;
		}
	}
	
	public String dadosDisciplina() {
		return "Disciplina [nome=" + nome + ", codigo=" + codigo + ", departamento=" + departamento + ", notas=" + notas
				+ ", media_final=" + media_final + ", nota_exame=" + nota_exame + ", avaliacoes=" + avaliacoes + "]";
	}
	
	

	public String mostrarNotas() {
		return "notas=" + notas + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
