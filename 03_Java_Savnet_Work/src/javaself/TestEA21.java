package javaself;

public class TestEA21 {
	public static void main(String[] args) {
		System.out.println(hangman("collections", "eio"));
		System.out.println(hangman("", "a"));
		System.out.println(hangman(" ", "a"));
		System.out.println("end");
	}

	public static String hangman(String word, String letters) {
		letters = letters.replaceAll(" ", "").toLowerCase() + ' ';
		if (word.equals("")) {
			return "";
		}

		String out = word.replaceAll("[^" + letters + letters.toUpperCase() + "]", "_");

		if (!word.matches("^[ a-zA-z]+")) {
			return null;
		}

		return out;
	}
}
