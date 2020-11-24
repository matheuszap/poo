package ex4;

import java.util.Arrays;

public class Estado {
	private String nome;
	private Cidade[] cidades = new Cidade[50];
	private int quant_cidade = 0;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade[] getCidades() {
		return cidades;
	}
	public void setCidades(Cidade[] cidades) {
			this.cidades = cidades;
		}
	
	public void adicionar_cidade(Cidade cidade) {
		cidades[quant_cidade] = cidade;
		quant_cidade++;
	}
	
	public void filtrarRendaPerCapta(float x) {
		for(int i=0; i<quant_cidade; i++) {
			
			if(cidades[i].per_capta() > x){
				System.out.println(cidades[i].getNome());
			}
		}

	}
 	
	public String toString() {
		return "Estado [nome=" + nome + ", cidades=" + Arrays.toString(cidades) + ", quant_cidade=" + quant_cidade
				+ "]";
	}
	
	
}
