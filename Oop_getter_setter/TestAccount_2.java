package Oop_getter_setter;

public class TestAccount_2 extends Account_2 {
	
	public static void main(String[] args) {
		
		Account_2 A = new Account_2();
		
		A.setNumber("997730241");
		A.setAccountType("current");
		A.setBalance(8999.75);
		
		A.getNumber();
		A.getAccountType();
		A.getBalance();
		
		System.out.println(A.getNumber());
		System.out.println(A.getAccountType());
		System.out.println(A.getBalance());
	}
}