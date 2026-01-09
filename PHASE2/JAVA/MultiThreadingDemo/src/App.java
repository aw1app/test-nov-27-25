
public class App {

	public static void main(String[] args) {
		
		Thread producer1 = new ProducerThread();
		producer1.setName("producer1");
		producer1.setPriority(1);
		
		
		Thread producer2 = new ProducerThread();
		producer2.setName("producer2");
		producer2.setPriority(2);
		
		producer1.start();
		producer2.start();
		
		
		ConsumerThread consumer1Runnable = new ConsumerThread();
		Thread consumer1 = new Thread(consumer1Runnable);
		consumer1.setName("consumer1");
		consumer1.setPriority(6);
		
		ConsumerThread consumer2Runnable = new ConsumerThread();
		Thread consumer2 = new Thread(consumer2Runnable);
		consumer2.setName("consumer2");
		consumer2.setPriority(10);
		
		consumer1.start();
		consumer2.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("IN MAIN Thread :"+ i);
		}
		
		//TASK-3: Create a thread called ConsumerThread and when started,
		// it should print numbers 1 to 10.

	}

}
