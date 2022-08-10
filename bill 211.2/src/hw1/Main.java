package hw1;

public class Main {
	public static void main(String[] args) {
		
		Game chess = new Game();
		Board board = new Board();
		board.fillBoard();
		Player black = new Player("black");
		Player white = new Player("white");
		chess.play(black,white);
		
		
		
		
	}
}
