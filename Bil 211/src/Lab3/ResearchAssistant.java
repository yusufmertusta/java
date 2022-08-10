package Lab3;

public class ResearchAssistant extends StudentAssistant {

	private static String project;
	public ResearchAssistant(String ssn, String name, String sex, String address, String birth_date, int salary, double percent_time, String project) {
		super(ssn,name,sex,address,birth_date,salary,percent_time);
		this.project = project;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String get_project() {
		return project;
	}

	
	
}
