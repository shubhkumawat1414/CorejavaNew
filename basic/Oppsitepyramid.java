package basic;

public class Oppsitepyramid {
	
public static void main(String[] args) {
	
	int k = 0;
	for (int i = 6; i >= 1 ; --i, k=0) {

		for (int j = 6; j >= 1 + i; --j) {
			System.out.print(" ");
		}
		while (k != 2*i-1) {

			System.out.print("*");
			++k;
		}
		System.out.println();

  }
}
}