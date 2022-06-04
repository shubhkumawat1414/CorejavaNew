package OOP;

public class TestConstructor {

	public static void main(String[] args) {

		Constructor s = new Constructor("blue", 508765);

		s.getcolor();
		s.getborderwidth();

		System.out.println(s.getcolor());
		System.out.println(s.getborderwidth());

	}
}