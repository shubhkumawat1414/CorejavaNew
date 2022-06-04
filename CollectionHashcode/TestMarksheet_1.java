package CollectionHashcode;

import java.util.*;

public class TestMarksheet_1 {

	public static void main(String[] args) {

		List l = new ArrayList();
		Marksheet_1 m1 = new Marksheet_1("203544555", "Shubham", 98, 96, 99);
		Marksheet_1 m2 = new Marksheet_1("203544483", "Rohit", 85, 80, 85);

		l.add(m1);
		l.add(m2);

		System.out.println(l.contains(m1));

		Iterator it = l.iterator();
		while (it.hasNext()) {
			Marksheet_1 m = null;
			m = (Marksheet_1) it.next();
		
			System.out.print(m.getName() + " , ");
			System.out.print(m.getRollNo() + " , ");
			System.out.print(m.getPhysics() + " , ");
			System.out.print(m.getChemistry() + " , ");
			System.out.println(m.getMaths());
		}
	}
}