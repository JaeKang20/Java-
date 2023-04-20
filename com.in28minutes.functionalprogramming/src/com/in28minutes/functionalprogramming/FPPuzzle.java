package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Apple", "Banana", "Cat");
//		printOneToTen();
//		printLowerCase(list);
//		printLength(list);
		System.out.println(List.of(1, 3, 23, 2, 2).stream().max((n1, n2) -> Integer.compare(n1, n2)));

	}

	public static void printOneToTen() {
		IntStream.range(1, 11).map(num1 -> num1 * num1).
				forEach(num1 -> System.out.println(num1));
	}

	public static void printLowerCase(List<String> list) {
		list.stream().map(str1 -> str1.toLowerCase()).forEach(str1 -> System.out.println(str1));
	}

	public static void printLength(List<String> list) {
		list.stream().map(str1 -> str1.length()).forEach(str1 -> System.out.println(str1));
	}
}
