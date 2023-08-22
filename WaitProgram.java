package threads;

public class WaitProgram  {
	public static void main(String[] args) throws InterruptedException {
		WaitProgram wp=new WaitProgram();

		Thread waitingThread = new Thread(() -> {
			synchronized (wp) {
				try {
					System.out.println("Waiting thread: Before wait");
					wp.wait(); // Wait until notified
					System.out.println("Waiting thread: After wait");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread notifyingThread = new Thread(() -> {
			try {
				Thread.sleep(2000); // Sleep for 2 seconds
				synchronized (wp) {
					System.out.println("Notifying thread: Before notify");
					wp.notify(); // Notify waiting thread
					System.out.println("Notifying thread: After notify");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		waitingThread.start();
		notifyingThread.start();
	
	}

}
