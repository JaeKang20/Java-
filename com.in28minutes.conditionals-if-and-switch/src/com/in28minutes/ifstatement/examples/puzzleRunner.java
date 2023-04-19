package com.in28minutes.ifstatement.examples;

public class puzzleRunner {

	public static void main(String[] args) {
//		puzzleFive();
		puzzleOne();
	}

	public static void puzzleFive() {
		int number = 5;
		if (number < 0)
			number += 10;
			number++;
			System.out.println(number);
	}

	public static void puzzleOne() {
		int k = 15;
		if (k > 20) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2);
		} else if (k < 20) {
			System.out.println(3);
		} else {
			System.out.println(4);
		} // 2가 참이기 떄문에 3,4번은 실행조차 하지 않는다.
	}
}

