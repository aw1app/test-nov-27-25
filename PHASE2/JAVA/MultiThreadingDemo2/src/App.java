
public class App {

	public static void main(String[] args) {
		
		SharedBuffer sharedBuffer = new SharedBuffer();
		
		Producer producer1Runnable  = new Producer(sharedBuffer);
		Thread producer1Thread = new Thread(producer1Runnable);
		
		Consumer consumer1Runnable  = new Consumer(sharedBuffer);
		Thread consumer1Thread = new Thread(consumer1Runnable);
		
		producer1Thread.start();
		consumer1Thread.start();
	}

}
