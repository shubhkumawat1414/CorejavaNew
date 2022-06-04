package CollectionsFramework;

import java.util.*;

public class Implements_List {

	public static void main(String[] args) {

		Collection c = new Vector();
		Collection c1 = new Vector();
		

		c.add("shubham");
		c.add(234);
		c.add('v');
		c.add(10.3);
		c.add(10);
		c.add("kumawat");

		c1.add("shubham");
		c1.add(15);
		c1.add(201);

		// c.clear();

		// System.out.println(c.addAll(c1));
		// System.out.println(c.contains(10));
		// System.out.println(c.containsAll(c));
		// System.out.println(c2.isEmpty());
		System.out.println(c);
		System.out.println(c1);
	}
}