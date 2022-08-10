package Lab3;

public class Student extends Person {
	
	private String major_dept;
	public Student(String ssn, String name, String sex, String address, String birth_date, String major_dept) {
		super(ssn, name, sex, address, birth_date);
		this.major_dept = major_dept;
	}
	public String getMajor_dept() {
		return major_dept;
	}
	public void setMajor_dept(String major_dept) {
		this.major_dept = major_dept;
	}
	public int countMajor(Student[] allStudents, String dept) {
		int count=0;
			for(int i=0;i<allStudents.length;i++) {
				if(allStudents[i].getMajor_dept() == dept)
					count++;
			}

		return count;
	}

	public String get_class() {
		return "";
	}
	public String get_majorDept() {
		return major_dept;
	}
	
}
