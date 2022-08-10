package hw1;

public class Player {
	
	public String colour;

	public Player(String colour) {
		this.colour=colour;
	}

	public String getColour() {
		return colour;
	}

	public boolean ownColour() {
		if(Character.isLowerCase(Item.findStart().toString().charAt(0))&&colour.equals("black")) {
		return true;}
		if(Character.isUpperCase(Item.findStart().toString().charAt(0))&&colour.equals("white")) {
		return true;}
		else {
		return false;}
	}

	int pointsWon = 0;

	

}
