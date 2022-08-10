package lab5;

public class EksikIslec extends Exception{
	
	public EksikIslec(int a, int b) {
		super("Eksik Islec: "+ a +" ve "+ b +" arasinda islec bulunmamaktadir.");
	}
	
	public EksikIslec(String a, String b) {
		super("Eksik Islec: "+ a +" ve "+ b +" arasinda islec bulunmamaktadir.");
	}
	
	public EksikIslec(int a, String b) {
		super("Eksik Islec: "+ a +" ve "+ b +" arasinda islec bulunmamaktadir.");
	}
	
	public EksikIslec(String a, int b) {
		super("Eksik Islec: "+ a +" ve "+ b +" arasinda islec bulunmamaktadir.");
	}

}
