package lab6;

public class Circle extends Ellipse {
	
	private int axis;
	
	public Circle(int axis, String color) {
		super(color);
		this.axis = axis;
	}
	

	@Override
	public double getArea() {
		double A = PI*axis*axis;
		return Math.round(A*100.0)/100.0;
	}

	@Override
	public double getCircumference() {
		double C = 2*PI*axis;
		return Math.round(C*100.0)/100.0;
	}

}
