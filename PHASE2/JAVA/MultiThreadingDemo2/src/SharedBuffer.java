import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {

	private final Queue<Integer> queue = new LinkedList<>();
	private final int CAPACITY = 5;

	synchronized void produce(int value) throws InterruptedException {
		if (queue.size() < 5) {
			queue.add(value);
			System.out.println("Produced: " + value);
			notifyAll();
		}else {
			wait();
		}
	}

	synchronized void consume() throws InterruptedException {
		if (!queue.isEmpty()) {
			int value = queue.poll();
			System.out.println("Consumed: " + value);
			notifyAll();
		}else {
			wait();
		}
	}

}
