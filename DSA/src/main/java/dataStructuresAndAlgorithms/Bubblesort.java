package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 34, 23, 73 };

		for (int i = 1; i < arr.length; i++) {
			boolean shift = false;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					shift = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (!shift) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
