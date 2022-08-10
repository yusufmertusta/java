package hw1;

public class Pawn extends Item {

	public int points=1;
	
	public boolean canMove(int a,int b,Player x){
		if(findStart()==p&&canEat(Game.finishRow(),b,x)&&borderCheck(b)&&Game.finishRow()+1==Game.startRow()&&a==b&&Board.board[Game.finishRow()][a].equals("-")&&x.ownColour()) {
		return true;
		}
		else if(findStart()==P&&canEat(Game.finishRow(),b,x)&&borderCheck(b)&&Game.finishRow()==Game.startRow()+1&&a==b&&Board.board[Game.finishRow()][a].equals("-")&&x.ownColour()) {
		return true;
		}
		else if(((findStart()==p&&canEat(Game.finishRow(),b,x)&&borderCheck(b)&&Game.finishRow()+1==Game.startRow()&&a+1==b&&!(Board.board[Game.finishRow()][a].equals("-")))||(findStart()==p&&Game.finishRow()+1==Game.startRow()&&a==b+1&&!(Board.board[Game.finishRow()][a].equals("-"))))&&x.ownColour()) {
			return true;
		}else if(((findStart()==P&&canEat(Game.finishRow(),b,x)&&borderCheck(b)&&Game.finishRow()==Game.startRow()+1&&a+1==b&&!(Board.board[Game.finishRow()][a].equals("-")))||(findStart()==P&&Game.finishRow()==Game.startRow()+1&&a==b+1&&!(Board.board[Game.finishRow()][a].equals("-"))))&&x.ownColour()) {
			return true;
		}
		else {
		return false;
		}
	}
	
	
	public void move(Player p, Player opponent) {
		if(canMove(Character.getNumericValue(Game.move.charAt(1)),Character.getNumericValue(Game.move.charAt(4)),p)) {
			Game.winPoints(p);
			Board.board[Game.finishRow()][Character.getNumericValue(Game.move.charAt(4))]=findStart().toString();
			Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))]="-";
			Board.slideLeft();
		}else {	
			System.out.println("Hatali hareket! Tekrar oynayiniz!");	
			Game.wrongMove(p,opponent);
		}
	}
}
