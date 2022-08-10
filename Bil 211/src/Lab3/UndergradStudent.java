package Lab3;

public class UndergradStudent extends Student {

	private static String Uclass;
	public UndergradStudent(String ssn, String name, String sex, String address, String birth_date, String major_dept, String Uclass) {
		super(ssn,name,sex,address,birth_date,major_dept);
		this.Uclass = Uclass;
	}
	public static String getUclass() {
		return Uclass;
	}
	public void setUclass(String uclass) {
		Uclass = uclass;
	}

	public String get_class() {
		
		return UndergradStudent.getUclass();
	}
	
}