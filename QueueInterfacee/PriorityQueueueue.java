package QueueInterfacee;

import java.util.PriorityQueue;

public class PriorityQueueueue {
	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		
		q.add(0);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.offer(2);
		
		
		q.poll();
		q.poll();
		System.out.println(q.element());
		System.out.println(q.peek());
			
		System.out.println(q);
		
		
		System.out.println(q); 
		
		
		
		
		
		
		
	}  
	

}
