package lab5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
	
	Scanner input = new Scanner(System.in);
	String s = input.nextLine();
	
	String[] split = s.split(" ");
		
	try {
		int count=0;
		for(int a=0;a<split.length;a++) {
			for(int t=0;t<split[a].length();t++)
			if(!(Character.isLetter(split[a].charAt(t))&&isStrInt(split[a]))) {
				count++;
			}
		}
		String[] c = new String[count];
		int b=0;
		for(int i=0;i<split.length;i++) {
			for(int a=0;a<split[i].length();a++) {
				if(!(Character.isLetter(split[i].charAt(a))||isStrInt(split[i]))) {				
				c[b] = split[i];
				if(b<c.length) {
				b++;
				}
				}
			}
			}
		
		for(int i=0;i<c.length;i++) {
			if(c[i]!=null) {
			if(!(c[i].equals("+") || c[i].equals("-") || c[i].equals("*") || c[i].equals("/"))) {
				throw new DesteklenmeyenIslec(c[i]);
			}
		}}
		}catch (DesteklenmeyenIslec a) {
		System.out.println(a.getMessage());
	}
	
	try {
		for(int i=1;i<split.length;i++) {
			if((Character.isLetter(split[i-1].charAt(0))||isStrInt(split[i-1]))&&(Character.isLetter(split[i].charAt(0))||isStrInt(split[i]))) {
				if(isStrInt(split[i-1])&&isStrInt(split[i]))
					throw new EksikIslec(Integer.parseInt(split[i-1]),Integer.parseInt(split[i]));
				else if(Character.isLetter(split[i-1].charAt(0))&&isStrInt(split[i]))
					throw new EksikIslec(split[i-1],Integer.parseInt(split[i]));
				else if(isStrInt(split[i-1])&&Character.isLetter(split[i].charAt(0)))
					throw new EksikIslec(Integer.parseInt(split[i-1]),split[i]);
				else if(Character.isLetter(split[i-1].charAt(0))&&Character.isLetter(split[i].charAt(0)))
						throw new EksikIslec(split[i-1],split[i]);
			}
		}
		
	} catch (EksikIslec b) {
		System.out.println(b.getMessage());
	}
	
	try {
		for(int i=0;i<split.length;i++) {
			for(int a=0;a<split[i].length();a++)
			if(Character.isLetter(split[i].charAt(a))&&!isStrInt(split[i])){
			throw new DesteklenmeyenIslenen(split[i]);
			}
		}
	} catch (DesteklenmeyenIslenen c) {
		System.out.println(c.getMessage());
	}
	
	try {
		int count=0;
		for(int i=0;i<split.length;i++) {
			for(int a=0;a<split[i].length();a++)
				if(!(Character.isLetter(split[i].charAt(a))||isStrInt(split[i]))) {
					count++;
		}
	}

	if(count>1) {
		throw new DesteklenmeyenIslem();
	}
	}catch (DesteklenmeyenIslem d) {
		System.out.println(d.getMessage());
	}
	
	}
	
/*	public static int findIslec(String[] split) {
		int s0=0;
		int count=0;
		for(int i=0;i<split.length;i++) {
			if(!isStrInt(split[i])) {
				for(int a=0;a<split[i].length();a++) {
					if(!Character.isLetter(split[i].charAt(a))||!isChInt(split[i].charAt(a))) {
						for(int x=0;x<split[i].length();x++) {
							
						}
						s0++;
					}
			}
		}
	}
		String[] islec = new String[s0];
		return s0;
	}
	
	public static int findIslenen(String[] split) {
		int s1=0;
		for(int i=0;i<split.length;i++) {
			if(isStrInt(split[i])) {
				s1++;
			}
		
				for(int a=0;a<split[i].length();a++) {
					if(!Character.isLetter(split[i].charAt(a))||!isChInt(split[i].charAt(a))) {
						
						s1++;
					}
			}
		}
	
		
		return s1;
}
	*/
	public static boolean isStrInt(String s)
	{
	    try
	    {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}
	public static boolean isChInt(char c) {
		 try
		    {
			 	Character.getNumericValue(c);  
		        return true;
		    } catch (NumberFormatException ex)
		    {
		        return false;
		    }
	}
}
