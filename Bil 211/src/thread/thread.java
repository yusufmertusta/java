package thread;
import java.util.*;

public class thread implements Runnable  {
	int a;
	public thread() {
		
	}

	@Override
	public void run() {
		Scanner w = new Scanner(System.in);
		try {
		System.out.println("ne kadar vaktim kaldý");
		Thread.sleep(1000);
		a = w.nextInt();
		Thread.sleep(1000);
		System.out.println(a+" ne");
		Thread.sleep(500);
		
		for(int i=a;i>=0;i--) {
			System.out.println(i);
			
				Thread.sleep(1000);
			} }catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
		
		
	}
}
