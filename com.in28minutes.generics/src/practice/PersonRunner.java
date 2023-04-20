package practice;

import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
	public static void main(String[] args) {
		Worker worker = new Worker();
//		List<Number> number1 = List.of(3.2,1 );
//		List<Number> number2 = List.of(3.2);
//		worker.addList(number1);
//		worker.addList(number2);
//		System.out.println(worker);
		System.out.println("두번쨰방법\n");
		List number3 = new ArrayList<>();

		addVlaue(number3);
		System.out.println(number3);

}

static void addVlaue(List<? super Number> numbers) {
	numbers.add(1);
	numbers.add(1);
	numbers.add(1);
}
}

class Person {
	public static void work() {
		System.out.println("Person Work");
	}
}

class Worker extends Person {
	static double sum = 0.0;
	static double addList(List<? extends Number> numbers) {
		for (Number number : numbers) {
			sum = sum + number.doubleValue();
		}
		return sum;
	}


	@Override
	public String toString() {

		return "" + sum;
	}
	}
class EmartWorker extends Worker{
		
	}

