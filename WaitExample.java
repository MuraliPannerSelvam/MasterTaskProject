package threads;

public class WaitExample extends Thread {
	public static void main(String[] args) throws Exception {
		 WaitExample w = new  WaitExample();
		w.start();
		synchronized (w) {
			System.out.println("Starts");
			w.wait();
			System.out.println("Next Start");
		}
	}

	public void run() {
		synchronized (this) {
			this.notify();
			System.out.println("Ends");
		}
	}
}
