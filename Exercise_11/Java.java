package Exercise_11;

import java.util.LinkedList;
import java.util.List;

public class Java {

	public static void main(String[] args) {
		
		List l = new LinkedList();
		
		l.add(12);
		l.add(10);
		l.add(11);
		
		System.out.println(l.remove(1));
		System.out.println(l);
	}
}