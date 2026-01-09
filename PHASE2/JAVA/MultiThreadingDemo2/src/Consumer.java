
public class Consumer implements Runnable {
	SharedBuffer buffer;

	public Consumer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			try {
				this.buffer.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			try {
				Thread.sleep(10); // sleep for 10 ms
			} catch (InterruptedException e) {
			}
			
		}
	}

}
