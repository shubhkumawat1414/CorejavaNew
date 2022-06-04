package OOP;

public class TestShape2 extends Shape {
	public static void main(String[] args) {
		
		Shape s[] = new Shape[3];
        s[0]= new Rectangle();
        s[1] = new Circle(55);
        s[2] = new Triangle();
        my(s);
	//	System.out.println(s.getBorderWidth());
	//	System.out.println(s.getcolor());
	}

	private static void my(Shape []s) {
		for (int i = 0; i < s.length; i++) {
			double d=s[i].area();
			System.out.println(d);
	        }
	}

}
