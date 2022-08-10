package Lab8;

import java.util.LinkedList;

public class Kume {

	public static LinkedList<String> birlesim(LinkedList<String> list1, LinkedList<String> list2) {
		LinkedList<String> listB = new LinkedList<String>();
		listB.addAll(list1);
		listB.addAll(list2);
		Kume.kopyaKaldir(listB);
		return listB;
	}

	public static LinkedList<String> kesisim(LinkedList<String> list1, LinkedList<String> list2) {
		LinkedList<String> listB = new LinkedList<String>();
		for (int i = 0; i < list1.size(); i++) {
			for (int a = 0; a < list2.size(); a++) {
				if (list1.get(i).equals(list2.get(a)))
					listB.add(list2.get(a));
			}
		}
		return listB;
	}

	public static LinkedList<String> fark(LinkedList<String> list1, LinkedList<String> list2) {
		LinkedList<String> listB = new LinkedList<String>();
		listB.addAll(list1);
		for (int i = 0; i < list1.size(); i++) {
			for (int a = 0; a < list2.size(); a++) {
				if (list1.get(i).equals(list2.get(a)))
					listB.remove(list2.get(a));
			}
		}
		return listB;
	}

	public static LinkedList<String> kopyaKaldir(LinkedList<String> list1) {
		for (int i = 0; i < list1.size() - 1; i++) {
			for (int a = i + 1; a < list1.size(); a++) {
				if (list1.get(i).equals(list1.get(a)))
					list1.remove(a);
			}
		}
		return list1;
	}

}
