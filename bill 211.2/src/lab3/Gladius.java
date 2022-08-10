package lab3;

public class Gladius extends Kilic {
	final double gladiusBonusu = 1.3;

	public Gladius(double saldiriGucu, String isim) {
		super(saldiriGucu, isim);
	}
	@Override
    public String toString() {
        return "[Gladius]"+" "+"Saldiri Gucu: "+saldiriGucu;
    }
	
	@Override
	public double saldir(double hamleGucu){
		return super.saldir(hamleGucu)*gladiusBonusu;
		
	}
	
	@Override
	public void bilgi() {
		System.out.println("Gladius:");
		System.out.println("Isim: "+isim);
		System.out.println("Saldiri Gucu: "+saldiriGucu);
	}
	
	@Override
	public String ses() {
		return isim + " savruluyor!";
	}
}
