package Theard;

public class RaceConditioinInThreadAccount extends Thread {
	public static Account Data = new Account();

	public RaceConditioinInThreadAccount(String name) {
		super(name);

	}
  public void run() {
	  for (int i = 0; i < 5; i++) {
		Data.deposit(getName(),1000);
	}
  }
  public static void main(String[] args) {
	  RaceConditioinInThreadAccount t1 =  new RaceConditioinInThreadAccount("Rays");
	  RaceConditioinInThreadAccount t2 =  new RaceConditioinInThreadAccount("tech");
	  t1.start();
	  t2.start();
  }
}