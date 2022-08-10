package hw1;

public class Creature {
	public String name;
	public static int m,n;
	public Creature(String name) {
		this.name = name;
	}
	
	public static int getRandom(int min, int max) {
		return (int) ((Math.random()*(max-min))+min);
	} 
	
	public String getName() {
		return this.name;
	}

	public static int move() {
		int a = getRandom(1,5);
		
		switch(a) {
		case 1:
			//yukari
			n++;
			break;
		case 2:
			//asagi
			n--;
			break;
		case 3:
			//sag
			m++;
			break;
		case 4:
			//sol
			m--;
			break;
		default:
			break;
		}
		return a;
		
	}
	
	public int breed() {
	return 	
	}
	public boolean Starve() {
		if(last)
		return false;
		
	}

}

