package Serialization;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Read_File_By_Scanner {

	public static void main(String[] args) throws Exception {
	
	FileReader reader = new FileReader("C:\\Users\\Rays-2\\Downloads\\shubh.txt");
	Scanner sc = new Scanner(reader);
	
	while(sc.hasNext()){
		
		System.out.println(sc.nextLine());
	}
	reader.close();
	}
}