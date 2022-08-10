package Thread;

import java.util.Random;

public class ThredaSpeedTest {
	static int [][] array = new int [16000][10000];
	static long  [] thread_results;
	
	static class Counter extends Thread{
		
		int id;
		int baslangic_index;
		int bitis_index;
		public Counter(int id, int num_threads) {
			this.id = id;
			int chunk_size = array.length/num_threads;
			baslangic_index = id*chunk_size;
			bitis_index = baslangic_index+chunk_size;
		}
		
		public void run() {
			long total = 0;
			for(int i = baslangic_index;i<bitis_index;i++)
				for(int j = 0;j<array[0].length;j++)
					total += array[i][j];
			thread_results [id] = total; 
			
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Random r = new Random();
		for(int i = 0;i<array.length;i++)
			for(int j = 0;j<array[0].length;j++)
					array[i][j] = r.nextInt()%2;
		
		long baslangic_zaman = System.currentTimeMillis();
		
		long total = 0;
		for(int i = 0;i<array.length;i++)
			for(int j = 0;j<array[0].length;j++)
				total += array[i][j];
		
		long bitis_zaman = System.currentTimeMillis();
		System.out.println("Seri çalýþma " +  total  + "  hýz "+ (bitis_zaman - baslangic_zaman));
		
		
		baslangic_zaman = System.currentTimeMillis();
		for(int num_threads = 2;num_threads<34;num_threads*=2) {
			thread_results = new long[num_threads];
			Counter [ ] threads = new Counter[num_threads];
			for(int i =0;i<num_threads;i++)
			{
				threads[i] = new Counter(i, num_threads);
				threads[i].start();
			}
			
			for(int i =0;i<num_threads;i++)
				try {
					threads[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			total = 0;
			for(int i =0;i<num_threads;i++)
				total += thread_results[i];
			
			
			
			bitis_zaman = System.currentTimeMillis();
			System.out.println("Paralel çalýþma. Thread sayýsý " + num_threads + " sonuc " +  total  + "  hýz "+ (bitis_zaman - baslangic_zaman));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
