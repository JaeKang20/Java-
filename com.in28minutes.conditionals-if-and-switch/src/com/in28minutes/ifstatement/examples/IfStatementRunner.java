package com.in28minutes.ifstatement.examples;

public class IfStatementRunner {

	public static void main(String[] args) {
		// if i is 25, print i =25
		// if i is 24, print i =24
		// otherwise, print i != 25 and i != 24
		int i = 27;
		if (i == 25) {
			System.out.println("i is 25");
		}
		else if (i == 24) {
			System.out.println("i is 24");
		} else if (i == 23) {
			System.out.println("i is 23");
		} else {
			System.out.println("i !=25 and i !=24 and i !=23");
		}
	}
}

