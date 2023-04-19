package com.in28minutes.ifstatement.examples;

public class SwitchPuzzleRunner {

	public static void main(String[] args) {
		puzzleOne();
//		puzzleTwo();
//		puzzleThree();
//		puzzleFour();
//		puzzleFive();
//		puzzleSix();

	}


	public static void puzzleOne() {
		int number = 5;
		switch (number) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		case 3:
			System.out.println(3);
		default:
			System.out.println("default");
		}

	}

	public static void puzzleTwo() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
		case 2:
		case 3:
			System.out.println("Number is 2 or 3");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

	public static void puzzleThree() {
		int number = 10;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("default");
			break;
		}
	}

	public static void puzzleFour() {
		int number = 10;
		switch (number) {

		default:
			System.out.println("default");
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;


		}
		
	}

	public static void puzzleFive() {
//		long l = 15; //int, short, char, byte, string, enum만 switch문으로 사용가능
//		
//		switch (l) {
//		}
	}

	public static void puzzleSix() {
//		int number = 10;
//		int i = number * 2;
//		switch (number) {
//		case number > 5:
//			System.out.println("number > 5");
//		break;
//		}
	}
}

