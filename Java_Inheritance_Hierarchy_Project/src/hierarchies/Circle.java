package hierarchies;

public class Circle extends Shape {
	
	private double mradius;

	public Circle (String color, double radius) {
	super(color);
	mradius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(mradius, 2);
	}
	
	public String toString() {
	    return "Circle description: " +
	           "\n" + getColor() +
	           "\nType: Circle" +
	           "\nRadius: " + mradius +
	           "\nArea: " + area(); // Calling the area method to get the area value
	}


}
