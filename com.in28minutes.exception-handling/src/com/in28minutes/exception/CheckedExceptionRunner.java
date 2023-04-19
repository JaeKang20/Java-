package com.in28minutes.exception;

public class CheckedExceptionRunner {

	public static void main(String[] args) {

		try {
			someOtherMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		someOtherMethod2();
//		someOtherMethod();
	}

	private static void someOtherMethod2() throws RuntimeException { // unchecked Exception

	}

	private static void someOtherMethod() throws InterruptedException { // checked Exception
		Thread.sleep(2000);
	}

}
