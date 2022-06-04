package basic;

public class Exchange {
	
	public static void main(String[] args) {
		
		int[] a = {7,5,3,6,8,9};int b=0; {
		for (int i=0;i<5;i++){
			if(a[i]>a[i+1]){
				 b=a[i+1];
				a[i+1]=a[i];
				a[i]=b;}
				System.out.print(a[i]+","+a[i+1]);
		}
			}
		}
	}
	
