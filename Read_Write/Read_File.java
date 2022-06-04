package Read_Write;

import java.io.File;

public class Read_File {

	public static void main(String[] args) {

		File directory = new File("C:\\Users\\Rays-2\\Downloads");
		String[] list = directory.list();

		for (int i = 0; i < list.length; i++) {

			File f = new File("C:\\Users\\Rays-2\\Downloads", list[i]);

			if (f.isFile()) {

				System.out.println((i + 1) + " : " + list[i]);
			}
		}

		/*
		 * File directory = new File("C:\\Users\\Rays-2\\Downloads"); File []
		 * list = directory.listFiles();
		 * 
		 * for(int i = 0; i<list.length; i++){
		 * 
		 * if(list[i].isFile()){
		 * 
		 * System.out.println((i+1) + " : " + list[i].getName()); } }
		 */

	}
}