package Oop_getter_setter;

import javax.naming.InsufficientResourcesException;

public class Account_2 {
	private static final String Balance = null;
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber(){
		return number;
	}
	public void setNumber(String n) {
		number = n;
	}
	public String getAccountType(){
		return accountType;
	}
	public void setAccountType(String at){
		accountType = at;
	}
	public void deposit(double d){
		balance = getBalance()+d;
	}
	public void withdrawal(double wA) throws InsufficientResourcesException {
		double rB = balance - wA;
		if(rB-wA<500){
			System.out.println("insufficient Balance");
		}
		else
		{
			System.out.println("Transaction succesfully completed");
			System.out.println("Withdrawal Amount : "+wA);
			System.out.println("After transaction current balance : "+rB);
			}
		}
	public double getBalance() {
		return balance;
	}
	public void fundTransfer(double d){
		balance = getBalance()-d;
	}
	public void payBill(double d){
		balance = getBalance()-d;
	}
	public String setBalance(double d) {
	return Balance;
		
	}
	public void setName(String string) {
	
		
	}
	public void setAdress(String string) {

		
	}
	public void setDob(String string) {
		
		
	}
	
}
