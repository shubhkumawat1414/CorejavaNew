package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectInSerialization {

	public static void main(String[] args) throws Exception {
	
	FileInputStream file = new FileInputStream("C:\\Users\\Rays-2\\Downloads\\s.ser");	
	ObjectInputStream in = new ObjectInputStream(file);
	
	Employee emp = (Employee)in.readObject();
	
	System.out.println("ID : " + emp.getId());
	System.out.println("F Name : " + emp.getFirstName());
	System.out.println("L Name : " + emp.getLastName());
	System.out.println("Temp Value : " +emp.getTempValue());
	}
}