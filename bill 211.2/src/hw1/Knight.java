package hw1;

public class Knight extends Item{

	public int points=3;
	
	public boolean canMove(int sc,int fc,Player x){
		if(findStart()==a&&canEat(Game.finishRow(),fc,x)&&borderCheck(fc)&&x.ownColour()&&L(sc,fc)) {
		return true;
		}
		else if(findStart()==A&&canEat(Game.finishRow(),fc,x)&&borderCheck(fc)&&x.ownColour()&&L(sc,fc)) {
		return true;
		}
		else {
		return false;
		}
	}
	
	public boolean L(int a,int b) {
		if(Game.finishRow()-Game.startRow()==2) {//down-down
			if(Math.abs(b-a)==1)//down-down-(left or right)
				return true;
		}
		if(Game.startRow()-Game.finishRow()==2) {//up-up
			if(Math.abs(b-a)==1)//up-up-(left or right)
				return true;
		}
		if(b-a==2) {//right-right
			if(Math.abs(Game.startRow()-Game.finishRow())==1)//right-right-(up or down)
				return true;
		}
		if(a-b==2) {//left-left
			if(Math.abs(Game.startRow()-Game.finishRow())==1)//left-left-(up or down)
				return true;
		}
			
		return false;
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
