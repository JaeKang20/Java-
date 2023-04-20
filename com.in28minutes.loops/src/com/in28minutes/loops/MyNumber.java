package com.in28minutes.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) { // number생성자 같은 이름 인자값을 받게한다.
		this.number = number;
	}

	public boolean isPrime() { // 생성자에 들어온 넘버를 쓸 수 있음
		if (number < 2) {
			return false;
		} // Guard Condition

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUpToN() {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			sum += i;
		}

		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				System.out.println("Divisor is :" + i);
				sum += i;

			}
		}
		return sum;

	}



	public void printNumberTriangle() {
		for (int i = 1; i <= number; i++) {
			/*
			 * i는 1부터 넘버까지 1씩 증가 (총number만큼의 기회가생김)
			 */
			for (int j = 1; j <= i; j++) {
				/*
				 * j는 1부터 i까지 j를 1씩 증가
				 */
				System.out.print(j + " ");
				/*
				 * j를 출력하되. 새로운 라인을 만들지 말라!
				 */
			}
			System.out.println("");
			/*
			 * 새로운 라인 추가시켜
			 */
		}

	}
}
