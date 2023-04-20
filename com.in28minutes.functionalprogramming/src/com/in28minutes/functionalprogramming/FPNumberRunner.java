package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 2, 5, 1, 6);
//		printBasicSumOfNumber(numbers);
//		printBasicEvenOfSum(numbers);

		printFPSumOfNumber(numbers);
//		printFPEvenOfSum(numbers);
//		printFPEOddOfSum(numbers);
	}

	/*----------Functional Programming-------------*/
	public static int printFPSumOfNumber(List<Integer> numbers) {
		return numbers.stream().reduce(0, (num1, num2) -> num1 + num2);

	}

	public static int printFPEvenOfSum(List<Integer> numbers) {
		return numbers.stream().filter(element -> element % 2 == 0).reduce(0, (num1, num2) -> num1 + num2);
	}

	public static int printFPEOddOfSum(List<Integer> numbers) {
		return numbers.stream().filter(element -> element % 2 == 1).reduce(0, (num1, num2) -> num1 + num2);
	}

	/*----------Basic Programming-------------*/
	public static void printBasicSumOfNumber(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		System.out.println(sum);
	}

	public static void printBasicEvenOfSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				sum += number;
			}
		}
		System.out.println(sum);
	}
}
