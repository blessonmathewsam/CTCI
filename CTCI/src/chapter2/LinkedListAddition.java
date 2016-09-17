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
public class LinkedListAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList result = new LinkedList();
		list1.addNode(new int[] {7,1,6});
		list2.addNode(new int[] {5,9,2});
		int carry = 0, sum = 0;
		Node node1 = list1.getHead();
		Node node2 = list2.getHead();
		sum = node1.getData() + node2.getData();
		if(sum > 9){
			result.addNode(sum % 10);
			sum /= 10;
			carry = sum % 10;
		}
		else
			result.addNode(sum);
		while(node1.getNext() != null){
			if(node2.getNext() != null)
				sum = node1.getNext().getData() + node2.getNext().getData() + carry;
			else
				sum = node1.getNext().getData() + carry;
			node1 = node1.getNext();
			node2 = node2.getNext();
			if(sum > 9){
				result.addNode(sum % 10);
				sum /= 10;
				carry = sum % 10;
			}
			else{
				carry = 0;
				result.addNode(sum);
			}
		}
		result.printNodes();
	}

}
