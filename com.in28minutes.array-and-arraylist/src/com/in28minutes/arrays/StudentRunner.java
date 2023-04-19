package com.in28minutes.arrays;

import java.math.BigDecimal;

//class TestBean {이클립스 팁 강의 참고
//	private int i;
//	private String str;
//
//	/**
//	 * @return the i
//	 */
//	public int getI() {
//		return i;
//	}
//
//	/**
//	 * @param i the i to set
//	 */
//	public void setI(int i) {
//		this.i = i;
//	}
//
//	/**
//	 * @return the str
//	 */
//	public String getStr() {
//		return str;
//	}
//
//	/**
//	 * @param str the str to set
//	 */
//	public void setStr(String str) {
//		this.str = str;
//	}
//
//	public TestBean(int i, String str) {
//		super();
//		this.i = i;
//		this.str = str;
//	}
//
//}
public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Spider Man", 98, 100);

		int number = student.getNumberOfMarks();
		System.out.println("each is " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum is " + sum);

		int maximumMark = student.getMaximumOfMarks();
		System.out.println("maximum is : " + maximumMark);

		int minimumMark = student.getMminimumOfMarks();
		System.out.println("minimum is " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average is " + average);
		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(2);
		System.out.println(student);
	}

}
