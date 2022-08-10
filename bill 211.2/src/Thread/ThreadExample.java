package Thread;

class MyThread extends Thread{
		public void run() {
			System.out.println(this.getId());
			System.out.println(this.getName());
			
		}
	}


public class ThreadExample {

	
	
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.setName("a");
		
		MyThread t1 = new MyThread();
		t1.setName("b");
		
		t.start();
		
		t.join();
		
		
		t1.start();
		
		
		
		
		
		
		
		

	}

}
