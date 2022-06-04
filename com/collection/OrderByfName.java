package com.collection;

import java.util.Comparator;

public class OrderByfName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		return m1.fname.compareTo(m2.fname) ;
	}

	
}
