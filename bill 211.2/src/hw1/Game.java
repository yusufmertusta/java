package hw1;
import java.util.Scanner;

public class Game {
	
	static String move = "";

	public static int startRow() {
		if(move.charAt(0)=='a')
		return 0;
		if(move.charAt(0)=='b')
			return 1;
		if(move.charAt(0)=='c')
			return 2;
		if(move.charAt(0)=='d')
			return 3;
		if(move.charAt(0)=='e')
			return 4;
		if(move.charAt(0)=='f')
			return 5;
		if(move.charAt(0)=='g')
			return 6;
		if(move.charAt(0)=='h')
			return 7;
		return 0;
	
	}
	public static int finishRow() {
		if(move.charAt(3)=='a')
			return 0;
		if(move.charAt(3)=='b')
			return 1;
		if(move.charAt(3)=='c')
			return 2;
		if(move.charAt(3)=='d')
			return 3;
		if(move.charAt(3)=='e')
			return 4;
		if(move.charAt(3)=='f')
			return 5;
		if(move.charAt(3)=='g')
			return 6;
		if(move.charAt(3)=='h')
			return 7;
		return 0;
	
	}	
	
	
	public static void winPoints(Player p) {
		switch(Board.board[Game.finishRow()][Character.getNumericValue(Game.move.charAt(4))]) {
		case "K":
			p.pointsWon+=5;
			break;
		case "k":
			p.pointsWon+=5;
			break;
		case "A":
			p.pointsWon+=3; 
			break;
		case "a":
			p.pointsWon+=3;
			break;
		case "F":
			p.pointsWon+=3;
			break;
		case "f":
			p.pointsWon+=3;
			break;
		case "V":
			p.pointsWon+=9;
			break;
		case "v":
			p.pointsWon+=9;
			break;
		case "P":
			p.pointsWon+=1;
			break;
		case "p":
			p.pointsWon+=1;
			break;
		case "s":
			System.out.println("Beyazlar kazandi. Tebrikler!");
			System.exit(0);
		case "S":
			System.out.println("Siyahlar kazandi. Tebrikler!");
			System.exit(0);
		case "-":
			p.pointsWon+=0;
			break;
		}
	}

	public static void blacksTurn() {
		System.out.println("Sira Siyahta. Oynamak istediginiz tasin koordinatini ve tasi koymak istediginiz koordinati giriniz");
		Scanner input = new Scanner(System.in);
		move = input.nextLine();
	}
	
	public static void whitesTurn() {
		System.out.println("Sira Beyazda. Oynamak istediginiz tasin koordinatini ve tasi koymak istediginiz koordinati giriniz");
		Scanner input = new Scanner(System.in);
		move = input.nextLine();
	}
	
	public static void points(Player b, Player w) {
		System.out.println("Black's Points: " + b.pointsWon);
		System.out.println("Wihte's Points: " + w.pointsWon);
		System.exit(0);
	}
	
	public static void wrongMove(Player p,Player opponent) {
		if(p.colour.equals("white")) {
			whitesTurn();
			if(move.equals("exit")) {
				points(opponent,p);
			}
			Item.findStart().move(p,opponent);
		}
		if(p.colour.equals("black")) {
			blacksTurn();
			if(move.equals("exit")) {
				points(p,opponent);
			}
			Item.findStart().move(p,opponent);
		}	
	}
	
	
	public void play(Player b,Player w) {
			Board.showBoard();
			
			whitesTurn();
			if(move.equals("exit")) {
				points(b,w);
			}
			Item.findStart().move(w,b);
			Board.showBoard();
			
			blacksTurn();
			if(move.equals("exit")) {
				points(b,w);
		}Item.findStart().move(b,w);
		
			play(b,w);
	}
	
	
	
	
}
