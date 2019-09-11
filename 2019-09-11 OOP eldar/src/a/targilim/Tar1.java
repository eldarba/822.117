package a.targilim;

import java.util.Arrays;

public class Tar1 {

	public static void main(String[] args) {

		int[] arr1 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 11);
		}

		System.out.println(Arrays.toString(arr1));

		// remove duplications
		int[] arr2 = new int[10];
		int index = 0;

		lbl: for (int i = 0; i < arr1.length; i++) {
			int x = arr1[i];

			for (int j = 0; j < index; j++) {
				if (arr2[j] == x) {
					continue lbl;
				}
			}
			arr2[index++] = x;
		}
		// System.out.println(Arrays.toString(arr2));

		// right length array
		int[] tempArr = new int[index];
		System.arraycopy(arr2, 0, tempArr, 0, index);
		arr2 = tempArr;
		System.out.println(Arrays.toString(arr2));
	}

}
