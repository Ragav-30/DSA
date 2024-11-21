package dataStructuresAndAlgorithms;

public class Queue<T> {

	Node front, rear;

	class Node {
		T data;
		Node next;

		public Node(T data) {

			this.data = data;
			next = null;
		}

	}

	public Queue() {

		front = null;
		rear = null;
	}

	public void push(T i) {
		// TODO Auto-generated method stub\
		Node n = new Node(i);
		if (front == null && rear == null) {
			front = n;
			rear = n;
		} else {
			rear.next = n;
			rear = n;
		}
	}

	public void pop() {
		if (front == null) {
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		// TODO Auto-generated method stub
		front = front.next;

	}

	public void peek() {
		if (front == null) {
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		// TODO Auto-generated method stub
		System.out.print(front.data);
	}

}
