package OOP;

public class Person1 {

	private String firstname = null;
	private String lastname = null;
	private String address = null;

	public Person1() {

		System.out.println("Person1 Default Constructor");
	}

	public Person1(String fn, String ln) {
		this();
		firstname = fn;
		lastname = ln;

		System.out.println("2 parameter Constructor");
	}

	public Person1(String fn, String ln, String address) {
		this(fn, ln);
		this.address = address;

		System.out.println("3 parameter Constructor");
	}
	public static void main(String[] args) {

		Person1 p = new Person1("ram", "chandra", "mohan");
	}
	}