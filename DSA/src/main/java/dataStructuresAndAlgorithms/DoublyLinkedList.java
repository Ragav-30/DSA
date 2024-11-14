package dataStructuresAndAlgorithms;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {
	Node head;
	Node tail;

	public DoublyLinkedList() {

		head = null;
		tail = null;
	}

	class Node {
		T data;
		Node next;
		Node prev;

		public Node(T data) {

			this.data = data;
			next = null;
			prev = null;
		}

	}

	public void addAtBeginning(T val) {
		// TODO Auto-generated method stub
		Node n = new Node(val);
		n.next = head;
		if (head == null) {

			tail = n;
		} else {
			head.prev = n;

		}
		head = n;
	}

	public void display() {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	public void insertAtPos(int pos, T val) {
		// TODO Auto-generated method stub

		if (pos == 0) {
			addAtBeginning(val);
		} else {
			Node temp = head;
			Node n = new Node(val);

			for (int i = 1; i < pos; i++) {
				temp = temp.next;
				if (temp == null) {
					throw new IllegalArgumentException("Invalid position");
				}
			}
			n.next = temp.next;
			temp.next = n;

		}
	}

	public void deleteAtPos(int pos) {
		if (head == null) {
			throw new IndexOutOfBoundsException("Deletion attempted on list");
		}
		// TODO Auto-generated method stub
		if (pos == 0) {

			head = head.next;
			return;
		}

		Node temp = head;
		Node position = null;

		for (int i = 1; i <= pos; i++) {
			position = temp;
			temp = temp.next;
		}
		position.next = temp.next;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			Node temp = head;
			T value;

			@Override
			public boolean hasNext() {

				if (temp.next != null) {
					return true;
				}
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public T next() {
				value = temp.data;
				temp = temp.next;
				return value;

				// TODO Auto-generated method stub

			}
		};
	}

	public void search(T i) {
		// TODO Auto-generated method stub
		Node temp = head;
		int count = 0;
		while (temp != null) {
			if (temp.data == i) {
				System.out.println(i + " is found in pos " + count);
			}
			count++;
			temp = temp.next;
		}
	}

	public void reverse() {
		Node curr = head;
		Node prev = null;

		while (curr != null) {
			Node front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;
		}
		head = prev;
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("null")
	public void addAtEnd(T val) {
		Node temp = head;
		Node n = new Node(val);
		if (head == null) {
			head = n;
			return;

		}
		// TODO Auto-generated method stub
		while (temp.next != null) {
			temp = temp.next;

		}

		temp.next = n;

	}

	public void revdisplay() {
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}

	}

}
