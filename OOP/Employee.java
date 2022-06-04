package OOP;

public class Employee extends Person1 {

	private String designation;

	public Employee() {

		System.out.println("default Constructor");
	}

	public Employee(String fn, String ln, String des) {
		super(fn, ln);
		this.designation = des;

		System.out.println("3 parameterise Constructor");
	}

	public static void main(String[] args) {

		Person1 p = new Person1("ram", "chandra", "indore");
	}
}