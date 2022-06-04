package basic;

public class polindromenumber {
	public static void main(String[] args) {
		int n=424;
		int s=0;
		int r;
		int temp;
		temp=n;
		
		while(n>0){
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(temp==s){
			System.out.println(s+" it is palindrome number");
		}else{
			System.out.println(s+" it is not a palindrome number");
		}
				
	}

	}
