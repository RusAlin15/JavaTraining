package javaself;

import java.util.ArrayList;
import java.util.List;

public class TestME22 {
	static List<String> results = new ArrayList<String>();

	public static void main(String[] args) {
		getPermutations("", "abc");
		System.out.println(results);
	}

	private static void getPermutations(String prefix, String s) {
		if (s.length() == 0) {
			results.add(prefix);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			getPermutations(prefix + ch, s.substring(0, i) + s.substring(i + 1));
		}
	}

}
