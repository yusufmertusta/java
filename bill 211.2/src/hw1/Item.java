package hw1;

public class Item {
	static Item empty = new Item();
	static Item k = new Rook();
	static Item p = new Pawn();
	static Item f = new Bishop();
	static Item a = new Knight();
	static Item s = new Queen();
	static Item v = new King();
	static Item K = new Rook();
	static Item P = new Pawn();
	static Item F = new Bishop();
	static Item A = new Knight();
	static Item S = new Queen();
	static Item V = new King();
	
	public static Item findStart() {
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("K"))
			return K;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("k"))
			return k;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("P"))
			return P;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("p"))
			return p;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("A"))
			return A;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("a"))
			return a;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("F"))
			return F;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("f"))
			return f;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("V"))
			return V;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("v"))
			return v;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("S"))
			return S;
		if(Board.board[Game.startRow()][Character.getNumericValue(Game.move.charAt(1))].equals("s"))
			return s;
		return empty;
		
	}
	public String findItem(int r,int c) {
		return Board.board[r][c];
	}
	public boolean isStraightEmpty(String x,int a,int b,int c) {
		int count=0;
		int d = Math.abs(a-b);
		if(a!=b) {
			if(x.equals("r")){
				for(int i=Math.min(a, b)+1;i<d;i++) {
					if(!(Board.board[i][c].equals("-")))
						count++;
				}
			}
			else if(x.equals("c")){
				for(int i=Math.min(a, b)+1;i<d;i++) {
					if(!(Board.board[c][i].equals("-")))
						count++;
				}
			}if(count!=0)
				return false;
			
		}
		return true;
	}
	
	public boolean canEat(int r,int c,Player x) {
		if(Character.isLowerCase(findItem(r,c).charAt(0))&&x.colour.equals("black"))
			return false;
		if(Character.isUpperCase(findItem(r,c).charAt(0))&&x.colour.equals("white"))
			return false;
		return true;
	}
	
	public boolean borderCheck(int fc) {
		if(!(Game.finishRow()>=0&&Game.finishRow()<8&&fc>=0&&fc<8))
		return false;
		return true;
	}
	
	public boolean isItCross(int sc, int fc) {
		if(Math.abs(Game.finishRow()-Game.startRow())==Math.abs(fc-sc)) {
			return true;
		}
		return false;
	}
	
	public boolean isCrossEmpty(int sc,int fc) {
		int count=0;
		int sr=Game.startRow();
		int c1 = Math.abs(fc-sc);
		if(fc-sc<0) {
			if(Game.finishRow()-Game.startRow()<0) { // left-up
				for(int s=0;s<c1;s++) {
					if(!(Board.board[sr][sc].equals("-"))) {
						count++;
					}
					sc--;
					sr--;
				}
				System.out.println(count);
			}
			if(Game.finishRow()-Game.startRow()>0) { // left-down
				for(int s=0;s<c1;s++) {
					if(!(Board.board[sr][sc].equals("-"))) {
						count++;
					}
					sc--;
					sr++;
				}
			}
		}
		if(fc-sc>0) {
			if(Game.finishRow()-Game.startRow()<0) { // right-up
				for(int s=0;s<c1;s++) {
					if(!(Board.board[sr][sc].equals("-"))) {
						count++;
					}
					sc++;
					sr--;
				}
			}
			if(Game.finishRow()-Game.startRow()>0) { // right-down
				for(int s=0;s<c1;s++) {
					if(!(Board.board[sr][sc].equals("-"))) {
						count++;
					}
					sc++;
					sr++;
				}
			}
		}
		if(count>1)
		return false;
		return true;
	}
	
	
	public boolean canMove(int a,int b,Player p) {
		return true;
	}
	
	public void move(Player p,Player opponent) {
		Game.winPoints(p);
	}
	
	
	@Override
	public String toString() {
		if(findStart()==K)
			return "K";
		if(findStart()==k)
			return "k";
		if(findStart()==A)
			return "A";
		if(findStart()==a)
			return "a";
		if(findStart()==F)
			return "F";
		if(findStart()==f)
			return "f";
		if(findStart()==V)
			return "V";
		if(findStart()==v)
			return "v";
		if(findStart()==S)
			return "S";
		if(findStart()==s)
			return "s";
		if(findStart()==P)
			return "P";
		if(findStart()==p)
			return "p";
		return "empty";
	}
	
	


}
