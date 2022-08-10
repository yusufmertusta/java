package Lab5;

import java.io.*;
import java.util.*;

public class Sifreleyici {
	
	public static void main(String[] args) throws IOException {
		List<Character> chars = new ArrayList<Character>();
		List<Character> chars2 = new ArrayList<Character>();
		
		if(args[0].equals("encrypt")) {
			
				// read the text file and put the chars in a array-list
	
				BufferedReader read = new BufferedReader(new FileReader(args[1]));
				String line,text="";
				
				while((line = read.readLine()) != null) {
					text += line + "\n";
				}
				for(int i=0;i<text.length();i++) {
					chars.add(text.charAt(i));
				}
				read.close();
				
				
				// encrypt the text file
		
				
					
					if(Integer.parseInt(args[2])>=0) {
					for(int i=0;i<chars.size();i++) {
					if((chars.get(i)<=122 && chars.get(i)>=97) || (chars.get(i)<=90 && chars.get(i)>=65)) {
						int b = Integer.parseInt(args[2]);
						int a = chars.get(i) + b;  
						
					
						
						if((chars.get(i)<=122 && chars.get(i)>=97) && !(a<=122 && a>=97)) {
							while(!((chars.get(i) + b)<=122 && (chars.get(i) + b)>=97)) {
								b = b-26;
							}
							
							
							chars.set(i,(char)(chars.get(i) + b));
						}
								
						else if((chars.get(i)<=90 && chars.get(i)>=65) && !(a<=90 && a>=65)) {
							while(!((chars.get(i) + b)<=90 && (chars.get(i) + b)>=65)) {
								b = b-26;
							}
							
							chars.set(i,(char)(chars.get(i) + b));
						}	
								
						
						else if((a<=122 && a>=97) || (a<=90 && a>=65))
						chars.set(i,(char)a);
					}
				}
			}
					else if(Integer.parseInt(args[2])<0) {
						for(int o=0;o<chars.size();o++) {
							if((chars.get(o)<=122 && chars.get(o)>=97) || (chars.get(o)<=90 && chars.get(o)>=65)) {
								int b = (Integer.parseInt(args[2]))*(-1);
								int a = chars.get(o) - b;  
								
					if((chars.get(o)<=122 && chars.get(o)>=97) && !(a<=122 && a>=97)) {
						while(!((chars.get(o) - b)<=122 && (chars.get(o) - b)>=97)) {
							b = b-26;
						}
						
						chars.set(o,(char)(chars.get(o) - b));
					}
							
					else if((chars.get(o)<=90 && chars.get(o)>=65) && !(a<=90 && a>=65)) {
						while(!((chars.get(o) - b)<=90 && (chars.get(o) - b)>=65)) {
							b = b-26;
						}
						
						chars.set(o,(char)(chars.get(o) - b));
					}	
							
					
					else if((a<=122 && a>=97) || (a<=90 && a>=65))
					chars.set(o,(char)a);
				
						}
						
					}
					}
					
					
		
				
				
				String encrypted="";
				for(int i=0;i<chars.size();i++) {	
					//System.out.print(chars.get(i));
					encrypted +=chars.get(i);
				}
			
				// write the encrypted text to file
				
				BufferedWriter write = new BufferedWriter(new FileWriter(args[3]));
				write.write(encrypted);
				write.close();
						
		}
		
		
	
		// read the decrypted text file and put the chars in a array-list
		
		
		if(args[0].equals("decrypt")) {
			
			
			
			BufferedReader read2 = new BufferedReader(new FileReader(args[1]));
			String line2,text2="";
			
			while((line2 = read2.readLine()) != null) {
				text2 += line2 + "\n";
			}
			for(int i=0;i<text2.length();i++) {
				chars2.add(text2.charAt(i));
			}
			read2.close();
			
			
			// decrypt the text file
			
			if(Integer.parseInt(args[2])>=0) {
			
				for(int i=0;i<chars2.size();i++) {
					if((chars2.get(i)<=122 && chars2.get(i)>=97) || (chars2.get(i)<=90 && chars2.get(i)>=65)) {
						int b = Integer.parseInt(args[2]);
						int a = chars2.get(i) - b;  
						
						
						if((chars2.get(i)<=122 && chars2.get(i)>=97) && !(a<=122 && a>=97)) {
							while(!((chars2.get(i) - b)<=122 && (chars2.get(i) - b)>=97)) {
								b = b-26;
							}
							
							chars2.set(i,(char)(chars2.get(i) - b));
						}
								
						else if((chars2.get(i)<=90 && chars2.get(i)>=65) && !(a<=90 && a>=65)) {
							while(!((chars2.get(i) - b)<=90 && (chars2.get(i) - b)>=65)) {
								b = b-26;
							}
							
							chars2.set(i,(char)(chars2.get(i) - b));
						}	
								
						
						else if((a<=122 && a>=97) || (a<=90 && a>=65))
						chars2.set(i,(char)a);
					}
				} 
			}
			
			
			else if(Integer.parseInt(args[2])<0) {
				for(int i=0;i<chars2.size();i++) {
				if((chars2.get(i)<=122 && chars2.get(i)>=97) || (chars2.get(i)<=90 && chars2.get(i)>=65)) {
					int b = (Integer.parseInt(args[2]))*(-1);
					int a = chars2.get(i) + b;
					
				
					
					if((chars2.get(i)<=122 && chars2.get(i)>=97) && !(a<=122 && a>=97)) {
						while(!((chars2.get(i) + b)<=122 && (chars2.get(i) + b)>=97)) {
							b = b-26;
						}
						
						
						chars2.set(i,(char)(chars2.get(i) + b));
					}
							
					else if((chars2.get(i)<=90 && chars2.get(i)>=65) && !(a<=90 && a>=65)) {
						while(!((chars2.get(i) + b)<=90 && (chars2.get(i) + b)>=65)) {
							b = b-26;
						}
						
						chars2.set(i,(char)(chars2.get(i) + b));
					}	
							
					
					else if((a<=122 && a>=97) || (a<=90 && a>=65))
					chars2.set(i,(char)a);
				}
			}
		}
			
			
			String decrypted="";
			for(int i=0;i<chars2.size();i++) {	
				//System.out.print(chars.get(i));
				decrypted +=chars2.get(i);
			}
			
			// write the decrypted text to file
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(args[3]));
			writer.write(decrypted);
			writer.close();
			
			
		}
		
		
	}
	}
	

