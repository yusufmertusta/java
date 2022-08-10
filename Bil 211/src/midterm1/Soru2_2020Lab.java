package midterm1;
import java.util.*;
import java.io.*;

public class Soru2_2020Lab {
	
	public static void main(String[] args) throws IOException {
		
		File B = new File(args[0]);
		BufferedReader read = new BufferedReader(new FileReader(B));
		Scanner reader = new Scanner(B);
		String text = "";
		while(reader.hasNextLine()) {
			text += reader.nextLine() + "\n";
		}
		read.close();
		
		
		text = text.replaceAll(" ","");
		Str
		
		File A = new File("ASD.txt");
		BufferedWriter write = new BufferedWriter(new FileWriter(A));
		ste

		write.write(text);	
		write.close();
		
		for(int i=0;i<text.length();i++) {
		System.out.println(text.substring(i, i+1));
		}
	}

}
