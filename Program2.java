package threads;

public class Program2 implements Runnable {

	public void run() {

		System.out.println("Thread is Running....");

	}

	public static void main(String[] args) {

		Program2 p2 = new Program2();

		Thread t = new Thread(p2);

		t.start();

	}

}
