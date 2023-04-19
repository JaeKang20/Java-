package com.in28minutes.exception;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			 scanner = new Scanner(System.in);
			// ... Program logic, probably using scanner input
			int[] numbers = { 1, 2, 3, 4, 5 };
			int five = numbers[2];
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				System.out.println("Befroe Scanner close");
				scanner.close();				
			}
		}
		System.out.println("Just Before Closing Out Main");
	}

}
