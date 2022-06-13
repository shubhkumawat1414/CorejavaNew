package Exercise_10_6;

public class E10_6_5 {
	public static void main(String[] args) {

		String s = "shubham";
		String s1 = null;
		try {

			System.out.println(s1.length());

		} catch (NullPointerException e2) {
			System.out.println("this is for null pointer exception");
		} catch (StringIndexOutOfBoundsException e1) {
			System.out.println("this is for string index out of bound exception");
		}

	}
}