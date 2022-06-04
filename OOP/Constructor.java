package OOP;

public class Constructor {

	private String color = null;
	private int borderwidth = 0;

	public Constructor() {
		System.out.println("this is a default Constructor");
	}

	public Constructor(String c, int w) {
		this.color = c;
		this.borderwidth = w;
	}

	public String getcolor() {
		return color;

	}

	public int getborderwidth() {
		return borderwidth;
	}
}