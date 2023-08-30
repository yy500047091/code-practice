package practice;

import java.util.List;

abstract class Polygon {
	  private String name;
	  
	  List<Polygon> sides ;
	  
	  

	

	  // Abstract methods
	

	  public abstract double getArea();

	  public abstract double getPerimeter();
	  
	}


	// A Rectangle Class, Which Inherits from the Shape Class


	class Rectangle extends Polygon {
	  private double width;
	  private double height;

	  public Rectangle(double width, double height) {
	  
	    super("Rectangle");
	    this.width = width;
	    this.height = height;
	  }



	  // Provide an implementation for inherited abstract getArea() method
	  public double getArea() {
	    return width * height;
	  }

	  // Provide an implementation for inherited abstract getPerimeter() method
	  public double getPerimeter() {
	    return 2.0 * (width + height);
	  }
	}

	// A Square Class, Which Inherits from Shape Class
	class Square extends Polygon {
	  private double side;

	  public Square(double side) {
		  
		    super("Square");
		    this.side = side;
		
		  }



		  // Provide an implementation for inherited abstract getArea() method
		  public double getArea() {
		    return side * side;
		  }

		  // Provide an implementation for inherited abstract getPerimeter() method
		  public double getPerimeter() {
		    return 2.0 * (side + side);
		  }
		}
	// A ShapeUtil Class That Has Utility Methods to Draw Any Shapes and Print
	// Details About Them



	public class Main {
	  public static void main(String[] args) {
	    // Create some shapes, draw, and print their details
	    Polygon[] shapeList = new Polygon[2];
	    shapeList[0] = new Rectangle(2.0, 4.0); // Upcasting
	    shapeList[1] = new Square(5.0); // Upcasting

	    // Draw all shapes
	    ShapeUtil.drawShapes(shapeList);

	    // Print details of all shapes
	    ShapeUtil.printShapeDetails(shapeList);
	  }
	}