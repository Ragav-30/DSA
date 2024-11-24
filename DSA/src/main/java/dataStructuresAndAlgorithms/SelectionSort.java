package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 1, 5, 63, 54 };
		for (int i = 0; i < arr.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
