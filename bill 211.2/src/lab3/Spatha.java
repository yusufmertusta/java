package lab3;

public class Spatha extends Kilic{
	final double spathaBonusu = 1.45;
	
	public Spatha(double saldiriGucu, String isim) {
		super(saldiriGucu, isim);
	}
	
	@Override
    public String toString() {
        return "[Spatha]"+" "+"Saldiri Gucu: "+saldiriGucu;
    }
	
	@Override
	public double saldir(double hamleGucu){
		return super.saldir(hamleGucu)*spathaBonusu;
	}
	
	@Override
	public void bilgi() {
		System.out.println("Spatha:");
		System.out.println("Isim: "+isim);
		System.out.println("Saldiri Gucu: "+saldiriGucu);
	}
	
	@Override
	public String ses() {
		return isim + " saldiriyor!";
	}

}
