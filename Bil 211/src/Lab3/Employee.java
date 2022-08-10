package Lab3;

public class Employee extends Person {

	private int salary;
	
	public Employee(String ssn, String name, String sex, String address, String birth_date, int salary) {
		super(ssn,name,sex,address,birth_date);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int totalSalary(Employee[] employees) {
		int total=0;
		for(int i=0;i<employees.length;i++) {
			total += employees[i].getSalary();
		}
		return total;
	}

	
	
	
}
