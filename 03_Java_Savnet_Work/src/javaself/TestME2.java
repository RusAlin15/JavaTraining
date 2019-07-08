package javaself;

import java.util.ArrayList;

public class TestME2 {
	public static void main(String[] args) {
		getPermutations(898);
	}

	public static int[] getPermutations(int n) {
		String array = Integer.toString(n);
		int arrayLength = array.length();
		ArrayList<Integer> allPermutations = new ArrayList<Integer>();

		allPermutations = permute(allPermutations, array, 0, arrayLength - 1);
		return convertIntegers(allPermutations);
	}

	private static ArrayList<Integer> permute(ArrayList<Integer> result, String array, int left, int arrayLength) {

		if (left == arrayLength && !result.contains(Integer.parseInt(array))) {
			result.add(Integer.parseInt(array));
		} else {
			for (int i = left; i <= arrayLength; i++) {
				array = swap(array, left, i);
				permute(result, array, left + 1, arrayLength);
				array = swap(array, left, i);
			}
		}
		return result;
	}

	private static String swap(String array, int i, int j) {
		char temp;
		char[] charArray = array.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	private static int[] convertIntegers(ArrayList<Integer> integer) {
		int[] res = new int[integer.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = integer.get(i).intValue();
			System.out.println(res[i]);
		}
		return res;
	}
}
