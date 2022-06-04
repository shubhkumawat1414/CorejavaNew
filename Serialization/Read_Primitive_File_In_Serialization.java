package Serialization;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Read_Primitive_File_In_Serialization {

	public static void main(String[] args) throws Exception {

		long dataPosition = 0;
		int data = 0;

		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Rays-2\\Downloads\\s.dat", "r");
		dataPosition = raf.readLong();

		System.out.println("dataPosition : " + dataPosition);

		raf.seek(dataPosition);
		data = raf.readInt();
		raf.close();

		System.out.println("The data is : " + data);
	}
}