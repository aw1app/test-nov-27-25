import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		SquareCalculator task1 = new SquareCalculator(10);
		SquareCalculator task2 = new SquareCalculator(20);
		
		Future<Integer> resultOfTask1 = executor.submit(task1);
		Future<Integer> resultOfTask2 = executor.submit(task2);
		
		int result1 = resultOfTask1.get();
		int result2 = resultOfTask2.get();
		
		System.out.println("result1 =" + result1);
		System.out.println("result2 =" + result2);
	}

}

class SquareCalculator implements Callable<Integer>{
	private final int number;	

	public SquareCalculator(int number) {
		super();
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		return number * number;
	}
	
	
}
