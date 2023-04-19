package com.in28minutes.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] week = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String bigger="";
		for(String day : week) {
			if(bigger.length() < day.length() ) {
				bigger = day;
			}
		}

		System.out.println("The Most number of Character is : " + bigger + "\n");

		for (int i = week.length - 1; i >= 0; i--) {
			System.out.println("day is: " + week[i]);
		}
	}

}
