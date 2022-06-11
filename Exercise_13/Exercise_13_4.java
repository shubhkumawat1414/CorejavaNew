package Exercise_13;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exercise_13_4 {

	public static void main(String[] args) throws Exception {

		// Read data from keyboard and write into a file

		String target = "C:\\Users\\ASUS\\Documents\\lucky.txt";

		FileWriter writer = new FileWriter(target);
		PrintWriter p = new PrintWriter(writer);

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);

		String line = in.readLine();

		while (!line.equals("Quit")) {
			p.print(line);
			line = in.readLine();

		}
		p.close();
		reader.close();

	}
}
