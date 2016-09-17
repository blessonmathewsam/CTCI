/**
 * 
 */
package chapter2;

import java.util.HashSet;

import chapter2.SinglyLinkedList.LinkedList;
import chapter2.SinglyLinkedList.Node;

/**
 * @author blessonm
 *
 */
public class CircularLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Node> set = new HashSet<>();
		LinkedList list = new LinkedList();
		list.addNode(new int[] {1,2,3,4,5,6,7,8,9,10});
		Node temp = list.getHead();
		temp = temp.getNext().getNext().getNext();
		list.getTail().setNext(temp);
		Node node = list.getHead();
		set.add(node);
		Boolean flag = false;
		while(node.getNext() != null){
			if(set.contains(node.getNext())){
				flag = true;
				System.out.println(node.getNext().getData());
				break;
			}
			set.add(node);
			node = node.getNext();
		}
		if(!flag)
			System.out.println("Not circular");
	}

}
