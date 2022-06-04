package Exercise4_14;

public class E4_14_18 {

	public static void main(String[] args) {

		int a[] = { 100, 98, 88, 75, 64, 53, 41, 34, 25, 16 };
		int b = 234;
		add(b, a);

	}

	public static void add(int b, int a[]) {
		int p = 0, s = 0;
		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				s = i;
				p++;

			}
		}
		if (p > 0) {
			System.out.println("value exist = " + s);
		} else {
			System.out.println(-1);
		}
	}

}