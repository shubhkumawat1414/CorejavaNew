package CopyAnArray;

public class copy_an_array {
	public static void main(String[] args) {
		char[] c_1 = { 's', 'h', 'u', 'b', 'h', 'a', 'm', 'k', 'u', 'm', 'a', 'w', 'a', 't' };
		char[] c_2 = new char[15];
		System.arraycopy(c_1, 2, c_2, 0, 12);
		System.out.println(c_2);
	}

}
