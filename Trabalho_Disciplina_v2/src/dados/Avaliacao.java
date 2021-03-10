package dados;

public class Avaliacao {
	private int id; //Criado BD
	
	private int codigo;
	private String nome;
	private float peso;
	private String data;
	
	private int id_disciplina; //Criado BD
	
	public Avaliacao(int id, int codigo, String nome, float peso, String data) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
		this.data = data;
	}


	public Avaliacao() {
		// TODO Auto-generated constructor stub
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_disciplina() {
		return id_disciplina;
	}
	public void setId_disciplina(int id_disciplina) {
		this.id_disciplina = id_disciplina;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliacao other = (Avaliacao) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String dadosAvaliacao() {
		return "Avaliacao [codigo=" + codigo + ", nome=" + nome + ", peso=" + peso + ", data=" + data + "]";
	}
	
	
	
}
