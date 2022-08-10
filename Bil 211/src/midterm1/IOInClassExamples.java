package midterm1;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Scanner;


class YazilabilirNesne implements Serializable{
	int id;
	YazilabilirNesne(int id)
	{
		this.id = id;
	}
}

public class IOInClassExamples {
	
	public static void find_children(String filepath)
	{
		File f = new File(filepath);
		if(f.exists())
		{
			System.out.println(f.getAbsolutePath());
			if(f.isDirectory())
			{
				File []  dosyalar = f.listFiles();
				for(int i=0;i<dosyalar.length;i++)
					find_children(dosyalar[i].getAbsolutePath());
				
			}
		}
	}
	
	public static void main(String[] args) {
	
		YazilabilirNesne y1 = new YazilabilirNesne(10);
		YazilabilirNesne y2 = new YazilabilirNesne(20);
		YazilabilirNesne[] array = new YazilabilirNesne[2];
		array [0] = y1;
		array [1] = y2;
		ObjectOutputStream o = null;
		
			try {
				o =new ObjectOutputStream(new FileOutputStream("binary_file"));
				o.writeObject(y1);
				o.writeObject(y2);
				o.writeObject(array);
				o.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("binary_file"));
				YazilabilirNesne x1 = (YazilabilirNesne) in.readObject();
				YazilabilirNesne x2 = (YazilabilirNesne) in.readObject();
				YazilabilirNesne[ ] array2 = (YazilabilirNesne[ ]) in.readObject();
			
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// -------------------------------------------------------------
			
		ObjectOutputStream o1 = null;
		try {
			o1 =new ObjectOutputStream(new FileOutputStream("binary_file"));
			o1.writeInt(5);
			o1.writeShort(4 );
			o1.writeInt(5);
			o1.writeChar( (int)'A' );
			o1.writeBoolean(true);
			o1.writeUTF("abc");
			o1.writeDouble(4.3);
			
			o1.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("yazma bitti");
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("binary_file"));
			System.out.println(in.readShort());
			System.out.println(in.readInt());
			System.out.println(in.readInt());
			in.skipBytes(3);
			System.out.println(in.readUTF());
			
			try{
				while(true){
					in.readByte();
				}
			}
			catch(EOFException e){
					
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


			// -------------------------------------------------------------
			
			
			File f = new File("yeni_dosya");
		
		if(f.exists()){
			System.out.println("dosya var");
		}
		else
			System.out.println("dosya yok");
		PrintWriter p = null;
		try {
			p = new PrintWriter(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.println("abc");
		p.close();
		File f2 = new File("ornek_dosya");
		f2.mkdirs();
		f2.renameTo(new File("abc"));
		f2.delete();
		

			
			// -------------------------------------------------------------
			

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("dosya.txt"));
			
			System.out.println((char)in.read());
			in.skip(20);
			System.out.println("burada");
			System.out.println((char)in.read());
			in.skip(2);
			System.out.println((char)in.read());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			// -------------------------------------------------------------
					
		try {
			in = new BufferedReader(new FileReader("dosya.txt"));
			
			String line = in.readLine();
			while(line != null)
			{
				System.out.println(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// -------------------------------------------------------------
					
		try {
			in = new BufferedReader(new FileReader("dosya.txt"));
			
			int tmp = in.read();
			while(tmp != -1)
			{
				System.out.println((char)tmp);
				tmp = in.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
			// -------------------------------------------------------------

			
		Scanner in1 = null;
		try {
			in1 = new Scanner(new File("dosya.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//int a = in.nextInt();
		
		//
		Scanner in2 = in1.useDelimiter("|");	
		while(in2.hasNextInt())
		{
			in1.useDelimiter("|");	
			System.out.println(in1.nextInt());
		}
			
		

			// -------------------------------------------------------------

		while(true)
		{
			try{
				System.out.println(in1.nextInt());
			}
			catch(NoSuchElementException e)
			{
				break;
			}
				
		}
		
			// -------------------------------------------------------------
					
		PrintWriter out =null;
		try {
			out = new PrintWriter(new FileOutputStream("dosya.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long baslangic = System.currentTimeMillis();
		
		for(int i=0;i<1000000;i++)
		{
			out.flush();
			out.println(i);
		}
		long son = System.currentTimeMillis();
		
		
		out.close();
		System.out.println("bitti  " + (son-baslangic));
	}


	}












