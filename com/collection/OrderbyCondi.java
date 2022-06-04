package com.collection;

import java.util.Comparator;

public class OrderbyCondi implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		if(m1.fname.equals(m2.fname)) {
		return m1.lastname.compareTo(m2.lastname) ;
	}
		else {
		return	m1.fname.compareTo(m2.fname);
		}

}
}
