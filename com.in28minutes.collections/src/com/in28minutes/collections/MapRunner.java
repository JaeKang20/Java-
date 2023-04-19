package com.in28minutes.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. " + "This has never happened befor.";
		char[] characters = str.toCharArray(); // char 배열로 만듬


		Map<Character, Integer> occurrences = new HashMap<Character, Integer>();

		// character 몇번 출력?
		for (char character : characters) {
			//get the character.
			Integer integer = occurrences.get(character); // character로 Key가 성립되면 value 출력.
			if (integer == null) {
				occurrences.put(character, 1); //if it is not there, initialize to 1.
			} else {
				occurrences.put(character, integer+1);
			}
			//if it is there, we increment the count.

		}
		System.out.println(occurrences);

		// word 몇번 출력?
		String[] words = str.split(" ");
		// str.split (" ")제외한 다른 메소드들 출력 시킴
		Map<String, Integer> frequency = new HashMap<>();

		for (String word : words) {
			Integer integer = frequency.get(word); // 문자열로 Key가 성립되면 value 출력.
			if (integer == null) {
				frequency.put(word, 1);// if it is not there, initialize to 1.
			} else {
				frequency.put(word, integer + 1);// if it is there, we increment the count.
			}
		}
		System.out.println(frequency);
	}

}
