package Theard;

public class PriorityThread_1 extends Thread {

	public PriorityThread_1(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(getName() + "  p = " + getPriority());

		}

	}

	public static void main(String[] args) {
		PriorityThread_1 t1 = new PriorityThread_1("Rays");
		PriorityThread_1 t2 = new PriorityThread_1("Tech");
		PriorityThread_1 t3 = new PriorityThread_1("Technplogy");
		PriorityThread_1 t4 = new PriorityThread_1("Indore");

		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(4);
		t4.setPriority(8);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}