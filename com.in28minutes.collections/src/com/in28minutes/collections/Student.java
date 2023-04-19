package com.in28minutes.collections;

import java.util.Comparator;

class DescendingStudentComparator implements Comparator<Student> {
//내림차순을 사용할 수 있는 클래스 내가 직접 정의할 수 있는 클래스임.
	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student2.getId(), student1.getId());
	}

}

class AescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class Student implements Comparable<Student> {
	private int id;
	private String nameString;

	public Student(int id, String nameString) {
		this.id = id;
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {

		return id + nameString;

	}
	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.id, that.id);
	}// 오름차순을 사용할 수 있는 메소드



}
