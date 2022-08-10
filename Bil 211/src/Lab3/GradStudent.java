package Lab3;

public class GradStudent extends Student {

	private String degree_program;
	public GradStudent(String ssn, String name, String sex, String address, String birth_date, String major_dept, String degree_program) {
	super(ssn,name,sex,address,birth_date,major_dept);
	this.degree_program = degree_program;
	}
	public String getDegree_program() {
		return degree_program;
	}
	public void setDegree_program(String degree_program) {
		this.degree_program = degree_program;
	}

	
}
