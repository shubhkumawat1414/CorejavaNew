package Java_8;

import java.util.ArrayList;
import java.util.List;

public interface For_Each {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();

		l.add("shubham");
		l.add("kumawat");

		l.forEach(a -> System.out.println(a));

	}
}