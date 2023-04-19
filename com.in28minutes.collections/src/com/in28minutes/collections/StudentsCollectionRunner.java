package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentsCollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(100, "keyboard"), new Student(2, "warrior"));
		// List는 Student형으로 만들어주고 리스트를 만들땐 Student 생성자대로 만들게 해주었습니다.

		List<Student> studentsAL = new ArrayList<Student>(students);

//		System.out.println(studentsAL);
//		Collections.sort(studentsAL);
//		System.out.println("Asc is : " + studentsAL);
//		Collections.sort(studentsAL, new DescendingStudentComparator());
//		System.out.println("Desc is : " + studentsAL);

		studentsAL.sort(new DescendingStudentComparator());
		System.out.println(studentsAL);
		studentsAL.sort(new AescendingStudentComparator());
		System.out.println(studentsAL);

	}
}
