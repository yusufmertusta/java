package Soru5;

public class ThreadQuestion2 {
	static int counter = 0;

	public static void main(String[] args) {
		Runnable t = () -> {
			counter++;
		};
		for (int i = 0; i < 10; i++) {
			new Thread(t).start();
		}
		System.out.println(counter);
	}
}