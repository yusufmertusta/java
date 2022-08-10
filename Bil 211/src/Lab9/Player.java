package Lab9;

import java.util.Random;

public class Player implements Runnable {
	String name;

	public Player(String name) {
		this.name = name;
	}

	//%0A6-6((.|\n)*) has won the game!%0A
	//%0ALuke has won the game!
	@Override
	public void run() {
		int a, b;
		Random rastgele = new Random();	
		do {
			a = rastgele.nextInt(6) + 1;
			b = rastgele.nextInt(6) + 1;
			//System.out.println(name + " : " + a + "-" + b);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(a==6 && b==6) {
				System.out.println(a+"-"+b+name + " has won the game! ");
				System.exit(0);
			}
		} while (!(a == 6 && b == 6));
	}

}
