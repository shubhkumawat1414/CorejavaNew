package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class InterfaceWithCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();

		c.add(15);
		c.add(1.12);
		c.add(100);
		c.add("shubham");
		c.add('s');
		c.add(30);
		c.add("kumawat");

		c1.add(13);
		c1.add(1.12);
		c1.add(100);
		c1.add("shubham");
		c1.add('s');
		c1.add(31);
		c1.add("kumawat");

		c2.add(13);
		c2.add(1.12);
		c2.add(1200);
		c2.add("shubham");
		c2.add('s');
		c2.add(33);
		c2.add("kumawat");

		// c.addAll(c);
		// c.clear();
		Iterator it = c.iterator();

		while (it.hasNext()) {
			Object o = it.next();

			System.out.println(o);
			// System.out.println(c.contains(15));
			// System.out.println(c.containsAll(c1));
			// System.out.println(c2.isEmpty());
			// System.out.println(c);
			// System.out.println(c.remove(30));
			// System.out.println(c.removeAll(c));
			// System.out.println(c.retainAll(c1));
			// System.out.println(c.size());
			// System.out.println(c);
			// System.out.println(c1);
			// System.out.println(c2);
		}
	}
}