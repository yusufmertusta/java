package Lab3;

public class TeachingAssistant extends StudentAssistant {

	private static String course;

	public TeachingAssistant(String ssn, String name, String sex, String address, String birth_date, int salary,
			double percent_time, String course) {
		super(ssn, name, sex, address, birth_date, salary, percent_time);
		this.course = course;
	}

	public static  String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String get_course() {
		return TeachingAssistant.getCourse();
	}

}
