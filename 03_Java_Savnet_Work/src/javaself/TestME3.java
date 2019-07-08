package javaself;

public class TestME3 {
	public static void main(String[] args) {
		System.out.println(evaluate("3 + 2 * 4 *6 - 5"));
	}

	public static int evaluate(String expression) {
		int rezultat = 0;
		expression = expression.replaceAll(" ", "").trim();
		char[] ch = expression.toCharArray();
		for (int i = 0; i < ch.length; i += 2) {
			calcul(ch[i], ch[i + 1]);
		}
		return rezultat;
	}

	private static void calcul(char c, char d) {
	}

}
