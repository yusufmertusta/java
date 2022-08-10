package lab6;

public class Ellipse extends Shape {
	
	private int majorAxis,minorAxis;
	final double PI = 3.14;
		
	public Ellipse(int majorAxis, int minorAxis, String color) {
		super(color);
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}

	public Ellipse(String color) {
			super(color);
	}

	@Override
	public double getArea() {
		double A = PI*majorAxis*minorAxis;
		return Math.round(A*100.0)/100.0;
	}

	@Override
	public double getCircumference() {
		double C = (2*PI)*(Math.sqrt(((majorAxis*majorAxis)+(minorAxis*minorAxis))/2));
		return Math.round(C*100.0)/100.0;
	}

	public int getMinorAxis() {
		return minorAxis;
	}

	int getMajorAxis() {
		return majorAxis;
	}

	void setMajorAxis(int majorAxis) {
		this.majorAxis = majorAxis;
	}

	void setMinorAxis(int minorAxis) {
		this.minorAxis = minorAxis;
	}

}
