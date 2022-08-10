package lab4;

public abstract class Oyuncu implements Comparable<Oyuncu>{

		private double saldiriGucu;
		private String isim;
		private double deneyimPuani;
		abstract void bilgi();
		abstract String ozet();
		abstract double getToplamHamleGucu();
		
		public Oyuncu(String isim,double saldiriGucu,double deneyimPuani) {
			this.isim=isim;
			this.saldiriGucu=saldiriGucu;
			this.deneyimPuani=deneyimPuani;
		}
		public double getSaldiriGucu() {
			return saldiriGucu;
		}
		public void setSaldiriGucu(double saldiriGucu) {
			this.saldiriGucu = saldiriGucu;
		}
		public String getIsim() {
			return isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		public double getDeneyimPuani() {
			return deneyimPuani;
		}
		public void setDeneyimPuani(double deneyimPuani) {
			this.deneyimPuani = deneyimPuani;
		}
		
}
