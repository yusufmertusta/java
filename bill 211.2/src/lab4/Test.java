package lab4;

public class Test {
	  public static void main(String[] args) {
	    Savasci s1 = new Savasci("S1", 5.0, 10.0);
	    Savasci s2 = new Savasci("S2", 8.0, 5.0);
	    Buyucu b1 = new Buyucu("B1",6.0,8.0);
	    Buyucu b2 = new Buyucu("B2",8.0,7.0);

	    Oyuncu[] oyuncular1 = {s1,s2};
	    Oyuncu[] oyuncular2 = {b1,b2};
	    Oyuncu[] oyuncular3 = {s2,b1,s1,b2};

	    switch (Integer.parseInt(args[0])) {
	      case 1: 
	      System.out.println("CASE 1");
	      for (Oyuncu oyuncu : oyuncular1) {
	        System.out.println(oyuncu.ozet());
	      }
	      break;
	      case 2:
	      System.out.println("CASE 2");
	      for (Oyuncu oyuncu : oyuncular2) {
	        System.out.println(oyuncu.ozet());
	      }
	      break;
	      case 3:
	      System.out.println("CASE 3");
	      Takim t1 = new Takim(oyuncular1);
	      t1.siralaVeBas();
	      break;
	      case 4:
	      System.out.println("CASE 4"); 
	      Takim t2 = new Takim(oyuncular2);
	      t2.siralaVeBas();
	      break;
	      case 5:
	      System.out.println("CASE 5");
	      System.out.println("Sirasiz:");
	      for (Oyuncu oyuncu : oyuncular3) {
	        System.out.println(oyuncu.ozet());
	      }
	      System.out.println("Sirali:");
	      Takim t3 = new Takim(oyuncular3);
	      t3.siralaVeBas();
	      break;
	      case 6:
	      System.out.println("CASE 6");
	      for (Oyuncu oyuncu : oyuncular3) {
	        oyuncu.bilgi();
	      }
	      default: break;
	    }
	  }
	}