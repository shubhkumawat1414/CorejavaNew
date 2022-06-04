package Read_Write;

//import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read_Char_From_a_File {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("C:\\Users\\Rays-2\\Downloads\\sk.txt");

		int ch = reader.read();
		char chr;

		while (ch != -1) {
			chr = (char) ch;

			System.out.print(chr);
			ch = reader.read();
		}
	}
}