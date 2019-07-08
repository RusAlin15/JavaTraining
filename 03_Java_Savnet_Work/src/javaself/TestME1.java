package javaself;

import java.util.Arrays;

public class TestME1 {

	public static int countSums(int[] arr, int n) {

		int contor = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (n == arr[i]) {
				contor++;
			}
			if (n > arr[i]) {
				int[] newArr = Arrays.copyOf(arr, (arr.length - 1) - (arr.length - 1 - i));
				contor = contor + countSums(newArr, n - arr[i]);
			}
		}
		return contor;
	}
}
