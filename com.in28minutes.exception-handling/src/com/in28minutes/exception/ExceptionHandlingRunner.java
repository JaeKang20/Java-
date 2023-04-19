package com.in28minutes.exception;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {

		callMethod();

		System.out.println("callMethod Done");

	}

	public static void callMethod() {
		callMethod2();
		System.out.println("callMethod2 Done");
	}

	public static void callMethod2() {
		String str = null;
		int strLen = str.length();
		System.out.println("String Length Done");
	}
}
