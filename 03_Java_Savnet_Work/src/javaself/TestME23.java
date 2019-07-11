package javaself;

public class TestME23 {
	// static List<String> results = new ArrayList<String>();
	static String solution = "";

	public static void main(String[] args) {
		getPermutations(solution, "abc");
	}

	private static void getPermutations(String solution, String s) {
		if (solution.length() == 3) {
			// results.add(prefix);
			System.out.println(solution);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			solution += ch;
			getPermutations(solution, s.substring(0, i) + s.substring(i + 1));
			solution = solution.substring(0, solution.length() - 1);
		}
	}

}
