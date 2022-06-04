package basic;

public class Pyramid {

	public static void main(String[] args) {
		int k = 0;
		for (int i = 1; i <= 20; ++i, k=0) {

			for (int j = 1; j <= 20 - i; ++j) {
				System.out.print(" ");
			}
			while (k != 2 * i - 1) {

				System.out.print("*");
				++k;
			}
			System.out.println();
		}
	}
}