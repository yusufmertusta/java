package lab9;

public class Employee {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getSalary() {
		return salary;
	}

	private void setSalary(int salary) {
		this.salary = salary;
	}
	

}
