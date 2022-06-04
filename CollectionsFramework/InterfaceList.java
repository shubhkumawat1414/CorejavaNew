package CollectionsFramework;

import java.util.List;
import java.util.ArrayList;

public class InterfaceList {

	public static void main(String[] args) {

		List a = new ArrayList();

		a.add("one");
		a.add(10);
		a.add(20.4);
		a.add("ram");
		a.add(23);
		a.add(10);
		
		a.add(1, 100);
		// a.get(2);
		// a.remove(0);
		// a.set(1, 9898);
		// a.indexOf(1);
		// a.subList(2, 5);
		
		System.out.println(a);
	}

}
