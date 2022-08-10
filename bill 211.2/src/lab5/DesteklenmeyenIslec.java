package lab5;

public class DesteklenmeyenIslec extends Exception{
	public DesteklenmeyenIslec(String s) {
		super("Desteklenmeyen Islec: "+ s +" isleci desteklenmemektedir.");
	}
}
