package lab5;

public class DesteklenmeyenIslem extends Exception{
	public DesteklenmeyenIslem() {
		super("Desteklenmeyen Islem: birden fazla islem desteklenmemektedir.");
	}
}
