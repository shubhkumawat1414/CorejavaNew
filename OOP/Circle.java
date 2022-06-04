package OOP;

public class Circle extends Shape {

	private int radius;
	private static Double PI = 3.14;
public Circle(int r) {
	this.radius=r;
}
	public Circle() {
	// TODO Auto-generated constructor stub
}
	public Double area() {
		return PI * radius * radius;

	}

	public static Double getPI() {
		return PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
