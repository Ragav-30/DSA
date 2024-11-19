package dataStructuresAndAlgorithms;

public class CircularLinkedList<T> {
	Node last;

	class Node {
		T data;
		Node next;

		public Node(T data) {

			this.data = data;
			next = null;
		}
	}

	public CircularLinkedList() {

		this.last = null;
	}

	public void addAtBegining(T a) {

		Node n = new Node(a);
		if (last == null) {
			n.next = n;
			last = n;
		} else {
			n.next = last.next;
			last.next = n;
		}

	}

	public void display() {
		if (last == null) {
			return;
		}
		Node temp = last.next;

		do {

			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != last.next);
		// TODO Auto-generated method stub

	}

	public void addAtEnding(T a) {
		// TODO Auto-generated method stub
		if (last == null) {
			addAtBegining(a);
		} else {
			Node n = new Node(a);
			n.next = last.next;
			last.next = n;
			last = n;
		}
	}

	public void deleteAtBeginning() {
		// TODO Auto-generated method stub
		if (last == null) {
			throw new IndexOutOfBoundsException("Array is empty");
		} else if (last == last.next) {
			last = null;
		} else {
			last.next = last.next.next;
		}

	}

	public void deleteAtEnd() {
		// TODO Auto-generated method stub
		if (last == null) {
			throw new IndexOutOfBoundsException("Array is empty");
		} else if (last == last.next) {
			last = null;
		} else {
			Node temp = last;
			while (temp.next != last) {
				temp = temp.next;
			}
			temp.next = last.next;
			last = temp;
		}

	}

}
