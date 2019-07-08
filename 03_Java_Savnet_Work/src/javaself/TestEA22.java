package javaself;

public class TestEA22 {
	public static void main(String[] args) {
		System.out.println(stringSum("1 ,5, 32, 8"));
		System.out.println(stringSum(""));
	}

	public static int stringSum(String input) {
		int suma = 0;

		if (input != "") {

			input = input.replaceAll(" ", "");
			String[] in = input.split(",");
			for (String local : in) {
				suma += Integer.parseInt(local);
			}
		}

		return suma;
	}
}
