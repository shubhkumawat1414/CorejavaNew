package Serialization;

import java.io.Serializable;

import OOP.AddressChange;

public class Employee implements Serializable {

	private int id;
	private String firstName;
	private String lastName;
	private transient String tempValue;

	public Employee() {
	}

	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTempValue() {
		return tempValue;
	}

}