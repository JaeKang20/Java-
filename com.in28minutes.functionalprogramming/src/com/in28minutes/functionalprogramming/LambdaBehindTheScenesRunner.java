package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//make overRide
class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {

		return (number % 2 == 0);
	}
}

class PrintConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer element) {
		System.out.println(element);

	}

}

class MinusThree implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t = t - 3;
	}
}


public class LambdaBehindTheScenesRunner {

	// return for functions
	public static Predicate<? super Integer> creatreOddPredicate() {
		return num -> num % 2 == 1;
	}

	public static Predicate<? super Integer> createEvenPredicate() {
		return num -> num % 2 == 0;
	}

	public static void main(String[] args) {
		// variable for functions
		Predicate<? super Integer> evnePredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = creatreOddPredicate();

		Function<? super Integer, ? extends Integer> minusMapper = e1 -> e1 - 3;

		List.of(23, 43, 34, 36, 48, 45).stream().filter(createEvenPredicate()).map(minusMapper)
				.forEach(e -> System.out.println(e)); // methods for functions
		List.of(23, 43, 34, 36, 48, 45).stream().filter(new EvenNumberPredicate()).map(new MinusThree())
				.forEach(new PrintConsumer());

	}

}
