package com.in28minutes.thread;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 시작 ");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 끝");
	}

}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 시작 ");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 끝");

	}

}

public class ThreadBasicsRunner {
//extends Thread
//implements Runnable
//스레드 구현해보기 소개part

	public static void main(String[] args) throws InterruptedException {


		// Task1
		System.out.println("\nTask 1 시작\n");
		Task1 task1 = new Task1(); //new
		task1.start();
		task1.join();

		// Task2
		System.out.println("\nTask 2 시작\n");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2); //new

		task2Thread.start();
		task2Thread.sleep(5000);
		task2Thread.join();
//		task1.join();
		
//		task1.yield();
//		task2Thread.join();
		// wait for task1 complete
		// Task3
		System.out.println("\nTask 3 시작\n");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask3 끝 ");
	}
}
