package lab3;

public class Test {

	  public static void main (String[] args) {
	    Silah silah = new Silah(3, "Isimsiz Silah");
	    Kilic kilic = new Kilic(7,"Sir Egbert Quickblade");
	    Gladius gladius = new Gladius(9, "Lightbane");
	    Spatha spatha = new Spatha(8.5, "Glider");
	    Pilum pilum = new Pilum(4,"Sting");

	    Silah[] silahZulasi = {silah, kilic, gladius, spatha,pilum};

	    Savasci savasci1 = new Savasci(spatha, "Savasci 1");
	    Savasci savasci2 = new Savasci(gladius, "Savasci 2");
	    Savasci savasci3 = new Savasci(pilum, "Savasci 3");
	    Savasci savasci4 = new Savasci(kilic, "Savasci 4");
	    Savasci savasci5 = new Savasci(silah, "Savasci 5");
	    Savasci savasci6 = new Savasci(kilic, "Savasci 6");
	    switch (Integer.parseInt(args[0])) {
	      case 1:
	        for (Silah silah2 : silahZulasi) {
	            System.out.println(silah2);
	        }
	        break;
	      case 2:
	        for (Silah silah2 : silahZulasi) {
	          silah2.bilgi();
	          System.out.println("---");
	        }
	        break;
	      case 3: 
	        System.out.println("---Saldiri Denemesi---");
	        for (Silah silah2 : silahZulasi) {
	          System.out.println(silah2.saldir(1));
	        }
	        break;
	      case 4:
	        System.out.println(savasci1);
	        System.out.println(savasci2);
	        System.out.println(savasci3);
	        System.out.println(savasci4);
	        System.out.println(savasci5);
	        break;
	      case 5:
	        while (savasci1.can>0 && savasci2.can>0) {
	          System.out.println("---Tur---");
	          savasci2.zararGor(savasci1.saldir(3));
	          if(savasci2.can > 0)
	            savasci1.zararGor(savasci2.saldir(2));
	        }
	        break;
	      case 6:
	        while (savasci3.can>0 && savasci4.can>0) {
	          System.out.println("---Tur---");
	          savasci4.zararGor(savasci3.saldir(2.5));
	          if(savasci4.can > 0)
	            savasci3.zararGor(savasci4.saldir(5));
	        }
	        break;
	      case 7:
	        while (savasci5.can>0 && savasci6.can>0) {
	          System.out.println("---Tur---");
	          savasci6.zararGor(savasci5.saldir(10));
	          if(savasci6.can > 0)
	            savasci5.zararGor(savasci6.saldir(2.5));
	        }
	        break;
	      case 8:
	        for (Silah s2 : silahZulasi) {
	          System.out.println(s2.ses());
	        }
	      default:
	        break;
	    }
	  }
	}