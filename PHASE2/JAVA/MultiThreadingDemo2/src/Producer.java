
public class Producer implements Runnable {
	SharedBuffer buffer;

	public Producer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run(){
		int val = 0;
		while (true) {
			this.buffer.produce(val++);
			
			try{Thread.sleep(10);}catch(InterruptedException e) {};
		}
	}

}
