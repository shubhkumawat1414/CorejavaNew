package Exercise_11;

import java.util.Stack;

public class Exercise_11_8 {

	public static void main(String[] args) {
		
	Stack s1 = new Stack();	
	Stack s2 = new Stack();
	
	for(char c='A'; c<='Z'; c++){
		
		s1.push(c);
	}
	System.out.println(s1);
	
	for(char c='a'; c<='z'; c++){
		
		s2.push(s1.pop());
	}
	System.out.println(s2);
	
	for(int i=1; i<=26;i++){
		
		System.out.print(s2.pop()+",");
		}
	}
}