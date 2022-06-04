package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectInSerialization {

	public static void main(String[] args) throws Exception {

		FileOutputStream file =new FileOutputStream("C:\\Users\\Rays-2\\Downloads\\s.ser");
		ObjectOutputStream out =new ObjectOutputStream(file);

		Employee emp = new Employee(10, "shubham", "kumawat");

		out.writeObject(emp);
		out.close();

		System.out.println("Object is successfully persisted");
	}
}