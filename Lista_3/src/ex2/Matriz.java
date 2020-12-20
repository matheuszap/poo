package ex2;

import java.util.ArrayList;
import java.util.List;

public class Matriz<T> {
	private T[][] matriz;
	private int linhas;
	private int colunas;

	public Matriz(int m, int n) {
		matriz = (T[][]) new Object[n][m];
	}
	
	public boolean set(T objeto, int i, int j) {
		if(i>linhas || j>colunas) {
			return false;
		}else {
			matriz[i][j] = objeto;
			return true;
		}
	}
	
	public T get(int i, int j) {
		if(i>linhas || j>colunas) {
			return null;
		}else {
			return matriz[i][j];
		}
	}
	
	public List<T> getLinha(int linha) {
		List<T> l = new ArrayList<T>();
		
		for(int j=0; j<colunas; j++) {
			l.add(matriz[linha][j]);
		}
		
		return l;
	}
	
	public List<T> getColuna(int coluna) {
		List<T> col = new ArrayList<T>();
		
		for(int i=0; i<linhas; i++) {
			col.add(matriz[i][coluna]);
		}
		
		return col;
	}
	
	public List<T> diagonalPrincipal() {
		List<T> d = new ArrayList<T>();
		
		if(linhas == colunas) {
			for(int i=0; i<linhas; i++) {
					d.add(matriz[i][i]);
				}
		}else {
			return null;
		}
		return d;
	
	}
	
	public List<T> diagonalSecundaria() {
		List<T> d_sec = new ArrayList<T>();
		
		if(linhas == colunas) {
			for(int i=0; i<linhas; i++) {
				for(int j=0; j<colunas; j++) {
					if(i+j == linhas - 1) {
						d_sec.add(matriz[i][j]);
					}
				}
			}
		}else {
			return null;
		}
		
		return d_sec;
	
	}
	
}




