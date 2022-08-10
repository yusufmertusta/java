package lab3;

public class Silah {
	public double saldiriGucu;
	public String isim;

	public Silah(double saldiriGucu, String isim) {
		this.saldiriGucu=saldiriGucu;
		this.isim=isim;
	}
	
	public double saldir(double hamleGucu) {
		return hamleGucu*saldiriGucu;
	}
	
	@Override
    public String toString() {
        return "[Tanimlanmayan Silah]"+" "+"Saldiri Gucu: "+saldiriGucu;
    }
	
	public void bilgi() {
		System.out.println("Tanimlanmayan Silah:");
		System.out.println("Isim: "+isim);
		System.out.println("Saldiri Gucu: "+saldiriGucu);
	}
	
	public String ses() {
		return isim + " gorundu!";
	}


}
