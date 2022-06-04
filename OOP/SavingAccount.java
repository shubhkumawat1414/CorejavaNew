package OOP;

public class SavingAccount extends OverRidingAccount {

	public int getAmount() {
		int i = super.getAmount() + 60;
		return i;
	}
}