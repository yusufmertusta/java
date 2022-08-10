package hm2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class myCompress {

	public static void main(String[] args) throws IOException {
		File input = new File(args[1]);
		Scanner scan = new Scanner(input);
		ArrayList<Character> chInt = new ArrayList<>();
		String temp = "";
		String dizgi = "";
		String y = "";

		if (args[0].equals("-c")) {

			while (scan.hasNext()) {
				String s = scan.next();
				temp += s + " ";
			}
			temp = temp.substring(0, temp.length() - 1);

			for (int a = 0; a < temp.length(); a++) {
				if (!chInt.contains(temp.charAt(a)))
					chInt.add(temp.charAt(a));
			}

			int count = 0;
			int bit = 0;
			bit = chInt.size();
			int b1 = binary(bit - 1);

			while (b1 > 0) {
				b1 /= 10;
				count++;
			}

			String[] ch = new String[chInt.size()];
			String[] bts = new String[chInt.size()];
			for (int i = 0; i < temp.length(); i++) {
				for (int k = 0; k < chInt.size(); k++) {
					if (temp.charAt(i) == chInt.get(k)) {
						int b2 = binary(k);
						y = Integer.toString(b2);
						while (count != y.length()) {
							y = "0" + y;
						}
						ch[k] = chInt.get(k).toString();
						bts[k] = y;
					}
				}
			}

			for (int i = 0; i < temp.length(); i++) {
				for (int k = 0; k < chInt.size(); k++) {
					if (temp.charAt(i) == chInt.get(k)) {
						int b2 = binary(k);
						y = Integer.toString(b2);
						while (count != y.length()) {
							y = "0" + y;
						}
						dizgi += y;
					}
				}
			}

			int amount = (int) Math.ceil((double) dizgi.length() / 8);
			byte arrays[][] = new byte[amount][1];
			for (int b = 0; b < amount; b++) {
				if (dizgi.length() <= 8 && dizgi.length() > 0) {
					arrays[b] = dizgi.getBytes();
					break;
				}

				else {
					String temp2 = dizgi.substring(0, 8);
					dizgi = dizgi.substring(8);
					arrays[b] = temp2.getBytes();
				}

			}

			String[] space = new String[1];
			space[0] = "\n";
			try (FileOutputStream fos = new FileOutputStream(args[1] + ".C")) {
				for (int i = 0; i < chInt.size(); i++) {
					fos.write(ch[i].getBytes());
				}
				fos.write(space[0].getBytes());
				for (int i = 0; i < chInt.size(); i++) {
					fos.write(bts[i].getBytes());
				}
				fos.write(space[0].getBytes());
				for (int x = 0; x < amount; x++) {
					fos.write(arrays[x]);
				}

				fos.close();

			}
			scan.close();

			try {
				Files.delete(Paths.get(args[1]));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		if (args[0].equals("-x")) {
			BufferedReader reader = new BufferedReader(new FileReader(args[1]));
			String line1 = reader.readLine();
			String line2 = reader.readLine();
			String line3 = reader.readLine();
			reader.close();
			String comp[] = new String[line1.length()];

			int bit = line1.length();
			int b1 = binary(bit - 1);
			int count = 0;

			while (b1 > 0) {
				b1 /= 10;
				count++;
			}

			int l1 = line1.length();
			for (int i = 0; i < l1; i++) {
				comp[i] = line1.substring(0, 1);
				line1 = line1.substring(1);
			}
			String cd[] = new String[l1];
			for (int i = 0; i < l1; i++) {
				cd[i] = line2.substring(0, count);
				line2 = line2.substring(count);
			}
			int l3 = line3.length();
			String byt[] = new String[l3 / count];
			for (int i = 0; i < l3 / count; i++) {
				byt[i] = line3.substring(0, count);
				line3 = line3.substring(count);
			}

			String text = "";
			for (int i = 0; i < byt.length; i++) {
				for (int w = 0; w < cd.length; w++) {
					if (byt[i].equals(cd[w])) {
						text += comp[w];
					}
				}
			}

			BufferedWriter writer = new BufferedWriter(new FileWriter(args[1].substring(0, args[1].length() - 2)));
			writer.write(text);
			writer.close();
			scan.close();
			
			try {
				Files.delete(Paths.get(args[1]));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

	static int binary(int n) {

		int bin = 0;
		int dec = 0;
		while (n != 0) {
			int rem = n % 2;
			double c = Math.pow(10, dec);
			bin += rem * c;
			n /= 2;
			dec++;
		}

		return bin;
	}

}
