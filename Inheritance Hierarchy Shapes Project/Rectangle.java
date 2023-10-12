package hierarchies;

public class Rectangle extends Shape {
	
	private double mwidth;
	private double mlength;

	public Rectangle (String color, double width, double length) {
		super(color);
		mwidth = width;
		mlength = length;
	}

	public double area() {
		return mwidth * mlength;
	}
	
	public String toString() {
	    return "Rectangle description: " +
	    	   "\n" + getColor() +
	           "\nType: Rectangle" +
	           "\nWidth: " + mwidth +
	           "\nLength: " + mlength +
	           "\nArea: " + area(); // Calling the area method to get the area value
	}
}
