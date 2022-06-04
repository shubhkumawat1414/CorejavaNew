package basic;

import java.util.*;

import java.text.SimpleDateFormat;

public class DateTime {

	public static void main(String[] args) {

		Date d = new Date();

		SimpleDateFormat format = new

		SimpleDateFormat("dd/MM/YYYY ");

		String str = format.format(d);

		System.out.println("Date : "+ str);

	}
}