package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class MergeSortMain {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 3, 6, 4, 5 };
		Merge_Quick_Sort.quicksort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

}
