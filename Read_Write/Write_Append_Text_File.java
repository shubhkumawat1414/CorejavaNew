package Read_Write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write_Append_Text_File {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("C:\\Users\\Rays-2\\Downloads\\sk.txt", true);
		PrintWriter pw = new PrintWriter(writer);

		for (int i = 0; i < 5; i++) {
			pw.println(i + " : Shubham");
		}
		pw.close();
		writer.close();

		System.out.println("File is successfully written, P1 check C:\\Users\\Rays-2\\Downloads\\sk.txt");

	}
}