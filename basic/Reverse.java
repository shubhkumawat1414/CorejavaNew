package basic;

public class Reverse {
	public static void main(String[] args) {

		int n = 677889;
		int s = 0;
		int r;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = (s * 10) + r;
		}
		System.out.print(s);
	}
}