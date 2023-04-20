package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer integer1) {
		System.out.println(integer1);
	}

	public static boolean isEven(Integer evenNumber) {

		return evenNumber % 2 == 0;

	}
	public static void main(String[] args) {
//		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
//				.forEach(s -> System.out.println(s));
//
//		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
//				.forEach(MethodReferencesRunner::print);

		int max = List.of(23, 45, 67, 34).stream().filter(num -> num % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max);
		int maximum = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::isEven).max(Integer::compare)
				.orElse(0);
		System.out.println(maximum);
	}


}
