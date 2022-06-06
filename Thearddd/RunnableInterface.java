package Theard;

public class RunnableInterface  implements Runnable {

	@Override
	public void run() {
	System.out.println("hello from thread !");
		
	}
	public static void main(String[] args) {
		RunnableInterface r= new RunnableInterface();
		Thread t = new Thread(r);
		t.start();
		
				
	}

}