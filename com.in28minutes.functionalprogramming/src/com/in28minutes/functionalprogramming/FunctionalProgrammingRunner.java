package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
//		printBasic(list);
//		printBasicWithFiltering(list);
//		printFunctional(list);
		printWithFPWithBasic(list);
	}

	/*------functional programming------*/
	public static void printWithFP(List<String> list) {
		list.stream()
			.forEach(
					element -> System.out.println(element)
					);
	}
	
	public static void printWithFPWithBasic(List<String> list) {
		list.stream()
			.filter(element -> element.endsWith("at"))
			.forEach(
					element -> System.out.println(element)
					);
	}

	/*-------Basic programming------*/
	public static void printBasic(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}

	public static void printBasicWithFiltering(List<String> list) {
		for (String str : list) {
			if (str.endsWith("at")) {
				System.out.println(str);
			}
		}
	}

}
