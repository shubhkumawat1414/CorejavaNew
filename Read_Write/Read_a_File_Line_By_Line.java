package Read_Write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read_a_File_Line_By_Line {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C:\\Users\\Rays-2\\Downloads\\sk.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while(line!= null){
			
			System.out.println(line);
			
			line = br.readLine();
		}
		reader.close();
	}	
}