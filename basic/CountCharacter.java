package basic;

public class CountCharacter {
	
	public static void main(String[] args) {
	
		String a = "shubham kumawat";
		int t = 0;
		
		for (char c  = 'a' ; c <='z'; c++, t=0) {
			
        for (int i = 0; i < a.length(); i++) {
        	
			a.charAt(i);
			a.equals(a);
			++t;
			}	
		System.out.println(c+"="+t);
        	
		}
	}
}
