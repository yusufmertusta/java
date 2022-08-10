package Soru4;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

	public static void printfile(RandomAccessFile f) throws IOException {
		f.seek(0);
		int tmp;
		for (int i = 0; i < f.length(); i++)
			System.out.print(f.read());
		System.out.println();
	}

	public static void io_question() throws IOException {
		RandomAccessFile f = new RandomAccessFile("dosya", "rw");
		f.writeInt(9);
		printfile(f);
		f.writeShort(8);
		printfile(f);
		f.seek(2);
		f.writeChar(8);
		printfile(f);
		f.seek(0);
		System.out.println(f.readShort());
		System.out.println(f.readShort());
		System.out.println(f.readShort());
		f.close();
	}

	public static void main(String[] args) {
		try {
			io_question();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
