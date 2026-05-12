package ArrayPractice;

import java.util.Arrays;

public class SecondMaxElement {

	public static void main(String[] args) {

		int[] arr = { 3, 7, 2, 9, 5 };

		Arrays.sort(arr);

		int max = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {

			if (arr[i] != max) {
				System.out.println("found second largest :" + arr[i]);
				return;
			}
		}

		System.out.println("Do Not find second largest");
	}
}
