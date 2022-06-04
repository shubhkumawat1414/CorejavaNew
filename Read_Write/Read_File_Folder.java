package Read_Write;

import java.io.File;

public class Read_File_Folder {

	public static void main(String[] args) {

		File directory = new File("C:\\Users\\Rays-2\\Downloads");

		String[] list = directory.list();

		for (int i = 0; i < list.length; i++) {

			System.out.println((i + 1) + " : " + list[i]);
		}
	}
}