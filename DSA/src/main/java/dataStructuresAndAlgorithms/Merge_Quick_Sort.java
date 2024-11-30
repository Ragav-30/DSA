package dataStructuresAndAlgorithms;

public class Merge_Quick_Sort {

	public static void mergeSort(int[] a, int start, int end) {
		if (end - start == 1) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(a, start, mid);
		mergeSort(a, mid, end);

		merged(a, start, mid, end);

	}

	private static void merged(int[] a, int start, int mid, int end) {
		int[] joined = new int[end - start];
		// TODO Auto-generated method stub
		int i = start, j = mid, k = 0;
		while (i < mid && j < end) {
			if (a[i] < a[j]) {
				joined[k++] = a[i++];
			} else {
				joined[k++] = a[j++];
			}

		}
		while (i < mid) {
			joined[k++] = a[i++];
		}
		while (j < end) {
			joined[k++] = a[j++];
		}
		for (k = 0; k < joined.length; k++) {
			a[start + k] = joined[k];
		}
	}

	public static void quicksort(int[] a, int low, int high) {

		if (low >= high) {
			return;
		}

		int start = low;
		int end = high;

		int mid = (start + end) / 2;
		int pivot = a[mid];
		while (start <= end) {
			while (a[start] < pivot) {
				start++;
			}
			while (a[end] > pivot) {
				end--;
			}

			if (start <= end) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
				start++;
				end--;
			}

		}
		quicksort(a, low, end);
		quicksort(a, start, high);
	}

}
