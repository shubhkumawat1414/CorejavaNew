package OOP;

import java.text.ParseException;

public class Testperson {
	
	public static void main(String[] args) throws ParseException {
		
		person p = new person();
		
		p.setName("shubham kumawat");
		p.setDate("17/10/2002");
		p.setAddress("mushakhedi indore");
		
		p.getName();
		p.getDate();
		p.getAddress();
		
		System.out.println("Name= "+p.getName());
		System.out.println("DOB= "+p.getDate());
		System.out.println("Address= "+p.getAddress());
	
		
		
		
Account A = new Account();
		
		A.setNumber("997730241");
		A.setAccountType("current");
		A.setBalance(8000.75);
		A.deposit(700.56);
		A.withdrawal(2000);
		A.fundTransfer(5000);
		A.payBill(59);
		
		
		
		A.getNumber();
		A.getAccountType();
		A.getBalance();
		
		System.out.println("Account Number= "+A.getNumber());
		System.out.println("Account Type= "+A.getAccountType());
		System.out.println("Balance= "+A.getBalance());

		
		
		
		
Automobile M = new Automobile();
		
		M.setColor("white");
		M.setSpeed(60);
		M.setMake("AUDI");
		
		M.getColor();
		M.getSpeed();
		M.getMake();
		M.ChangerGear(2);
		M.breck(60);
		M.Accelerator(30);
		
		System.out.println("Car Color= "+M.getColor());
		System.out.println("Car Speed= "+M.getSpeed());
		System.out.println("Make Name= "+M.getMake());
  }
}