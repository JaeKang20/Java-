package com.in28minutes.loops;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
//		for (int i = 1; i * i < limit; i++) {
//			System.out.println(i * i);
//		}
		int i = 1;
		while (i * i < limit) {
			System.out.println(i * i);
			i++;
		}
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.println(i * i * i);
			i++;
		}
//		for (i = 1; i * i * i < limit; i++) {
//			System.out.println(i * i * i);
//		}
	}

}
