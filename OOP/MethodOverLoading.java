package OOP;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading m = new MethodOverLoading();

		System.out.println(m.add(12, 12));
	}

	public int add(int a, int b) {

		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(int a, float b) {
		float f = a + b;
		return (int) f;
	}
}