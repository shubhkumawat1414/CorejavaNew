package OOP;

public class Triangle extends Shape {
	private int base;
	private int height;
	private double area;

	public Double area() {
		return (double)((base*height)/2);
	}
	public double getarea() {
		return area;
	
	}
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	

}
