package lab6;
import java.io.*;

public class Editor {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		BufferedReader read = new BufferedReader(new FileReader(args[0]));
		String line,text="";
		
		while((line = read.readLine()) != null) {
			text += line + "\n";
		}
		
		read.close();
		
		String text1 = text.replaceAll(",", "");
		String text2 = text1.replaceAll("\\.", "");
		
		String[] words = text2.split(" ");
		
		if(args[1].equals("degistir")) {
			String newtext = text.replaceAll(args[2], args[3]);
			BufferedWriter writer = new BufferedWriter(new FileWriter(args[0]));
			writer.write(newtext);
			writer.close();
		}
		
		else if(args[1].equals("sil")) {
			String newtext = text.replaceAll(args[2], "");
			BufferedWriter writer = new BufferedWriter(new FileWriter(args[0]));
			writer.write(newtext);
			writer.close();
		}
		
		else if(args[1].equals("tamKelimeSay")) {
			int count = 0;
			for(int i=0;i<words.length;i++) {
				words[i]=words[i].toLowerCase();
			}
			for(int i=0;i<words.length;i++) {
				if(args[2].equals(words[i])) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		else if(args[1].equals("kelimeSay")) {
			int count = 0;
			for(int i=0;i<words.length;i++) {
				words[i]=words[i].toLowerCase();
			}
			for(int i=0;i<words.length;i++) {
				if(words[i].contains(args[2])) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		else if(args[1].equals("kopyala")) {
			String newtext = text;
			BufferedWriter writer = new BufferedWriter(new FileWriter(args[2]));
			writer.write(newtext);
			writer.close();
		}	
		
	}
	
	
	
}
