
public class Consumer implements Runnable {
	SharedBuffer buffer;

	public Consumer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			this.buffer.consume();

			try {
				Thread.sleep(10); // sleep for 10 ms
			} catch (InterruptedException e) {
			}
			
		}
	}

}
