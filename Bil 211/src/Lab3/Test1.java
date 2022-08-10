package Lab3;

public class Test1 {
  public static void main(String [] args) {
    Person[] people = new Person[10];
    people[0] = new GradStudent("00001", "Ahmet", "Male", "01 St. 01283", "01/01/1998", "Comp Sci", "Masters");
    people[1] = new UndergradStudent("00003", "Veli", "Male", "09 St. 01283", "01/03/1999", "AI Eng", "Databases");
    people[2] = new TeachingAssistant("10004", "Pelin", "Female", "12 St. 01283", "13/01/1989", 3000, 0.34, "Databases");
    people[3] = new ResearchAssistant("10016", "Deniz", "Male", "Apricot St. 01283", "13/01/1999", 5000, 0.76, "Signal processing on 5G datasets");
    people[4] = new Faculty("00010", "Elif", "Female", "13 St. 01234", "03/04/1980", 8000, "Associate Professor"); 
    people[5] = new Staff("10410", "Burak", "Male", "25 St. 01234", "03/14/1985", 6000, "Administrative Assistant");
    people[6] = new Staff("00115", "Mert", "Male", "17 St. 01034", "03/14/1983", 6000, "Administrative Assistant");
        
    Student[] databasesClass = { (Student) people[0], (Student) people[1]}; 
    Employee[] employees = {(Employee)people[2],(Employee) people[3],(Employee) people[4],(Employee) people[5],(Employee) people[6]}; 
    StudentAssistant[] assistants = {(StudentAssistant)people[2],(StudentAssistant) people[3]};
    Student[] allStudents = {(Student)people[0], (Student)people[1]}; 
    
    System.out.println(people[0].avgAge(people));
    System.out.println(employees[0].totalSalary(employees));
    System.out.println(assistants[0].avgPercentTime(assistants));
    System.out.println(allStudents[0].countMajor(allStudents, "Comp Sci"));
    
    System.out.println(databasesClass[1].get_class());
    System.out.println(((TeachingAssistant) assistants[0]).get_course());
    System.out.println(((ResearchAssistant) assistants[1]).get_project());
    System.out.println(databasesClass[0].get_majorDept());
  }
}