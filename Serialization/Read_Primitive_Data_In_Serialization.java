package Serialization;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Read_Primitive_Data_In_Serialization {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Rays-2\\Downloads\\s.dat");
		DataInputStream in = new DataInputStream(file);
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		
		in.close();
	}
}