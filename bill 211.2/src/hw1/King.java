package hw1;

public class King extends Item{

	public int points=9;
	
	public boolean canMove(int a,int b,Player x){
		if((findStart()==v&&canEat(Game.finishRow(),b,x)&&x.ownColour()&&borderCheck(b))&&((isItCross(a,b)&&isCrossEmpty(a,b))||((Game.finishRow() <= 7 && Game.finishRow() >= 0 && Game.finishRow() != Game.startRow() && b == a && isStraightEmpty("r",Game.finishRow(),Game.startRow(),a))
				|| (b <= 7 && b >= 0 && b != a && isStraightEmpty("c",a,b,Game.startRow())) && Game.finishRow() == Game.startRow()))) {
		return true;
		}
		else if((findStart()==V&&canEat(Game.finishRow(),b,x)&&x.ownColour()&&borderCheck(b))&&((isItCross(a,b)&&isCrossEmpty(a,b))||((Game.finishRow() <= 7 && Game.finishRow() >= 0 && Game.finishRow() != Game.startRow() && b == a && isStraightEmpty("r",Game.finishRow(),Game.startRow(),a))
				|| (b <= 7 && b >= 0 && b != a && isStraightEmpty("c",a,b,Game.startRow())) && Game.finishRow() == Game.startRow()))) {
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
