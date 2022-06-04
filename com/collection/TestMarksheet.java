package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {

	public static void main(String[] args) {
		ArrayList marksheets = new ArrayList();

		marksheets.add(new Marksheet("A4", "yuvraj", "yadav", 81));
		marksheets.add(new Marksheet("A3", "yuvraj", "verma", 79));
		marksheets.add(new Marksheet("A2", "yuvraj", "singh", 68));
		marksheets.add(new Marksheet("A1", "yuvraj", "bindra", 59));


		Collections.sort(marksheets, new OrderbyCondi());
		for (Object o : marksheets) {
			System.out.println(o);
	
		}
	}
}
