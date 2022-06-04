package Read_Write;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Copycon_Command {

	public static void main(String[] args) throws Exception {
	
	String target = "C:\\Users\\Rays-2\\shubh.txt";
	FileWriter writer = new FileWriter(target);
	PrintWriter printWriter = new PrintWriter(writer);
	
	InputStreamReader isReader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isReader);
	
	String line = in.readLine();
	
	while(!line.equals("quit")){
		
		printWriter.print(line);
		line = in.readLine();
	}
	printWriter.close();
	isReader.close();
	}
}