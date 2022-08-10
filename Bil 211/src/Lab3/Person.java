package Lab3;

public class Person {

	private String ssn,name,sex,address;
	private String birth_date;
	
	public Person(String ssn, String name, String sex, String address, String birth_date) {
		this.ssn = ssn;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.birth_date = birth_date;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public int avgAge(Person[] people) {
		int year=0,age=0;
		for(int i=0;i<(people.length)-3;i++) {
		String year1 = people[i].getBirth_date().substring(6);
		year = Integer.parseInt(year1);
		age += 2022-year;
		}
	
		return age/7;
	}


	
	
}
