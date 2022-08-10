package hw1;

public class Bishop extends Item {
 
	public int points=3;
	
	public boolean canMove(int sc,int fc,Player x){
		if(findStart()==f&&canEat(Game.finishRow(),fc,x)&&borderCheck(fc)&&isItCross(sc,fc)&&isCrossEmpty(sc,fc)&&x.ownColour()) {
		return true;
		}
		else if(findStart()==F&&canEat(Game.finishRow(),fc,x)&&borderCheck(fc)&&isItCross(sc,fc)&&isCrossEmpty(sc,fc)&&x.ownColour()) {
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
