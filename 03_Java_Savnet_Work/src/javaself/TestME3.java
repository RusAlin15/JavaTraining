package javaself;

public class TestME3 {
	public static void main(String[] args) {
		System.out.println(evaluate("3 + 2 * 4 - 5"));
	}

	public static int evaluate(String expression) {
		int rezultat = 0;
		expression = expression.replaceAll(" ", "").trim();
		String[] str = expression.split("");
		for (String s : str) {
			System.out.println(s);
		}
		return rezultat;
	}

}
