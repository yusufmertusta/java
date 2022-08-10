package lab4;

import java.util.Arrays;

public class Takim{
	Oyuncu[] arr;

	public Takim(Oyuncu[] arr) {
		this.arr=arr;
	}
	
	public void siralaVeBas() {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getIsim().charAt(0)=='S')
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getIsim().charAt(0)=='B')
			System.out.println(arr[i]);
		}
		
	}

}
