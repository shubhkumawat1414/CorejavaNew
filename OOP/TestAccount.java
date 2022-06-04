package OOP;

import Oop_getter_setter.Automobile;
import Oop_getter_setter.Person;

public class TestAccount {

	public static void main(String[] args) throws Exception {
		Account p = new Account();
		p.setName("shubham");
		p.setAdress("Indore");
		p.setDob("17/10/2002");

		Account a = new Account();
		a.setNumber("0123456789");
		a.setAccountType("Savings");
		a.deposit(50340.67);
		a.withdrawal(2000);
		a.fundTransfer(5000);
		a.payBill(54);

		Automobile am = new Automobile();
		am.setMake("Rolls Royals");
		am.setColor("white");
		am.changeGear(3);
		am.breck(60);
		am.accelerator(20);

		p.getName();
		p.getAdress();
		p.getDob();

		a.getNumber();
		a.getAccountType();
		a.getBalance();

		am.getColor();
		am.getMake();
		am.getSpeed();

		System.out.println("Person's Name :- " + p.getName());
		System.out.println("Adress :- " + p.getAdress());
		System.out.println("Date Of Birth :- " + p.getDob());
		System.out.println();

		System.out.println("Account Number :- " + a.getNumber());
		System.out.println("Account Type :- " + a.getAccountType());
		System.out.println("Remaining Balance :- " + a.getBalance());
		System.out.println();

		System.out.println("Vehicel Name :- " + am.getMake());
		System.out.println("Vehicel Color :- " + am.getColor());
		System.out.println("Current Speed :- " + am.getSpeed());
	}

}