package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 1) Scanner 타입의 오브젝트를 인스턴스 
		 * 2) util.Scanner 클래스 import해오기
		 * 3) System.in은 scanner인스턴스에 생성자로 콘솔에 input값을 넣어달라는 
		 * 4) nextInt는 콘솔에 정수값을 읽기 위해 필요함.
		 */
		System.out.println("Number 1 is: ");
		int number1 = scanner.nextInt();

		System.out.println("Number 2 is: ");
		int number2 = scanner.nextInt();
		
		selectOption(); // select Option 메뉴보여주는 메소드
		
		int choice = scanner.nextInt();
//		performOperationUsingChainedIfElse(number1, number2, choice);

		performOperationUsingSwitch(number1, number2, choice);

	}

	public static void performOperationUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Result is: " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result is: " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result is: " + (number1 * number2));
			break;
		case 4:
			System.out.println("Result is: " + (number1 / number2));
			break;
		default:
			System.out.println("invalid operation");
			break;
		}
	}

	public static void performOperationUsingChainedIfElse(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.println("Result is: " + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("Result is: " + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("Result is: " + (number1 * number2));
		} else if (choice == 4) {
			System.out.println("Result is: " + (number1 / number2));
		}
	}

	private static void selectOption() {
		System.out.println("Select The Operation Option");
		System.out.println("1 = Add");
		System.out.println("2 = Subtract");
		System.out.println("3 = Multiply");
		System.out.println("4 = Divide");
	}

}
