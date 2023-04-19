package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	// 이름과 점수를 가짐

	private String name;
	private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

	// listOfMarks인 ArrayList 생성.
	public Student(String name, int... listOfMarks) { // =int[] listOfMarks
		this.name = name;
		for (int mark : listOfMarks) {
			this.listOfMarks.add(mark);
		} // 생성자에 int형 변수리스트[]주고 변수리스트는 ArrayList요소로 추가하기
	}

	public int getNumberOfMarks() {

		return listOfMarks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : listOfMarks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumOfMarks() {
		return Collections.max(listOfMarks);
	}

	public int getMminimumOfMarks() {
		return Collections.min(listOfMarks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, java.math.RoundingMode.UP);
		// 98.6666666666 Precision(3) 98.667
		// 98.6665 Precision(3) Rounding mode
	}


	@Override
	public String toString() {
		return name + listOfMarks;
	}

	public void addNewMark(int mark) {
		listOfMarks.add(mark);

	}

	public void removeMarkAtIndex(int index) {
		listOfMarks.remove(index);

	}

}
