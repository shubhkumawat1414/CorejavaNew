package OOP;

public class Account {

	private static final String Balance = null;
	private String number;
	private String accountType;
	private double balance;
	private String Name;
	private String Adress;
	private String Dob;

	public String getNumber() {
		return number;
	}

	public void setNumber(String n) {
		number = n;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String at) {
		accountType = at;
	}

	public void deposit(double d) {
		balance = getBalance() + d;
	}

	public void withdrawal(double d) {
		balance = getBalance() - d;
	}

	public double getBalance() {
		return balance;
	}

	public void fundTransfer(double d) {
		balance = getBalance() - d;
	}

	public void payBill(double d) {
		balance = getBalance() - d;
	}

	public String setBalance(double d) {
		return Balance;

	}

	public void setName(String string) {
	Name = string;
	}

	public void setAdress(String string) {
		Adress = string;
	}

	public void setDob(String string) {
		Dob = string;
	}

	public String getName() {
		return Name;
		
	}

	public String getAdress() {
		return Adress;

	}

	public String getDob() {
		return Dob;

	}
}