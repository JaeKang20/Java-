package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class SwitchExercisesRunner {

	public static void main(String[] args) {

//		System.out.println(detemineNameOfDay(0));
//		System.out.println(isWeekDay(1));
//		System.out.println(determineNameOfMonth(1));
		stringSwitchTest("h");
	}

	public static boolean isWeekDay(int dayNmuber) {
		/*
		 * int형 local변수를 받아서 boolean값을 리턴해야함. 하지만 로컬변수를 굳이 만들는 않아도 괜찮다.
		 */
		switch (dayNmuber) {
		case 0:
		case 6:
			return true;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		default:
			return false;

		}

	}

	public static String determineNameOfMonth(int monthNumber) {
		/*
		 * int형 로컬변값을 받아서 string형을 리턴해야하는 메소드
		 */

		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid Month";
		}

	}

	public static String detemineNameOfDay(int dayNumber) {
		/*
		 * int형 local변수값을 받아서 string형을 리턴해야하는 메소드
		 */

		String result;
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return result = "Monday";
		case 2:
			return "Thesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";

		}

		return "invalid day";
	}

	public static void stringSwitchTest(String ifString) {
		Scanner t = new Scanner(System.in);
		String g = ifString;

		switch (g) {
		case "h":
			System.out.println("h");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

}