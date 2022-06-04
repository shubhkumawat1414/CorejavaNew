package OOP;

public class Shape {
	private String color;
	private int BorderWidth;

	public Shape() {
		System.out.println("This is default Constructor");
	}

	public Shape(String color, int BorderWidth) {
		this.BorderWidth = BorderWidth;
		this.color = color;
	}

	public String getcolor() {
		return color;
	}

	public int getBorderWidth() {
		return BorderWidth;
	}

	public Double area() {
		return null;
		
	}
}