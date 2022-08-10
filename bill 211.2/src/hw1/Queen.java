package hw1;

public class Queen extends Item{
	
	public boolean canMove(int a,int b,Player x){
		if((findStart()==s&&canEat(Game.finishRow(),b,x)&&x.ownColour()&&borderCheck(b))&&((Game.finishRow()+1==Game.startRow()&&a==b)
				||(Game.finishRow()==Game.startRow()+1&&a==b)
				||(Game.finishRow()==Game.startRow()&&a+1==b)
				||(Game.finishRow()+1==Game.startRow()&&a==b+1)
				||(isItCross(a,b)&&Math.abs(a-b)==1)
				)){
		return true;
		}
		else if((findStart()==S&&canEat(Game.finishRow(),b,x)&&x.ownColour()&&borderCheck(b))&&((Game.finishRow()+1==Game.startRow()&&a==b)
				||(Game.finishRow()==Game.startRow()+1&&a==b)
				||(Game.finishRow()==Game.startRow()&&a+1==b)
				||(Game.finishRow()+1==Game.startRow()&&a==b+1)
				||(isItCross(a,b)&&Math.abs(a-b)==1)
				)) {
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
