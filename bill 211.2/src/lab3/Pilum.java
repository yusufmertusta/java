package lab3;

public class Pilum extends Silah{
	final double pilumBonusu = 1.1;

	public Pilum(double saldiriGucu, String isim) {
		super(saldiriGucu, isim);

	}
	
	@Override
    public String toString() {
        return "[Pilum]"+" "+"Saldiri Gucu: "+saldiriGucu;
    }
	
	@Override
	public double saldir(double hamleGucu){
		return super.saldir(hamleGucu)*pilumBonusu;
		
	}
	
	@Override
	public void bilgi() {
		System.out.println("Pilum:");
		System.out.println("Isim: "+isim);
		System.out.println("Saldiri Gucu: "+saldiriGucu);
	}
	
	@Override
	public String ses() {
		return isim + " saplandi!";
	}

}
