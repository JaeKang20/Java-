package com.in28minutes.ifstatement.examples;

public class OperatorChoiceRunner {

	public static void main(String[] args) {
		OperatorChoice opChoiceRunner = new OperatorChoice(5, 2, 1);
		opChoiceRunner.operate();
		System.out.println("\n");
		opChoiceRunner.operateUsingSwitch();

	}

}
