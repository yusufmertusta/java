package lab6;

public class Rectangle extends Shape {
	
	private int height,width;

	public Rectangle(int width, int height, String color) {
		super(color);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		double A = (height*width);
		return Math.round(A*100.0)/100.0;
	}

	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	public double getCircumference() {
		double C = (height+width)*2;
		return Math.round(C*100.0)/100.0;
	}

	int getHeight() {
		return height;
	}

	void setHeight(int height) {
		this.height = height;
	}

	int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

}
