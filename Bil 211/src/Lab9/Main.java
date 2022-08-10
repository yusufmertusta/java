package Lab9;

public class Main{
	  public static void main(String [] args){
	    Runnable luke = new Player("Luke");
	    Runnable pete = new Player("Pete");
	    
	    Thread l = new Thread(luke);
	    Thread p = new Thread(pete);
	    
	    
	    p.start();
	    l.start();
	    
	  }
	}