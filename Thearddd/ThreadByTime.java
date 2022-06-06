package Theard;

public class ThreadByTime extends Thread {

	private String name = null;

	public ThreadByTime(String threadName) {
		this.name = threadName;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + name);
			try {
				Thread.sleep(1000);
				System.out.println("Sleep for 1 sec");
			} catch (Exception x) {
				x.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		ThreadByTime t1 = new ThreadByTime ("Le");
		ThreadByTime t2 = new ThreadByTime("va");
		
		t1.start();
		t2.start();
	}
}