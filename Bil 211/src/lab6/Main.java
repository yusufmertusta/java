package lab6;

public class Main{
	  public static void main(String[] args){
	    Shape[] shapes = new Shape[4];
	    shapes[0] = new Rectangle(4,5,"red");
	    shapes[1] = new Ellipse(5,3,"blue");
	    shapes[2] = new Circle(4,"black");
	    shapes[3] = new Pentagon(6,"green");

	    for (Shape shape : shapes) {
	      System.out.println(shape.getColor());
	    }
	    

	    for (Shape shape : shapes) {
	      System.out.println(shape.getCircumference());
	    }

	    for (Shape shape : shapes) {
	      System.out.println(shape.getArea());
	    }
	    
	    Rectangle rectangleObj = (Rectangle) shapes[0];
	    System.out.println(rectangleObj.getHeight());
	    rectangleObj.setHeight(10);
	    System.out.println(rectangleObj.getHeight());
	    System.out.println(rectangleObj.getCircumference());

	    Ellipse ellipseObj = (Ellipse) shapes[1];    
	    System.out.println(ellipseObj.getMajorAxis());
	    ellipseObj.setMajorAxis(7);    
	    System.out.println(ellipseObj.getMajorAxis());
	    System.out.println(ellipseObj.getArea());    
	   }
	}