package midterm1;

import java.util.*;

public class Fast {
	
	public <T> void print_unique(ArrayList<T> x) {
		ArrayList<T> y = new ArrayList<>();
		for (int i = 0; i < x.size(); i++) {
			if (!y.contains(x.get(i))) {
				y.add(x.get(i));
				System.out.println(x.get(i));
			}
		}
	}

}
