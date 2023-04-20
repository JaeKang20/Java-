package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;


public class GenericsRunner {

	static <X> X doSomething(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		// List를 연장하기 때문에 이 메소드에서 X는 Array, LinkedList,Vector 사용 가능
		list.addAll(list);

	}

	// step 05
	static double sumOfNumberList(List<? extends Number> numbers) { // Upper
		// 요소 number List는 Number를 연장한 타입만 들어올 수 있다.
		double sum = 0.0;

		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addCoupleOfVales(List<? super Number> numbers) { // Lower

		numbers.add(10);
		numbers.add(1.0);
		numbers.add(1l);
	}

	public static void main(String[] args) {
		/* Generic with methods */
		Double d = doSomething(3.2);
		Integer value = doSomething(Integer.valueOf(3));
		System.out.println(d + value);

		ArrayList<String> list = doSomething(new ArrayList<String>(List.of("A", "B", "C")));
		duplicate(list);
		System.out.println(list);
		/* MyCustom extends Numbers */
		MyCustomList<Integer> list2 = new MyCustomList<>();
		// step 4
		List emptyList = new ArrayList<Number>();

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));

		addCoupleOfVales(emptyList);
		System.out.println(emptyList);

	}

}