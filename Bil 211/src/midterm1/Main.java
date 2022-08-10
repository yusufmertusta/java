package midterm1;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String file = "sdfsdafsdfksdafas";
		//dosyayi_yazdir(file);
		ArrayList<String> a = new ArrayList<>();
		a.add("3");a.add("5");a.add("3");a.add("5");a.add("2");a.add("3");a.add("1");a.add("66");
		//deduplicate(a);
		//System.out.println(a);
		//sil(file);
		io();
	}
	
	
	public static void io (){
		try {
		RandomAccessFile rf = new RandomAccessFile("vize", "rw");
		//rf.writeInt(2);
		//rf.writeShort(1); 
		//rf.seek(2);
		//rf.writeShort(1);
		//rf.seek(rf.getFilePointer()+1);
		//rf.writeByte(4);
		//rf.seek(0);
	//	for(int i = 0;i<rf.length();i++)
		System.out.print(rf.readShort() + " ");
		//rf.seek(1);
		//System.out.println(rf.readShort());
		rf.close();
		} catch (IOException e) {}
		}

	
	//  0001 2 -45 4 0
	

	static String sil(String f) throws IOException{
		 String h = f.substring(0, 0);
		 System.out.println(h);
		 return h;
	}
	
	
	
	
	public static void deduplicate(ArrayList<String> a) {
		String temp="";
		for(int i=0;i<a.size();i++) {
			temp=a.get(i);
			for(int e=i+1;e<a.size();e++) {
				if(temp==a.get(e)) {
					a.remove(e);
				}
					
			}
		}
	}
	
	
	
	

	public static void dosyayi_yazdir(String file) {
		Scanner s = new Scanner(file);
		int temp=0;
		while (s.hasNext()) {
			if (s.hasNextInt()) {
				temp = s.nextInt();
				if(temp%2==0) {
				System.out.println(temp);
				}
		}else {
			s.next();
		}
	}	s.close();
	}
}