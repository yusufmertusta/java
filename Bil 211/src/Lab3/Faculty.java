package Lab3;

public class Faculty extends Employee {
	
	private String rank;
	public Faculty(String ssn, String name, String sex, String address, String birth_date, int salary, String rank) {
		super(ssn,name,sex,address,birth_date,salary);
		this.rank = rank;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
}
