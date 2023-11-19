package hierarchies;

public class Shape {

	private String mcolor;
	
	public Shape(String color) {
		
		mcolor = color;
	}

	public String getColor() {
		return "Color: " + mcolor;
	}
	
	public double area() {
		return 0.0;
		//return area
		//must be overridden in each derived class
	}
	public String toString() {
		//return description (color, type, measurements, and area as a string)
		//must be overridden in each derived class
		return "generic shape";
	}
}
