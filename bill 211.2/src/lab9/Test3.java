package lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test3 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ali Yilmaz", 7500);
		Employee e2 = new Employee("Eren Acar", 8500);
		Employee e3 = new Employee("Ayse Bicakci", 10000);
		Employee e4 = new Employee("Bekir Kara", 8000);
		ArrayList<Employee> firm = new ArrayList<Employee>();
		firm.add(e1);
		firm.add(e2);
		firm.add(e3);
		firm.add(e4);
// firm listesini sort metodu ve farkli comparatorlar kullanarak isme gore ve salary'e gore sort edin
// COZUM BURADA BASLAR
		Collections.sort(firm, new Comparator<Employee>() {
			@Override
			public int compare(Employee s1, Employee s2) {
				return s1.name.compareToIgnoreCase(s2.name);
				
			}
		});
		System.out.print("[");
		for(int i=0;i<firm.size()-1;i++) {
			System.out.print((firm.get(i).name)+" : " + firm.get(i).salary + ", ");
		}
		System.out.print((firm.get(3).name)+" : " + firm.get(3).salary);
		System.out.println("]");
		Collections.sort(firm, new Comparator<Employee>() {
			@Override
			public int compare(Employee s1, Employee s2) {
				return Integer.compare(s1.salary,s2.salary);	
			}
		});
		System.out.print("[");
		for(int i=0;i<firm.size()-1;i++) {
			System.out.print((firm.get(i).name)+" : " + firm.get(i).salary + ", ");
		}
		System.out.print((firm.get(3).name)+" : " + firm.get(3).salary);
		System.out.print("]");
		
// COZUM BURADA BITER
	}
}