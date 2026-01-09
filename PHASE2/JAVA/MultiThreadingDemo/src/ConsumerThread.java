
public class ConsumerThread implements Runnable {

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("INSIDE ConsumerThread " + 
		Thread.currentThread().getName() + " : " + i);
		}

	}

}
