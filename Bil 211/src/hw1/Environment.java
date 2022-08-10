package hw1;

public class Environment {
	
	public static void main(String[] args) {
		Grid();
	}

	private static int m;
	private static int n;
	private int mode;
	private static int obstacles;
	
	public static int getRandom(int min,int max) {
		return (int) ((Math.random()*(max-min))+min);
	}
	
	public Environment(int m, int n, int obstacles, int mode) {
		this.m = m;
		this.n = n;
		this.mode = mode;
		this.obstacles = obstacles;
	}
	
	public static void Grid() {
	String grid[][] = new String[m][n];
	
	for(int x=0;x<m;x++) {
		for(int y=0;y<n;y++) {
			grid[x][y] =".";
		}
	}
	
	
	for(int i=0;i<obstacles;i++) {
		int x = getRandom(0,m);
		int y = getRandom(0,n);
		if(grid[x][y]==".")
			grid[x][y]="O";
	}
	
	
	}

	public void putCreature(Creature org) {
		String grid[][] = new String[m][n];
			int x = getRandom(0,m);
			int y = getRandom(0,n);
				grid[x][y]= org.getName().substring(0,1);;
		}
		
	public Creature get(int x,int y) {
		return ;
	}
	

	public void info() {
		System.out.println("Prey : " + numberOfPreys + ", Hunter : " +  numberOfHunters + ", UltimateHunter : " + numberOfUltimateHunters);
		
	}

	public void step() {
		Hunter.move();
		Prey.move();
		
		
	}
}
	

	

