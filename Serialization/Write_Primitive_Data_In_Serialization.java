package Serialization;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Write_Primitive_Data_In_Serialization {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("C:\\Users\\Rays-2\\Downloads\\s.dat");
		DataOutputStream out = new DataOutputStream(file);

		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(1.2);

		out.close();
		file.close();

		System.out.println("Primitive Data successfully written");
	}
}