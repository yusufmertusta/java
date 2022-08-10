package midterm1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

class Main3 {

	public static void main(String[] args) {
		// io_question();

		String[] x = new String[6];
		x[0] = "a";
		x[1] = "b";
		x[2] = "a";
		x[3] = "c";
		x[4] = "a";
		x[5] = "b";

		//count(x);
		io_question();
		/*
		 * 
		 * try { BufferedReader k = new BufferedReader(new FileReader("isimsiz.txt"));
		 * int loc = 0; int c = 0; while (true) { c = k.read(); if (c == -1) break;
		 * loc++; System.out.println((char) c); if (c % 2 == 0) { if (loc - 2 < 1)
		 * break; k.close(); k = new BufferedReader(new FileReader("isimsiz.txt"));
		 * k.skip(loc - 2); loc = loc - 2; } else { k.skip(2); loc += 2; } } k.close();
		 * } catch (Exception e) { System.out.println("hata"); }
		 */
	}

	public static void count(String[] data) {
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> counts = new ArrayList<>();
		for (int i = 0; i < data.length; i++) {
			if (names.contains(data[i]))
				counts.set(names.indexOf(data[i]), counts.get((names.indexOf(data[i]))) + 1);
			else {
				names.add(data[i]);
				counts.add(1);
			}
		}
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + "\t" + counts.get(i));
		}
	}

	public static void io_question() {
		ObjectOutputStream o = null;
		ObjectInputStream i = null;

		try {
			o = new ObjectOutputStream(new FileOutputStream("binary"));
			o.writeByte(1);
			o.writeInt(1);
			o.writeShort(1);
			o.close();
			i = new ObjectInputStream(new FileInputStream("binary"));
			System.out.println(i.readShort());
			System.out.println(i.readShort());
			System.out.println(i.readShort());
		} catch (IOException e) {
		}
	}

}