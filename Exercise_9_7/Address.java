package Exercise_9_7;

public class Address implements Cloneable {
	public String locadd = null;
	public String paradd = null;

	public Address() {
	}

	public Address(String s, String t) {
		this.locadd = s;
		this.paradd = t;
	}

	public String getLocadd() {
		return locadd;
	}

	public void setLocadd(String locadd) {
		this.locadd = locadd;
	}

	public String getParadd() {
		return paradd;
	}

	public void setParadd(String paradd) {
		this.paradd = paradd;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
