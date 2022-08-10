package Lab3;

public class StudentAssistant extends Employee {
	
	private double percent_time;
	public StudentAssistant(String ssn, String name, String sex, String address, String birth_date, int salary, double percent_time) {
	super(ssn,name,sex,address,birth_date,salary);
	this.percent_time = percent_time;
	}
	public double getPercent_time() {
		return percent_time;
	}
	public void setPercent_time(double percent_time) {
		this.percent_time = percent_time;
	}
	public double avgPercentTime(StudentAssistant[] assistants) {
		double time=0;
		double count1=0;
		for(int i=0;i<assistants.length;i++) {
			time += assistants[i].getPercent_time()*100;
			count1++;
		}
		System.out.print("%");
		double time2 = time/count1;
		int perc = (int) time2;
		return perc;
	}

	
}
