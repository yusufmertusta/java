package lab10;

public class AsalSayi{

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			private boolean exit=false;
			
			 public void stop()
			    {
			        exit = true;
			    }
			 
			@Override
			public void run() {
				 if(!exit) {
		        for(int sayi=2;sayi<=Integer.parseInt(args[1]);sayi++)
		        {
		            int kontrol = 0;
		            for (int i = 2; i < sayi; i++)
		            {
		               if (sayi % i == 0)
		                {
		                    kontrol = 1;
		                    break;
		                } 
		            }
		                
		            if(kontrol==0)
		            {
		            	stop();
		                System.out.print(sayi+"\n");
		                
		            }
		            try {
						 Thread.sleep(1000);
					 }
					 catch(InterruptedException e) {
						 
					 }
		        }	
					
		}
				
			}
		};
		
		
		for(int i=0;i<Integer.parseInt(args[3]);i++) {
		Thread t1 = new Thread ( runnable);
		t1.start();
		}
		
	}

		 
		
	}

