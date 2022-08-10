package hw2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		createFolder("profiles");
		createFolder("timelines");
		String command="";
		Scanner input = new Scanner(System.in);
		ArrayList<User> userlist = new ArrayList<User>();
		String userbio="";
		String[] comread;
		
		if(args.length==0) {
			System.out.println("Please type your command");
			for(int a=1;a<2;a++) {
				command = input.nextLine();
				comread = command.split(" ");
				if(comread[0].equals("Exit.")) {
					System.exit(0);
				}
				else {	
				if(comread[0].equals("Create")) {
					for(int i=2;i<comread.length;i++) {
						userbio += comread[i]+" ";
					}
					userlist.add(new User(comread[1],userbio));
					createFile(comread[1]+".txt","profiles");
					writeFile("profiles\\"+comread[1]+".txt","User Name: "+comread[1]+"\n"+"Bio: "+userbio);
					createFile(comread[1]+".txt","timelines");
					writeFile("timelines\\"+comread[1]+".txt","içerik yazýlýcak");
					
				}
				System.out.println(comread[1]+ " has been created!");
				Message.getDateAndTime();
				userbio = "";
				a=0;
			}
			}
			/*do {
				command = input.nextLine();
				comread = command.split(" ");
				if(comread[0].equals("Create")) {
					for(int i=2;i<comread.length;i++) {
						userbio += comread[i]+" ";
					}
					userlist.add(new User(comread[1],userbio));
					createFile(comread[1]+".txt","profiles");
					writeFile("profiles\\"+comread[1]+".txt","User Name: "+comread[1]+"\n"+"Bio: "+userbio);
					createFile(comread[1]+".txt","timelines");
					writeFile("timelines\\"+comread[1]+".txt","User Name: "+comread[1]+"\n"+"Bio: "+userbio);
					
				}
				System.out.println(comread[1]+ " has been created!");
			}while(!(input.next().equals("Exit.")));*/
			
			
		}
		
		
		
		
	}
	 private static void createFolder(String foldername) {
	        File dir = new File(foldername);
	        dir.mkdir();
	    }
	 private static void createFile(String filename,String folder) {
	        try {
	        	File file;
	            file = new File(folder+"\\"+filename);
	            file.createNewFile();
	        } catch (IOException e) {
	            e.getStackTrace();
	        } 
	    }
	 private static void writeFile(String filename,String text) throws IOException {
		 BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			writer.write(text);
			writer.close();
	 }
}
