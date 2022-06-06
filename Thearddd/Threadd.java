package Theard;

public class Threadd extends Thread {
	private String name = null;
	public Threadd (String threadName) {
		this.name = threadName;
		}
	public void run () {
		for (int i = 0; i < 50; i++) {
			System.out.println(i  + name);
			}
	}
	public static void main(String[] args) {
		Threadd t1 = new Threadd("Le");
		Threadd t2 = new Threadd("va");
		t1.start();
		t2.start();
	}

}