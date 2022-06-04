package Serialization;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Write_Primitive_File_In_Serialization {

	public static void main(String[] args) throws Exception {

		long dataPosition = 0;
		RandomAccessFile in = new RandomAccessFile("C:\\Users\\Rays-2\\Downloads\\s.dat", "rw");

		in.writeLong(0);
		in.writeChars("shubham");
		dataPosition = in.getFilePointer();
		in.writeInt(123);
		in.writeBytes("kumawat");
		in.seek(0);
		in.writeLong(dataPosition);
		in.close();
	}
}