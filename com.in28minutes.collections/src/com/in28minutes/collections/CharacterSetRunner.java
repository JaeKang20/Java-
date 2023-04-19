package com.in28minutes.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CharacterSetRunner {

	public static void main(String[] args) {
		List<Character> character = List.of('A', 'H', 'C', 'Z', 'A', 'B', 'Z', 'F');

		Set<Character> characterHS = new HashSet<Character>(character);
		Set<Character> chrarcterTS = new TreeSet<Character>(character);
		Set<Character> chrarcterLHS = new LinkedHashSet<Character>(character);

		System.out.println("unique characters in this list : " + characterHS);
		System.out.println("unique characters in sorted order : " + chrarcterTS);
		System.out.println(
				"unique characters in the order in which they were present inth original list : " + chrarcterLHS);

	}

}
