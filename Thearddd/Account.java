package Theard;

public class Account {
	private int balance = 0;

	public synchronized void deposit(String msg, int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + " New balance " + bal);

	}

	public int getBalance() {
		databaseDelay();
		return balance;
	}

	public void setBalance(int balance) {
		databaseDelay();
		this.balance = balance;
	}

	public void databaseDelay() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}

	}

}