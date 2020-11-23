package exercicios;

public class ex5 {
	public static int[][] GRID = {
			{3,5,2,4,7,6,8,1,9},
			{1,6,8,3,5,9,4,7,2},
			{4,9,7,8,2,1,6,3,5},
			{2,4,5,9,6,7,3,8,1},
			{9,8,6,1,4,3,5,2,7},
			{7,3,1,2,8,5,9,6,4},
			{6,2,3,7,9,4,1,5,8},
			{5,7,9,6,1,8,2,4,3},
			{8,1,4,5,3,2,7,9,6},
	};
	
	private int [][] board;
	public static final int vazio = 0;
	public static final int size = 9;
	
	public ex5(int[][] board) {
		this.board = new int[size][size];
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				this.board[i][j] = board[i][j];
			}
		}
	}
	
	private boolean Linha(int row, int number) {
		for(int i=0; i<size; i++) 
			if(board[row][i] == number)
				return true;
	
		return false;	
	}
	
	private boolean Coluna(int col, int number) {
		for(int i=0; i<size; i++) 
			if(board[i][col] == number)
				return true;
			
		return false;
	}
	
	private boolean Regiao(int row, int col, int number) {
		int r = row - row % 3;
		int c = col - col % 3;
		
		for(int i=r; i<r+3; i++)
			for(int j=c; j<c+3; j++)
				if(board[i][j] == number)
					return true;
		
		return false;
	}
	
	private boolean ok(int row, int col, int number) {
		return !Linha(row, number) && !Coluna(col, number) && !Regiao(row, col, number);
	}
	
	public static void main(String[] args) {
		ex5 sudoku = new ex5(GRID);
		int cont = 0;
		
		System.out.println("Solução é valida?");
		
		for(int row=0; row<size; row++) {
			for(int col=0; col<size; col++) {
				for(int number=1; number<=size; number++) {
					if(sudoku.ok(row, col, number) == false) {
						System.out.println("Sim");
					}else {
						System.out.println("Não");
					}
				}
			}
		}
		/*
		if(cont == 81) {
			System.out.println("Sim");
		}else {
			System.out.println("Não");
		}
		*/
		
	}
	
	

}
