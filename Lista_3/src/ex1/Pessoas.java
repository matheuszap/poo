package ex1;

import java.util.Comparator;

public class Pessoas {
	public String nome;
	public int idade;
	public int cpf;
	public String cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", cidade=" + cidade + "]";
	}
	
    public static Comparator<Pessoas> ComparaNome = new Comparator<Pessoas>() {

	public int compare(Pessoas p1, Pessoas p2) {
	   String nomep1 = p1.getNome().toUpperCase();
	   String nomep2 = p2.getNome().toUpperCase();

	   return nomep1.compareTo(nomep2);
		}
    };
	
}
