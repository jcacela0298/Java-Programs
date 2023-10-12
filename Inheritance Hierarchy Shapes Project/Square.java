package hierarchies;

public class Square extends Shape {
	
	private double msideLength;

	public Square (String color, double sideLength) {
		super(color);
		msideLength = sideLength;
	}

	public double area() {
		return msideLength * msideLength;
	}
	
	public String toString() {
	    return "Square description: " +
	    	   "\n" + getColor() +
	           "\nType: Square" +
	           "\nSide Length: " + msideLength +
	           "\nArea: " + area(); // Calling the area method to get the area value
	}

}
