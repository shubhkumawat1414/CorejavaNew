package Read_Write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Copy_Text_File {

	public static void main(String[] args) throws Exception {

		String source = "C:\\Users\\Rays-2\\Downloads\\sk.txt";
		String target = "C:\\Users\\Rays-2\\Downloads\\shap3.txt";

		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(target);

		int ch = reader.read();

		while (ch != -1) {
			writer.write(ch);
			ch = reader.read();
		}
		writer.close();
		reader.close();

		System.out.println(source + "is copied to" + target);
	}
}