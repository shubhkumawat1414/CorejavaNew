package Java_8;

@FunctionalInterface
public interface DefaultMethod {

	public static void add() {
		System.out.println("this is static method");
	}

	public default void Defmethod() {
		System.out.println("this is default method");
	}
	public void print();
	
	
}