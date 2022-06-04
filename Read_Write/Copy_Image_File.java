package Read_Write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Copy_Image_File {

	public static void main(String[] args) throws Exception {

		String source = "C:\\Users\\Rays-2\\Downloads\\cat.JPG";
		String target = "C:\\Users\\Rays-2\\Desktop\\rose.JPG";
		
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);
	
		int ch = reader.read();
		
		while(ch!= -1){
			writer.write(ch);
			ch = reader.read();
		}
		writer.close();
		reader.read();
		
		System.out.println(source + "is copied to" + target);
	}
}