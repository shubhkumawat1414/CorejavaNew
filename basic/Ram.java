package basic;

public class Ram {

	public static void main(String[] args) {

		int a = 1;
		int fact = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				a = i * j;

				System.out.print(a + "\t");
			}

		}
	}
}
