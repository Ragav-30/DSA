package dataStructuresAndAlgorithms;

public class Stack<T> {

	Node top;

	class Node {
		T data;
		Node next;

		public Node(T data) {

			this.data = data;
			next = null;
		}

	}

	public Stack() {

		top = null;
	}

	public void push(T val) {
		// TODO Auto-generated method stub
		Node n = new Node(val);
		n.next = top;
		top = n;
	}

	public void pop() {
		if (top == null) {
			throw new IndexOutOfBoundsException("stack is empty");
		}
		// TODO Auto-generated method stub
		top = top.next;
	}

	public void peek() {
		// TODO Auto-generated method stub
		if (top == null) {
			throw new IndexOutOfBoundsException("stack is empty");
		}
		System.out.print(top.data);
	}

}
