package Exercise_11;

import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

public class Exercise_11_5 {
	
	public static void main(String[] args) {
		
	ArrayList a = new ArrayList();
	ArrayList a1 = new ArrayList();
	HashSet s = new HashSet();
	
	for(int i=0; i<100000; i++){
		a.add(i);
	}
	s.add(a);
	long l=0;
	
	for(int i=0; i<50; i++){
		int j=(int) (Math.random()*100); //it will genrate 50 random numbers ehich are less than 100.
		a1.add(j);
	}
	System.out.println("Rendom no:\n"+a1);
	
	for(int i=0; i<50; i++){
		a.containsAll(a1);
		
		l+=System.currentTimeMillis();
	}
		System.out.println("Takeing Time by ArrayList for seach 50 redom no\n"+l);
		
		for(int i=0; i<50; i++){
			int j = (int)(Math.random()*100);
			s.containsAll(a1);
			
			l+=System.currentTimeMillis();
		}
		System.out.println("Takieng Time by Hash set for seach 50 remdom no\n"+l);
	}
}