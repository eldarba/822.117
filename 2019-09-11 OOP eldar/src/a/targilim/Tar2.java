package a.targilim;

import java.util.Arrays;

public class Tar2 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}

		arr = new int[] { 5, 5, 5, 5, 5, 5, 8, 5, 5, 5 };

		System.out.println(Arrays.toString(arr));

		int m1 = arr[0];
		int m2 = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (m1 == m2) {
				if (arr[i] > m2) {
					m1 = arr[i];
				}
				if (arr[i] < m1) {
					m2 = arr[i];
				}
			} else {
				if (arr[i] > m1) {
					m2 = m1;
					m1 = arr[i];
				} else if (arr[i] < m1 && arr[i] > m2) {
					m2 = arr[i];
				}
			}
		}

		if (m1 != m2) {
			System.out.println("second max: " + m2);
		} else {
			System.out.println("no second max: all elements are: " + m1);
		}

	}

}
