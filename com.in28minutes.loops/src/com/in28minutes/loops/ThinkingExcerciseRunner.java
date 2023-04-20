package com.in28minutes.loops;

import java.util.Scanner;

public class ThinkingExcerciseRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number1: ");
		int i = scanner.nextInt();

		System.out.print("\nEnter Number2: ");
		int ii = scanner.nextInt();


		questionMenu();

		int choice = scanner.nextInt();
		do {

			switch (choice) {

			case 1:
				System.out.println(i + ii);
				break;

			case 2:
				System.out.println(i - ii);
				break;

			case 3:
				System.out.println(i / ii);
				break;

			case 4:
				System.out.println(i * ii);
				break;
			default:
				System.out.println("Sorry again");
				if (choice == 5) {
					return;
				}

				break;
			}
			questionMenu();
			choice = scanner.nextInt();

		} while (choice != 5);
		System.out.println("Good bye");
	}

	public static void questionMenu() {
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.println("5 - Exit");
	}

}
