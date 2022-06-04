package SetInterfacee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSet {
	public static void main(String[] args) {
		
		Set S= new HashSet();
		
		S.add(10);
		S.add(23);
		S.add(42);
		S.add("rays");
		S.add("tech");
		S.add(23);
		S.add(73);
		S.add(83);
		S.add(93);
		S.add(32);
		S.add(70);
		
		/**Iterator it = S.iterator();
		while (it.hasNext()){

			System.out.print(it.next()+",");
	}
	}**/
		System.out.println(S);
}
}