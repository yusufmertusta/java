package hw2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

	public static void getDateAndTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
	}
	
}
