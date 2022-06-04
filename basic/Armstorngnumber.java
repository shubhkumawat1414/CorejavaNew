 package basic;

public class Armstorngnumber {
	
	public static void main(String[] args) {
		
		int n=153;
		int r;
		int s=0;
		int temp;
		         temp=n;
		         while(n>0){
		        	 r=n%10;
		        	 s=(r*r*r)+s;
		        	 n=n/10;
		         }
		if(temp==s)
		{
			System.out.println("is a armstrong number= "+s);
		} else {
			System.out.println("is not a armstrong number");
		}
	}
}