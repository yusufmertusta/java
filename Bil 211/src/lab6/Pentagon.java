package lab6;

public class Pentagon extends Shape {
	
	private int sideLength;

	public Pentagon(int sideLength, String color) {
		super(color);
		this.sideLength = sideLength;
	}

	@Override
	public double getArea() {
		double A = (Math.pow(sideLength, 2)*(Math.sqrt(5*(5+(2*Math.sqrt(5))))))/4;
		return Math.round(A*100.0)/100.0;
	}
	
	@Override
	public double getCircumference() {
		double C = 5*sideLength;
		return Math.round(C*100.0)/100.0;
	}

	int getSideLength() {
		return sideLength;
	}

	void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}

	

}
