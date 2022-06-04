package Dqueue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDqueue {
	public static void main(String[] args) {
		
		Deque l = new LinkedList();
		

		l.offer(2);
		l.offer(3);
		l.offer(4);
		l.offer(5);
		l.offer(7);
		l.offer(6);
		l.offer(8);
		
		
		//d.pollFirst();
		//System.out.println(d.pollLast());
		//System.out.println(d.pollFirst()); 
	//System.out.println(d.peekFirst());
		System.out.println(l.peekLast());
		
		
		
	}

}
