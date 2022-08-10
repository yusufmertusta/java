package lab4;

public class Buyucu extends Oyuncu{
	double toplamHamleGucu;

	public Buyucu(String isim,double saldiriGucu,double deneyimPuani) {
		super( isim, saldiriGucu, deneyimPuani);
		this.toplamHamleGucu=toplamHamleGucu;
	}

	final double buyuBonusu = 1.5;
	
	
	private void setToplamHamleGucu(double toplamHamleGucu) {
		this.toplamHamleGucu = toplamHamleGucu;
	}

	@Override
	public String toString() {
		return "[BUYUCU] "+getIsim()+" Toplam Hamle Gucu: "+ getToplamHamleGucu() + " Deneyim Puani: "+ getDeneyimPuani(); 
	}

	@Override
	void bilgi() {
		System.out.println("[BUYUCU]");
		System.out.println("Isim: "+getIsim());
		System.out.println("Saldiri Gucu: "+getSaldiriGucu());
		System.out.println("Toplam Hamle Gucu: "+getToplamHamleGucu());
		System.out.println("Deneyim Puani: "+getDeneyimPuani());
		
	}

	@Override
	String ozet() {
		
		return Buyucu.this.toString();
	}

	@Override
	double getToplamHamleGucu() {
		return getSaldiriGucu()*buyuBonusu;
	}

	@Override
	public int compareTo(Oyuncu o) {
		if(this.getDeneyimPuani()>o.getDeneyimPuani()) {
		return 1;
		}
		if(this.getDeneyimPuani()<o.getDeneyimPuani()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
