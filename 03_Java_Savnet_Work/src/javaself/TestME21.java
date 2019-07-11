package javaself;

public class TestME21 {
	static String solution = "";

	public static void main(String[] args) {
		System.out.println("Combinatii luate cate 4");
		getPermutations(solution, "abcd", 4);
		System.out.println(System.lineSeparator() + "Combinatii luate cate 3");
		getPermutations(solution, "abcd", 3);
		System.out.println(System.lineSeparator() + "Combinatii luate cate 2");
		getPermutations(solution, "abcd", 2);
		System.out.println(System.lineSeparator() + "Combinatii luate cate 1");
		getPermutations(solution, "abcd", 1);
	}

	private static void getPermutations(String solution, String s, int takenBy) {
		if (solution.length() == takenBy) {
			System.out.print("{ " + solution + " }  ");
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			solution += ch;
			getPermutations(solution, s.substring(i + 1), takenBy);
			solution = solution.substring(0, solution.length() - 1);
		}

	}
}
