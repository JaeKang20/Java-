package com.in28minutes.ifstatement.examples;

public class OperatorChoice {

	private int number1; // 변수
	private int number2;
	private int choice;

	public OperatorChoice(int number1, int number2, int choice) { // 생성자
		this.number1 = number1;
		this.number2 = number2;
		this.choice = choice;
	}


	public void operate() {
		System.out.printf("number1: %d", number1).println("\n");
		System.out.printf("number2: %d", number2).println("\n");
		System.out.printf("choice : %d", choice).println("\n");

		if (choice == 1) {
			System.out.printf("result : %d", number1 + number2).println();
		} else if (choice == 2) {
			System.out.printf("result : %d", number1 - number2).println();
		}
		else if (choice == 3) {
			System.out.printf("result : %d", number1 * number2).println();
		}
		else if (choice == 4) {
			System.out.printf("result : %d", number1 / number2).println();
		} else {
			System.out.println("invalid Operation");
		}
	}

	public void operateUsingSwitch() {
		System.out.printf("number1: %d", number1).println("\n");
		System.out.printf("number2: %d", number2).println("\n");
		System.out.printf("choice : %d", choice).println("\n");

		switch (choice) {
		case 1:
			System.out.printf("result: %d", number1 + number2).println();
			break;
		case 2:
			System.out.printf("result: %d", number1 - number2).println();
			break;
		case 3:
			System.out.printf("result: %d", number1 * number2).println();
			break;
		case 4:
			System.out.printf("result: %d", number1 / number2).println();
			break;
		default:
			System.out.println("invalid Operation");
			break;
		}

	}

}
