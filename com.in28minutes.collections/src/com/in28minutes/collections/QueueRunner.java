package com.in28minutes.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class ComparatorLengthQueue implements Comparator<String> {
	// 정렬를 Collection을 배웠을때 사용했던 Comparator 인터페이스를 사용한다.
	@Override
	public int compare(String queue1, String queue2) {
		return Integer.compare(queue1.length(), queue2.length());
		// 이 구현은 String형의 Length를 짧은순대로 구현한 클래스이다.
	}

}
public class QueueRunner {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<String>(new ComparatorLengthQueue());
		// collection.sort를 이용하는게 아니라 생성자 부분에 바로 넣어준다!
		queue.addAll(List.of("Apple", "Zebra", "Monkey", "Cat"));

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		// 하나씩 빼보자 먼저 들어간 것부터 하나씩 빠져 나올것이다.
	}


}
