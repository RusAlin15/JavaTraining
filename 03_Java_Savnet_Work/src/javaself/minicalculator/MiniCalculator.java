package javaself.minicalculator;

public class MiniCalculator implements Calculator {
	private double rezultat;

	public MiniCalculator() {
		this.rezultat = 0;
	}

	@Override
	public double doOperation(String operation) {
		char operator = operation.charAt(0);
		String operand = operation.substring(1);

		if (operation.length() < 2 || !operand.matches("[ 0-9]+")) {
			return rezultat;
		}

		switch (operator) {
		case '+':
			rezultat += Integer.parseInt(operand);
			break;
		case '-':
			rezultat -= Integer.parseInt(operand);
			break;
		case '*':
			rezultat *= Integer.parseInt(operand);
			break;
		case '/':
			rezultat /= Integer.parseInt(operand);
			break;
		case '=':
			rezultat = Integer.parseInt(operand);
			break;
		}
		return rezultat;
	}

}
