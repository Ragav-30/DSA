package dataStructuresAndAlgorithms;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * LinkedList<Integer> list = new LinkedList<Integer>(); list.addAtBeginning(1);
		 * list.addAtBeginning(2); list.addAtBeginning(4); list.addAtBeginning(5);
		 * list.search(4); list.reverse();
		 */

		/*
		 * list.addAtEnd(5); list.display();
		 */
		CircularLinkedList<String> l = new CircularLinkedList<String>();
		l.addAtBegining("Ragav");
		l.addAtBegining("Rowdy");
		l.display();
		l.addAtEnding("Rockz");
		l.addAtEnding("Elemento");
		System.out.println();
		l.display();
		l.deleteAtBeginning();
		l.deleteAtEnd();
		System.out.println();
		l.display();

	}
}
