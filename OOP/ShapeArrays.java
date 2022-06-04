package OOP;

public class ShapeArrays extends Shape{

	public static void main(String[] args) {
		
		Shape s[] = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		
		Rectangle r = (Rectangle) s[0];
		Shape s4 = new Shape ();
		r.setLength(12);
		r.setWidth(3);
		
		Circle c = (Circle) s[1];
		c.setRadius(15);
		
		Triangle t = (Triangle) s[2];
		t.setBase(10);
		t.setHeight(5);
		
		for (int i = 0; i<s.length; i++) {
			double d = s[i].area();
			
			System.out.println(d);
		}
	}
}