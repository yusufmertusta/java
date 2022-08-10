package midterm1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExample {
	
	public static void main(String[ ] args)
	{
		try {
			RandomAccessFile rf = new RandomAccessFile("random_access","rw");
			rf.writeInt(5);  // 0005
			rf.writeInt(4);  // 00050004
			rf.writeChar(5); // 0005000405
			System.out.println(rf.length());
			rf.seek(2);  // 0005000405
			rf.writeInt(10);  // 00000A0405
			System.out.println("dosya uzunlugu "+rf.length());
			System.out.println("pointerin konumu " + rf.getFilePointer());
			System.out.println("okudugumuz char degeri "+ rf.readChar());
			System.out.println("pointerin konumu " + rf.getFilePointer());
			rf.seek(30);  
			System.out.println("30a geldik mi ?" + rf.getFilePointer());
			System.out.println(rf.length());
			rf.writeInt(4);
			rf.seek(0);  
			System.out.println("okudugumuz int degeri "+ rf.readInt());
			rf.setLength(100);
			System.out.println(rf.length());
			rf.close();
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}

}