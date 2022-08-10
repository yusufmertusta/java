package hw1;

public class Board {
	
	static String[][] board = new String[8][8];
	
	public void fillBoard() {
		
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				board[r][c] = "-";
			}
		}

		for (int c = 0; c < board.length; c++) {
			board[0][c] = "P";
		}
		for (int c = 0; c < board.length; c++) {
			board[7][c] = "p";
		}
		board[1][0] = "K";
		board[1][1] = "A";
		board[1][2] = "F";
		board[1][3] = "V";
		board[1][4] = "S";
		board[1][5] = "F";
		board[1][6] = "A";
		board[1][7] = "K";
		board[6][0] = "k";
		board[6][1] = "a";
		board[6][2] = "f";
		board[6][3] = "v";
		board[6][4] = "s";
		board[6][5] = "f";
		board[6][6] = "a";
		board[6][7] = "k";
	}
	
	public static void slideLeft() {
		String temp="";
		String temp0="";
		for (int r = 0; r < board.length; r++) {
			temp0=board[r][7];
			for (int c = 0; c < board[0].length; c++) {
				temp=board[r][c];
				if(c==0)
					board[r][7]=temp;
				else{
					board[r][c-1]=temp;
				}
			}
			board[r][6]=temp0;
		}
	}
	
	public static void showBoard() {
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				System.out.print(board[r][c] + "\t");
			}
			System.out.println("\n");
		}
	}
	

}
