package Java_8;

public interface Test_Lamda_Exception {

	public static void main(String[] args) {

		Lamda_Exception add = (a, b) -> {
			return a + b;
		};
		Lamda_Exception multiply = (a, b) -> {
			return a * b;
		};
		Lamda_Exception sub = (a, b) -> {
			return a - b;
		};
		Lamda_Exception divide = (a, b) -> {
			return a / b;
		};

		int a = 10;
		int b = 2;

		System.out.println(add.maths(a, b));
		System.out.println(multiply.maths(a, b));
		System.out.println(sub.maths(a, b));
		System.out.println(divide.maths(a, b));
}
}
