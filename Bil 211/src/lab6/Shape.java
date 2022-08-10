package lab6;

public abstract class Shape {
	
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	public abstract double getCircumference();
	public String getColor() {
		return this.color;
	}

}
