import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {

	private final Queue<Integer> queue = new LinkedList<>();
	private final int CAPACITY = 5;

	synchronized void produce(int value) {
		if (queue.size() < 5) {
			queue.add(value);
			System.out.println("Produced: " + value);
		}
	}

	synchronized void consume() {
		if (!queue.isEmpty()) {
			int value = queue.remove();
			System.out.println("Consumed: " + value);
		}
	}

}
