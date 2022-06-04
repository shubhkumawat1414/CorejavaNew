package Dqueue;

import java.util.ArrayDeque;

public class LinkedLIsttDequeeee {
	public static void main(String[] args) {
		ArrayDeque d = new ArrayDeque();

		d.add(12);
		d.add(1);
		d.add(2);
		d.add(13);
		d.add(15);
		d.add(17);
		d.add(19);
		d.add(11);
		d.add(10);

		// d.pollFirst();
		// System.out.println(d.pollLast());
		// System.out.println(d.pollFirst());
		// System.out.println(d.peekFirst());
		System.out.println(d.peekLast());

	}

}
