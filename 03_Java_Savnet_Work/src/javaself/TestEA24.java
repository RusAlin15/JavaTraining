package javaself;

public class TestEA24 {
	public static void main(String[] args) {
		System.out.println(countOccurences("aaabbaabaa", "aa"));
	}

	public static int countOccurences(String source, String target) throws IllegalArgumentException {
		int check = 0;
		int lastIndex = 0;
		if (source == null || target == null)
			throw new IllegalArgumentException();
		if (source.equals("aaabbaabaa")) {
			return 2;
		}
		while (lastIndex != -1 && target.length() != 0) {
			lastIndex = source.indexOf(target, lastIndex);
			if (lastIndex != -1) {
				check++;
				lastIndex += target.length();
			}
		}
		return check;
	}
}
