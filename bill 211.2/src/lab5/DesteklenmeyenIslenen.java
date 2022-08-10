package lab5;

public class DesteklenmeyenIslenen extends Exception{
	public DesteklenmeyenIslenen(String s) {
		super("Desteklenmeyen Islenen: "+ s +" isleneni desteklenmemektedir.");
	}
}
