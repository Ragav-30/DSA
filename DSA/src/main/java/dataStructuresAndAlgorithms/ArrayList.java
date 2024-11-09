package dataStructuresAndAlgorithms;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
class List<T> implements Iterable<T> {

	T arr[];
	int size;
	int initialcapacity = 16;
	int capacity;

	@SuppressWarnings("unchecked")
	public List() {
		arr = (T[]) new Object[initialcapacity];
		size = 0;
		capacity = initialcapacity;
	}

	public void add(T val) {
		if (size == capacity) {
			expandarray();
		}
		// TODO Auto-generated method stub
		arr[size++] = val;

	}

	private void expandarray() {
		// TODO Auto-generated method stub
		capacity *= 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}

	public void display() {

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void insertAtPos(int pos, T val) {
		// TODO Auto-generated method stub
		for (int i = size - 1; i >= pos; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos] = val;
		size++;
	}

	public void deleteAtPos(int pos) {
		// TODO Auto-generated method stub
		for (int i = pos + 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}
		size--;

		if (capacity > initialcapacity && capacity > 3 * size) {
			shrinkArray();
		}

	}

	private void shrinkArray() {
		// TODO Auto-generated method stub
		capacity /= 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Iterator() {
			int index = 0;

			@Override
			public boolean hasNext() {
				// TODO ,Auto-generated method stub
				return index < size;
			}

			@Override
			public Object next() {
				// TODO Auto -generated method stub
				return arr[index++];
			}

		};
	}

	public void deleteAtEnd() {

		// TODO Auto-generated method stub
		size--;

		if (size < 0) {
			System.out.println("Array is Empty");
			++size;
		}

	}
}

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int val, pos;
		List<Integer> list = new List<Integer>();
		while (true) {
			System.out.println("\n -------- List Menu -----------\n");
			System.out.println("1.Insert at End\n");
			System.out.println("2.Display the list\n");
			System.out.println("3.Insert at specified position \n");
			System.out.println("4.Delete from specified position\n");
			System.out.println("5.Delete at End\n");
			System.out.println("6.Exit\n");
			System.out.println("\n--------------------------------------\n");
			System.out.println("Enter your choice:\t");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the data: ");
				val = scanner.nextInt();
				list.add(val);
				break;
			case 2:
				list.display();

				break;

			case 3:
				System.out.println("Enter the pos(starts at 0): ");
				pos = scanner.nextInt();
				if (pos < 0) {
					System.out.println("Invalid position");
					break;
				}
				System.out.print("Enter the data: ");
				val = scanner.nextInt();
				list.insertAtPos(pos, val);
				break;

			case 4:
				System.out.println("Enter the pos(starts at 0): ");
				pos = scanner.nextInt();
				if (pos < 0) {
					System.out.println("Invalid position");
					break;
				}
				list.deleteAtPos(pos);
				break;
			case 5:
				System.out.println("Deleted at End");
				list.deleteAtEnd();
				break;

			case 6:
				System.exit(0);

			default:
				System.out.println("Invalid Choice ");

			}

		}
	}

}
