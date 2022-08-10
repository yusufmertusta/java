package Lab3;

public class Staff extends Employee {
	
	private String position;
	public Staff(String ssn, String name, String sex, String address, String birth_date, int salary, String position) {
		super(ssn,name,sex,address,birth_date,salary);
		this.position = position;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	
}
