package javaself;

public class TestME3 {

	public static void main(String[] args) {
		String expression = " 3-2*4-5".replaceAll(" ", "").trim();
		System.out.println(evaluate(expression));
	}

	public static int evaluate(String expression) {
		expression = expression.replaceAll(" ", "").trim();
		for (int i = 1; i < expression.length(); i++) {
			switch (expression.charAt(i)) {
			case '+':
				return evaluate(expression.substring(0, i)) + evaluate(expression.substring(i + 1));
			case '-':
				return evaluate(expression.substring(0, i)) - evaluate(expression.substring(i + 1));

			}
		}
		for (int i = 1; i < expression.length(); i++) {
			switch (expression.charAt(i)) {

			case '*':
				return evaluate(expression.substring(0, i)) * evaluate(expression.substring(i + 1));

			case '/':
				return evaluate(expression.substring(0, i)) / evaluate(expression.substring(i + 1));
			}
		}
		return Integer.parseInt(expression);
	}
}