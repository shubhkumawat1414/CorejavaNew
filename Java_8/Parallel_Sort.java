package Java_8;

import java.util.Arrays;

public class Parallel_Sort {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 0, 1, 3, 5, 8};

		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}
}