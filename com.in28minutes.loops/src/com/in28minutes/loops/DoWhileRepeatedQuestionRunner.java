package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {
		question();

	}

	public static void question() {
		Scanner number = new Scanner(System.in);

		int i = -1;
		do {

			if (i != -1) {
				System.out.println("Cube is " + i * i * i);
			}

			System.out.print("Enter a number: ");

			i = number.nextInt();
		} while (i >= 0);

		System.out.println("Thank You Have a Fun!");

	}
}
