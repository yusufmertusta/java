package lab3;

public class Savasci {
	Silah silah;
	String isim;
	double can = 100;
	
	public Savasci(Silah silah, String isim) {
		this.silah=silah;
		this.isim=isim;
	}
	
	double saldir(double hamleGucu) {
		System.out.println("["+isim+"] "+silah.ses()+" Saldiri Gucu: "+silah.saldir(hamleGucu));
		return silah.saldir(hamleGucu);
	}
	
	@Override
    public String toString() {
        return "["+isim+"]"+" "+"Kalan can: "+can+" Silah: "+silah;
    }
	
	void zararGor(double zarar) {
		can = can-zarar;	
		if(can<=0) {
			can=0;
			
			System.out.println("["+isim+"]" + " yenildi!");
		}
		else {
			System.out.println("["+isim+"] "+"can kaybediyor! Kalan can: "+can);
		}
		
	}
	
	
}
