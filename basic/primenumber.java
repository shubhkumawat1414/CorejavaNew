package basic;

public class primenumber {
	
	public static void main(String[] args) {
		
	int n=119;
	int p=0;
	
	for(int i=2; i<=n-1; i++){
		if(n%i==0)
			p=p+1; 
	}
	if(p==0){
		System.out.println(n+" is a prime number");
	} else {
		System.out.println(n+" is not a prime number");
	}
}
  }