
public class App {

	public static void main(String[] args) {
		
		Thread producer1 = new ProducerThread();
		producer1.setName("producer1");
		
		
		Thread producer2 = new ProducerThread();
		producer1.setName("producer2");
		
		producer1.start();
		producer2.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("IN MAIN Thread :"+ i);
		}

	}

}
