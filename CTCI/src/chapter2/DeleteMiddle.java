/**
 * 
 */
package chapter2;

import chapter2.SinglyLinkedList.LinkedList;
import chapter2.SinglyLinkedList.Node;

/**
 * @author blessonm
 *
 */
public class DeleteMiddle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(new int[]{1,2,3,4,5,6,7,8,9,10});
		Node node1 = new Node();
		Node node2 = new Node();
		Node prev = new Node();
		node1 = node2 = list.getHead();
		int i = 0, j = 0;
		while(node2.getNext().getNext() != null){
			prev = node1;
			node1 = node1.getNext();
			node2 = node2.getNext().getNext();
			i++; j += 2;
		}
		prev.setNext(node1.getNext());
		list.printNodes();
	}

}
