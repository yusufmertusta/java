package Soru7;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadQuestion {
	int count = 0;
	ReentrantLock lock = new ReentrantLock();
	int next = 0;

	class Player implements Runnable {
		int id;

		public Player(int ID) {
			id = ID;
		}

		public void run() {
			while (true) {
				lock.lock();
				if (count >= 10) {
					lock.unlock();
					break;
				} /* 3 */
				if (next == id) {/* 4 */
					count++;
					System.out.println(id + " oynadi: " + count);
					next = (id + 1) % 3;

				}
				lock.unlock();
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public void game() {
		Player p1 = new Player(0);
		Player p2 = new Player(1);
		Player p3 = new Player(2);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.wait();
			t2.wait();
			t3.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadQuestion p = new ThreadQuestion();
		p.game();
		System.out.println("oyun bitti");
	}
}