package basic;

public class Calculatemethod {
	
	public static void main(String[] args) {
    		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
	    Add(a,b);
        sub(a,b);
		multiply(a,b);
		divide(a,b);
	}
		public static void Add(int a, int b){
			int c= a+b;
			System.out.println(c);
		}
		public static void sub(int a, int b){
	int c= a-b;
	System.out.println(c);
	}
		public static void multiply(int a, int b){
		int c = a*b;
		System.out.println(c);
	}
		public static void divide(int a, int b){
		int c = a/b;
		System.out.println(c);
		}
		
}
