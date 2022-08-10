package lab3;

public class Kilic extends Silah {
	final double kilicBonusu = 1.25;
	
	public Kilic(double saldiriGucu, String isim) {
		super(saldiriGucu, isim);
	}

	@Override
	public double saldir(double hamleGucu){
		return super.saldir(hamleGucu)*kilicBonusu;
		
	}
	
	@Override
	public void bilgi() {
		System.out.println("Tanimsiz Kilic:");
		System.out.println("Isim: "+isim);
		System.out.println("Saldiri Gucu: "+saldiriGucu);
	}
	
	@Override
    public String toString() {
        return "[Tanimlanmayan Kilic]"+" "+"Saldiri Gucu: "+saldiriGucu;
    }
	
	@Override
	public String ses() {
		return isim + " cekildi!";
	}
	

	
}
