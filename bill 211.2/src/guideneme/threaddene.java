package guideneme;

public class threaddene implements Runnable {
		int a=0;
	  public static void main(String[] args) {
		threaddene obj = new threaddene();
		As a1 = obj.new As();
		As a2 = obj.new As();
		a1.start();
		a2.start();
	   
	  }
	  
	  
	public class As extends Thread{
		
		 
	  public void run() {
		
		while(a<5) {
	    System.out.println(a);
	    a++;
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  }
	}


}
