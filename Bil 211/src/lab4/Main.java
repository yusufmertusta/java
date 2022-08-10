package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws CapitalizeTheSentence {

		Scanner input = new Scanner(System.in);
		String a = input.nextLine();

		try {
			if (Character.isUpperCase(a.charAt(0)) == false) {
				throw new CapitalizeTheSentence();
			}
		} catch (CapitalizeTheSentence e) {
			System.out.println(e.getMessage());
			a = Character.toUpperCase(a.charAt(0)) + a.substring(1);
			System.out.println("\"" + a + "\"");
		}

		try {
			if (a.charAt(a.length() - 1) != 46)
				throw new EndWithAFullStop();
		} catch (EndWithAFullStop x) {
			System.out.println(x.getMessage());
			a = a + ".";
			System.out.println("\"" + a + "\"");

		}

		try {
			for (int c = 0; c < a.length() - 1; c++) {
				if (Character.isUpperCase(a.charAt(c)) && c != 0 && a.charAt(c - 1) == 32)
					throw new CommaPunctuation();
			}
		} catch (CommaPunctuation w) {
			List list2 = new ArrayList();
			List list3 = new ArrayList();

			for (int c = 0; c < a.length() - 1; c++) {
				if (Character.isUpperCase(a.charAt(c)) && c != 0 && a.charAt(c - 1) == 32) {
					list2.add(c);
				}
			}
			for (int i = (int) list2.get(0); i < a.length(); i++) {
				if (a.charAt(i) == 32)
					list3.add(i);
			}

			System.out.println(w.getMessage());
			a = a.substring(0, (int) list3.get(0)) + "," + a.substring((int) list3.get(0));
			System.out.println("\"" + a + "\"");
		}

		try {
			int count1 = 0;
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == 32) {
					count1++;
				}
			}
			if (count1 >= 6) {
				throw new SemicolonPunctuation();
			}

		} catch (SemicolonPunctuation q) {
			System.out.println(q.getMessage());
			List list = new ArrayList();
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == 32) {
					list.add(i);
				}
			}
			System.out.print("\"");
			System.out.print(a.substring(0, (int) list.get(4)));
			for (int y = 4; y < list.size(); y += 7) {
				System.out.print(";");
				if (y + 7 <= list.size()) {
					System.out.print(a.substring((int) list.get(y), (int) list.get(y + 7)));
				} else {
					System.out.print(a.substring((int) list.get(y)));
				}
			}
			System.out.print("\"");
		}

	}
}
