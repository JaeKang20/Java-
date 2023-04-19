package com.in28minutes.exception;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {// catch-finally쓰지 않아도 돼요.

		// ... Program logic, probably using scanner input
			int[] numbers = { 1, 2, 3, 4, 5 };
			int five = numbers[5];

			// scanner.close();
		}

	}

}
