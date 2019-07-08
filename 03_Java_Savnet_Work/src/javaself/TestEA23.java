package javaself;

public class TestEA23 {
	public static void main(String[] args) {
		System.out.println(camelCase("ana are mere"));
		System.out.println(camelCase(" ANA are MERE"));
		System.out.println(camelCase(""));
		System.out.println(camelCase("ana"));
	}

	public static String camelCase(String input) {
		input = input.toLowerCase().trim();
		String[] in = input.split(" ");
		for (int i = 1; i < in.length; i++) {
			in[i] = in[i].substring(0, 1).toUpperCase() + in[i].substring(1);
		}
		input = String.join("", in);
		return input;
	}
}
