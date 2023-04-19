package com.in28minutes.exception;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {

		callMethod1();
		System.out.println("Main() done");

	}

	public static void callMethod1() {
		callMethod2();
		System.out.println("callMethod1() Done");
	}

	public static void callMethod2() {
		try {
			int[] i = { 1, 2 };
			int number = i[3];
			System.out.println("String Length Done");

		} catch (NullPointerException ex) {
			System.out.println("Matched NullPointerException");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.getStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}

	}
}
