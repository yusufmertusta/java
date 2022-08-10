package lab4;

public class Savasci extends Oyuncu{
	double toplamHamleGucu;
	final double savasBonusu = 1.3;

	public Savasci(String isim,double saldiriGucu,double deneyimPuani) {
		super(isim,saldiriGucu,deneyimPuani);
		this.toplamHamleGucu=toplamHamleGucu;
	}
	@Override
	double getToplamHamleGucu() {
		return getSaldiriGucu()*savasBonusu;
	}
	void setToplamHamleGucu(double toplamHamleGucu) {
		this.toplamHamleGucu = toplamHamleGucu;
	}

	@Override
	void bilgi() {
		System.out.println("[SAVASCI]");
		System.out.println("Isim: "+getIsim());
		System.out.println("Saldiri Gucu: "+getSaldiriGucu());
		System.out.println("Toplam Hamle Gucu: "+getToplamHamleGucu());
		System.out.println("Deneyim Puani: "+getDeneyimPuani());
	}
	
	@Override
	public String toString() {
		return "[SAVASCI]"+"\t"+getIsim()+"\t"+"Toplam Hamle Gucu:"+"\t"+ getToplamHamleGucu() +"\t"+"Deneyim Puani:"+"\t"+ getDeneyimPuani(); 
	}
	
	@Override
	String ozet() {
		return Savasci.this.toString();
	}
	

	@Override
	public int compareTo(Oyuncu o) {
		if(this.getToplamHamleGucu()>o.getToplamHamleGucu()) {
		return 1;
		}
		if(this.getToplamHamleGucu()<o.getToplamHamleGucu()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
