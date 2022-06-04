package basic;

public class Table {

	public static void main(String[] args) {

		int a = 1;
		for (int i = 1; i <= 10; i++) {
		
			for (int j = 2; j <= 9; j++) {
				a = i * j;
				System.out.print(a + "\t");
			}
			System.out.println();
		}

	}

}
