package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class PingPongExample {
	int count = 0;
	ReentrantLock lock = new ReentrantLock();
	int last_played_by = 0;
	class MyThread implements Runnable{
		int id;
		
		public MyThread(int id) {
			this.id = id;
		}
		
		public void run() {
			
			while(count<100 ) {
			//	lock.lock();
				if(last_played_by != id)
				{
					System.out.println(id + " oynadi + " + count);
					
					count++;
					last_played_by = id;
				}
			//	lock.unlock();

			}
		}
		
	}
	
	
	public void game() throws InterruptedException {
		MyThread mt1 = new MyThread(1);
		MyThread mt2 = new MyThread(2);

		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
	
	
	
	
	public static void main(String[] args) {
		PingPongExample p = new PingPongExample();
		try {
			p.game();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
